package com.hibernate.dao;

import java.util.List;

import com.hibernate.entity.Employee;

public interface EmployeeDAO {
    void save(Employee employee);
    List<Employee> getAll();
}
