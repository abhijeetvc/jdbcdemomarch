package com.marchjdbcdemo.jdbcdemomarch.controller;


import com.marchjdbcdemo.jdbcdemomarch.impl.StudentImpl;
import com.marchjdbcdemo.jdbcdemomarch.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentImpl studentImpl;

    @PostMapping(value="/save")
    public String saveData(@RequestBody Student student){

        String s=studentImpl.saveData(student);
        return s;
    }

    @GetMapping(value="/getstudent")
    public List<Student> getData(){

        List<Student> list=studentImpl.getStudents();
        return list;
    }

    @GetMapping(value="/getsinglestudent/{id}")
    public Student getSingleData1(@PathVariable Integer id ){

        Student list=studentImpl.getSingleStudent(id);
        return list;

    }

    @GetMapping(value="/getjoindata")
    public List<Map<String,Object>> getCombinedData1(){

        List<Map<String,Object>> list=studentImpl.getCombinedData();
        return list;

    }

}
