package com.hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.entity.Employee;
import com.hibernate.dao.EmployeeDAO;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(EmployeeDAO employeeDAO) {
		return args -> {
			Employee emp = new Employee();
			emp.setName("Harini");
			emp.setDepartment("IT");
			employeeDAO.save(emp);
			System.out.println("Employee saved!");
		};
	}
}
