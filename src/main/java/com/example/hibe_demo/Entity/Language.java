package com.example.hibe_demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {
    @Id
    private String code;

    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
