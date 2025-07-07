package com.springjpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
