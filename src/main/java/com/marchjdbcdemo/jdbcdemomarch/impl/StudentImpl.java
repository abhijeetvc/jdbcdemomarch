package com.marchjdbcdemo.jdbcdemomarch.impl;

import com.marchjdbcdemo.jdbcdemomarch.model.Student;
import com.marchjdbcdemo.jdbcdemomarch.repository.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentImpl implements StudentInterface {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public String saveData(Student student) {

        String sql="insert into student values(?,?,?)";
        jdbcTemplate.update(sql,new Object[]{student.getId(),
                student.getName(),student.getCity()});
        return "Data saved";
    }
}
