package com.example.hibe_demo;

import com.example.hibe_demo.Entity.Question;
import com.example.hibe_demo.Entity.QuestionType;
import com.example.hibe_demo.Repository.LanguageRepository;
import com.example.hibe_demo.Repository.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class appstarter implements CommandLineRunner {


    private QuestionRepository questionRepository;
    private LanguageRepository

    public appstarter( QuestionRepository questionRepository) {
          this.questionRepository = questionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        CreateQ1();
        CreateQ2();
        CreateQ3();
        CreateQ4();
        CreateQ5();
        CreateQ6();
        CreateQ7();
        CreateQ8();

    }
    //Module1  MultipleChoice
    private void CreateQ1() {
        Question question1 = new Question();
        question1.setQuestion("How are you?");
        question1.setModuleName("Module1");
        question1.setPoint(10);
        question1.setNumberOfBlank(0);
        question1.setQuestionType(QuestionType.MultipleChoice);
        question1.getCorrectAnswers().add("Good");
        question1.getIncorrectAnswers().add("Bad");
        question1.getIncorrectAnswers().add("soso");
        question1.getIncorrectAnswers().add("fine");
        questionRepository.save(question1);
    }
    private void CreateQ2() {
        Question question2 = new Question();
        question2.setQuestion("How is the weather?");
        question2.setModuleName("Module1");
        question2.setPoint(10);
        question2.setNumberOfBlank(0);
        question2.setQuestionType(QuestionType.MultipleChoice);
        question2.getCorrectAnswers().add("snowy");
        question2.getIncorrectAnswers().add("rainy");
        question2.getIncorrectAnswers().add("sunny");
        question2.getIncorrectAnswers().add("fine");
        questionRepository.save(question2);
    }
    //Module1  Filling
    private void CreateQ6() {
        Question question6 = new Question();
        question6.setQuestion("what is blank favorite color?");
        question6.setModuleName("Module1");
        question6.setPoint(5);
        question6.setNumberOfBlank(3);
        question6.setQuestionType(QuestionType.Filling);
        question6.getCorrectAnswers().add("blue");
        question6.getCorrectAnswers().add("red");

        questionRepository.save(question6);
    }
    //Module1  Blank
    private void CreateQ7() {
        Question question7 = new Question();
        question7.setQuestion("what is blank favorite color?");
        question7.setModuleName("Module1");
        question7.setPoint(5);
        question7.setNumberOfBlank(3);
        question7.setQuestionType(QuestionType.Blank);
        question7.getCorrectAnswers().add("blue");
        question7.getCorrectAnswers().add("red");

        questionRepository.save(question7);
    }
    //Module1  Boolean
    private void CreateQ8() {
        Question question8 = new Question();
        question8.setQuestion("what is blank favorite color?");
        question8.setModuleName("Module1");
        question8.setPoint(5);
        question8.setNumberOfBlank(3);
        question8.setQuestionType(QuestionType.Boolean);
        question8.getCorrectAnswers().add("blue");
        question8.getCorrectAnswers().add("red");

        questionRepository.save(question8);
    }

    //Module2 MultipleChoice
    private void CreateQ3() {
        Question question3 = new Question();
        question3.setQuestion("How old are you?");
        question3.setModuleName("Module2");
        question3.setPoint(5);
        question3.setNumberOfBlank(0);
        question3.setQuestionType(QuestionType.MultipleChoice);
        question3.getCorrectAnswers().add("12");
        question3.getIncorrectAnswers().add("44");
        question3.getIncorrectAnswers().add("67");
        question3.getIncorrectAnswers().add("55");
        questionRepository.save(question3);
    }
    private void CreateQ4() {
        Question question4 = new Question();
        question4.setQuestion("whai is your favorite color?");
        question4.setModuleName("Module2");
        question4.setPoint(5);
        question4.setNumberOfBlank(0);
        question4.setQuestionType(QuestionType.MultipleChoice);
        question4.getCorrectAnswers().add("blue");
        question4.getIncorrectAnswers().add("red");
        question4.getIncorrectAnswers().add("yellow");
        question4.getIncorrectAnswers().add("green");
        questionRepository.save(question4);
    }

    //Module3  MultipleChoice
    private void CreateQ5() {
        Question question5 = new Question();
        question5.setQuestion("what is blank favorite color?");
        question5.setModuleName("Module3");
        question5.setPoint(5);
        question5.setNumberOfBlank(3);
        question5.setQuestionType(QuestionType.Blank);
        question5.getCorrectAnswers().add("blue");
        question5.getCorrectAnswers().add("red");

        questionRepository.save(question5);
    }




}
