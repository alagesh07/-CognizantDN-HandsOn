package com.hibernate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hibernate.dao.EmployeeDAO;
import com.hibernate.entity.Employee;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @PostMapping("/save")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeDAO.save(employee);
        return "Employee saved using Hibernate!";
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }
}
