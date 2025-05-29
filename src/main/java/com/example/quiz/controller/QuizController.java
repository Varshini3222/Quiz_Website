package com.example.quiz.controller;

import com.example.quiz.model.*;
import com.example.quiz.repository.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuestionRepository questionRepository;
    
    @Autowired
    private QuizResultRepository quizResultRepository;

    // Display Quiz Questions
    @GetMapping("/{subject}/{topic}")
    public String showQuiz(
            @PathVariable String subject,
            @PathVariable String topic,
            Model model,
            HttpSession session) {
        
        // Get ALL questions for this subject+topic
        List<Question> allQuestions = questionRepository.findBySubjectAndTopic(subject, topic);
        
        // Shuffle and pick 20 (or all if less than 20)
        Collections.shuffle(allQuestions);
        List<Question> quizQuestions = allQuestions.stream()
                .limit(20)
                .collect(Collectors.toList());
        
        // Store ordered questions in session
        session.setAttribute("quizQuestions", quizQuestions);
        model.addAttribute("questions", quizQuestions);
        model.addAttribute("subject", subject);
        model.addAttribute("topic", topic);
        model.addAttribute("timeLimit", 25);
        
        return "quiz";
    }

    @PostMapping("/submit")
    public String submitQuiz(
            @RequestParam String subject,
            @RequestParam String topic,
            @RequestParam List<Long> questionIds,
            @RequestParam Map<String, String> allParams,
            Model model,
            HttpSession session) {
    	
    	// Get the original ordered questions from session
        List<Question> questions = (List<Question>) session.getAttribute("quizQuestions");

        // Extract answers in order
        List<String> answers = new ArrayList<>();
        for (int i = 0; i < questionIds.size(); i++) {
            answers.add(allParams.get("answers[" + i + "]"));
        }

        // Debug output
        //System.out.println("Answers received: " + answers);
        
        
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            String userAnswer = answers.get(i);
            String correctAnswer = questions.get(i).getCorrectAnswer();
            
            System.out.println("Q" + (i+1) + ": User=" + userAnswer + " | Correct=" + correctAnswer);
            
            if (userAnswer != null && userAnswer.equals(correctAnswer)) {
                score++;
            }
        }
        
        // Prepare results
        double percentage = (double) score / questions.size() * 100;
        String remarks = getRemarks(percentage);
        
        QuizResult result = new QuizResult();
        result.setSubject(subject);
        result.setTopic(topic);
        result.setScore(score);
        result.setTotalMarks(questions.size());
        result.setCompletionTime(LocalDateTime.now());
        quizResultRepository.save(result);
        
        model.addAttribute("result", result);
        model.addAttribute("questions", questions);
        model.addAttribute("userAnswers", answers);
        model.addAttribute("percentage", String.format("%.2f", percentage));
        model.addAttribute("remarks", remarks);
        
        return "result";
    }
    private String getRemarks(double percentage) {
        if (percentage >= 90) return "Excellent!";
        if (percentage >= 70) return "Good job!";
        if (percentage >= 50) return "Average";
        return "Needs improvement";
    }
}