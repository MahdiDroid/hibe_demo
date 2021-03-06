package com.example.hibe_demo.Controller;

import com.example.hibe_demo.Entity.QuestionType;
import com.example.hibe_demo.Repository.QuestionRepository;
import com.example.hibe_demo.sevice.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class demoController {

    private QuestionService questionService;

    public demoController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/ALLQuestion")
    public Object getAllQuestion(){
        return questionService.findAllQuestions();
    }
    @GetMapping("/ALLQuestion/Question/{questionType}")
    public Object getAllQuestionByQuestionType(@PathVariable QuestionType questionType){
        return questionService.findAllByQuestionType(questionType);
    }
    @GetMapping("/ALLQuestion/modules/{Module}")
    public Object getAllQuestionByQuestionType(@PathVariable String Module){
        return questionService.findAllByModuleName(Module);
    }

    @GetMapping("/module/{Module}/questionType/{questionType}")
    public Object getAllQuestionByQuestionType(@PathVariable QuestionType questionType,
                                               @PathVariable  String Module){
        return questionService.findModuleQuestionByQuestionType(questionType,Module);
    }
    @GetMapping("/search/{questionType}")
    public Object searchAllQuestion(@PathVariable String questionType ){
        return questionService.searchAll(questionType);
    }
    @GetMapping("/searchall/{number}")
    public Object searchAllByRandom(@PathVariable int number ){
        return questionService.searchSomeRandomly(number);
    }

    @GetMapping("/searchQuestion/{number}/moduleName/{moduleName}/{questionType}")
    public Object searchQuestionRandomlyByModuleNameAndQuestionType(@PathVariable int number,
                                                                    @PathVariable String moduleName,
                                                                    @PathVariable String questionType ){

        return questionService.searchRandomlyByModuleNameAndQuestionType(number,moduleName,questionType);
    }






}
