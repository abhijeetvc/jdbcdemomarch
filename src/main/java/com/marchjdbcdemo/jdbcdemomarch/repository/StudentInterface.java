package com.marchjdbcdemo.jdbcdemomarch.repository;

import com.marchjdbcdemo.jdbcdemomarch.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentInterface {

    String saveData(Student student);

    List<Student> getStudents();

    Student getSingleStudent(Integer id);

    List<Map<String,Object>>  getCombinedData();
}
