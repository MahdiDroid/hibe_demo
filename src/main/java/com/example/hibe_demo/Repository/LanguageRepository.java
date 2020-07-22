package com.example.hibe_demo.Repository;

import com.example.hibe_demo.Entity.AppLanguage;
import org.springframework.data.repository.CrudRepository;

public interface LanguageRepository  extends CrudRepository<AppLanguage,String> {
}
