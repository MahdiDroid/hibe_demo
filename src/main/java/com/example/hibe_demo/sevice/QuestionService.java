package com.example.hibe_demo.sevice;

import com.example.hibe_demo.Entity.Question;
import com.example.hibe_demo.Entity.QuestionType;

import java.util.List;

public interface QuestionService {

    List<Question> findAllQuestions();
    List<Object> findAllByQuestionType(QuestionType questionType);
    List<Object> findAllByModuleName(String moduleName);

    List<Question> findModuleQuestionByQuestionType(QuestionType questionType, String module);
}