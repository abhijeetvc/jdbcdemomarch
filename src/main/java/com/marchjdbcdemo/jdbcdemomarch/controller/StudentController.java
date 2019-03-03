package com.marchjdbcdemo.jdbcdemomarch.controller;


import com.marchjdbcdemo.jdbcdemomarch.impl.StudentImpl;
import com.marchjdbcdemo.jdbcdemomarch.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentImpl studentImpl;

    @PostMapping(value="/save")
    public String saveData(@RequestBody Student student){

        String s=studentImpl.saveData(student);
        return s;

    }
}
