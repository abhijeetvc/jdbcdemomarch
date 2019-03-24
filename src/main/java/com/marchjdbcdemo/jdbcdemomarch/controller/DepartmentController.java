package com.marchjdbcdemo.jdbcdemomarch.controller;


import com.marchjdbcdemo.jdbcdemomarch.impl.DeptImpl;
import com.marchjdbcdemo.jdbcdemomarch.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DeptImpl deptImpl;

    @PostMapping(value="/savedept")
    public String saveDepartment(@RequestBody Department department){
        String str=deptImpl.saveDept(department);

        return str;
    }
}
