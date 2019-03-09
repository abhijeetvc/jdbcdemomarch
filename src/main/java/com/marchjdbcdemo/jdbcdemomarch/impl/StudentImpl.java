package com.marchjdbcdemo.jdbcdemomarch.impl;

import com.marchjdbcdemo.jdbcdemomarch.model.Student;
import com.marchjdbcdemo.jdbcdemomarch.repository.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<Student> getStudents() {
        String sql="select * from student";
        List<Student> list=jdbcTemplate.query(sql,new BeanPropertyRowMapper(Student.class));
        return list;
    }

    @Override
    public Student getSingleStudent(Integer id) {

        String sql="select * from student where id=?";
        Student s=jdbcTemplate.queryForObject(sql, new Object[]{id},
                new BeanPropertyRowMapper<>(Student.class));
        return s;
    }
}
