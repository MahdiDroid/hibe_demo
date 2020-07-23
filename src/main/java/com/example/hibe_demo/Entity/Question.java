package com.example.hibe_demo.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private int point;
        @Enumerated(EnumType.STRING)
        private QuestionType questionType;
        private String moduleName;
        private String question;
        private int NumberOfBlank;
        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name="question_id",nullable = false)
        private List<QuestionTranslation> questionTranslations = new ArrayList<>();

//        @ElementCollection
//        @CollectionTable(name = "question_correctAnswer",joinColumns = @JoinColumn(name = "question_id"))
//        @Column(name = "correctAnswer")
//        private List<String> correctAnswers = new ArrayList<>();
//        @ElementCollection
//        @CollectionTable(name = "question_incorrectAnswer",joinColumns = @JoinColumn(name = "question_id"))
//        @Column(name = "incorrectAnswer")
//         private List<String> incorrectAnswers = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getNumberOfBlank() {
        return NumberOfBlank;
    }

    public void setNumberOfBlank(int numberOfBlank) {
        NumberOfBlank = numberOfBlank;
    }

    public List<QuestionTranslation> getQuestionTranslations() {
        return questionTranslations;
    }

    public void setQuestionTranslations(List<QuestionTranslation> questionTranslations) {
        this.questionTranslations = questionTranslations;
    }

    //
//    public List<String> getCorrectAnswers() {
//        return correctAnswers;
//    }
//
//    public void setCorrectAnswers(List<String> correctAnswers) {
//        this.correctAnswers = correctAnswers;
//    }
//
//    public List<String> getIncorrectAnswers() {
//        return incorrectAnswers;
//    }
//
//    public void setIncorrectAnswers(List<String> incorrectAnswers) {
//        this.incorrectAnswers = incorrectAnswers;
//    }
}
