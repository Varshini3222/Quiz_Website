package com.example.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.quiz.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Subject findByName(String name);
}