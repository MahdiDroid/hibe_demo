package com.example.hibe_demo.Repository;


import com.example.hibe_demo.Entity.Question;

import com.example.hibe_demo.Entity.QuestionType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface QuestionRepository extends CrudRepository<Question,Integer> {

    @Query("FROM Question WHERE  moduleName = ?1 ")
    List<Object> findByModelName(String moduleName);
    List<Object> findAllByQuestionType(QuestionType questionType);
    List<Question> findAllByQuestionTypeAndModuleName(QuestionType qType,String moduleName);


//    @Query("SELECT q FROM Question q WHERE questionType = ?1 AND moduleName = ?2")



}
