package com.marchjdbcdemo.jdbcdemomarch.impl;

import com.marchjdbcdemo.jdbcdemomarch.model.Department;
import com.marchjdbcdemo.jdbcdemomarch.repository.DeptInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeptImpl implements DeptInterface {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String saveDept(Department dept) {

        String sql="insert into department values(?,?)";

        jdbcTemplate.update(sql,new Object[]{dept.getId(),dept.getName()});
        return "Dept saved";
    }
}
