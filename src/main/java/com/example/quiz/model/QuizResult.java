package com.example.quiz.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class QuizResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username; // You can add user authentication later
    private String subject;
    private String topic;
    private int score;
    private int totalMarks;
    private LocalDateTime completionTime;
    
    // Constructors, getters, and setters
    public QuizResult() {}
    
    public QuizResult(String username, String subject, String topic, 
                    int score, int totalMarks) {
        this.username = username;
        this.subject = subject;
        this.topic = topic;
        this.score = score;
        this.totalMarks = totalMarks;
        this.completionTime = LocalDateTime.now();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public LocalDateTime getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(LocalDateTime completionTime) {
		this.completionTime = completionTime;
	}
    
    // Getters and setters for all fields
    // ...
}