package com.example.hibe_demo.sevice.impl;

import com.example.hibe_demo.Entity.Question;
import com.example.hibe_demo.Entity.QuestionType;
import com.example.hibe_demo.Repository.QuestionRepository;
import com.example.hibe_demo.sevice.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Override
    public List<Question> findAllQuestions() {
        return (List<Question>) questionRepository.findAll();
    }

    @Override
    public List<Object> findAllByQuestionType(QuestionType questionType) {
        return questionRepository.findAllByQuestionType(questionType);
    }

    @Override
    public List<Object> findAllByModuleName(String moduleName) {
        return questionRepository.findByModelName(moduleName);
    }

    @Override
    public List<Question> findModuleQuestionByQuestionType(QuestionType questionType, String module) {
        return questionRepository.findAllByQuestionTypeAndModuleName(questionType,module);
    }

    @Override
    public List<Question> findQuestionByType(int number,
                                             QuestionType qType,
                                             String moduleName) {
       return null;
    }

    @Override
    public List<Question> searchAll(String qType) {
        return questionRepository.searchQuestion(qType);
    }

    @Override
    public List<Question> searchSomeRandomly(int number) {
        return questionRepository.searchRandomly(number);
    }
}
