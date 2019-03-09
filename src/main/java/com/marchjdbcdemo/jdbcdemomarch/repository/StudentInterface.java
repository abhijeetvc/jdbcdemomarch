package com.marchjdbcdemo.jdbcdemomarch.repository;

import com.marchjdbcdemo.jdbcdemomarch.model.Student;

import java.util.List;

public interface StudentInterface {

    String saveData(Student student);

    List<Student> getStudents();

    Student getSingleStudent(Integer id);
}
