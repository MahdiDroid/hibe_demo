package com.example.hibe_demo.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class QuestionTranslation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String   question;
    private String   languages;


    @ElementCollection
    @CollectionTable(name = "question_correctAnswer",joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "correctAnswer")
    private List<String> correctAnswers = new ArrayList<>();
    @ElementCollection
    @CollectionTable(name = "question_incorrectAnswer",joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "incorrectAnswer")
    private List<String> incorrectAnswers = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public List<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(List<String> incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }
}
