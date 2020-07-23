package com.example.hibe_demo.Repository;

import com.example.hibe_demo.Entity.Language;
import org.springframework.data.repository.CrudRepository;

public interface AppLanguageRepository extends CrudRepository<Language,String> {
}
