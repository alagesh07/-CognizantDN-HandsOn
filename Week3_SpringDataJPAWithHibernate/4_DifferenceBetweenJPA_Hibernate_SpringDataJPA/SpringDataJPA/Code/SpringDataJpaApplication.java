package com.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjpa.entity.Employee;
import com.springjpa.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;



@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

 @Autowired
 private EmployeeService employeeService;

 public static void main(String[] args) {
     SpringApplication.run(SpringDataJpaApplication.class, args);
 }

 @Override
 public void run(String... args) throws Exception {
     Employee emp = new Employee();
     emp.setId(1);
     emp.setName("Harini");
     emp.setSalary(70000);
     employeeService.addEmployee(emp);
     System.out.println("Employee inserted!");
 }
}




