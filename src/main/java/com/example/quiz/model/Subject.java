package com.example.quiz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String topics; // Comma-separated list of topics
    
    // Constructors
    public Subject() {}
    
    public Subject(String name, String topics) {
        this.name = name;
        this.topics = topics;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTopics() {
        return topics;
    }
    
    public void setTopics(String topics) {
        this.topics = topics;
    }
    
    // Helper method to get topics as array
    public String[] getTopicsArray() {
        return this.topics.split(",");
    }
}