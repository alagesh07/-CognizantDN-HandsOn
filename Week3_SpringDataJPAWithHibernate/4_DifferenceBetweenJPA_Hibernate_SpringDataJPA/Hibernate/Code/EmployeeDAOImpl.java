package com.hibernate.dao.impl;


import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.dao.EmployeeDAO;
import com.hibernate.entity.Employee;

import jakarta.transaction.Transactional;

import java.util.List;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Employee employee) {
        getSession().save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return getSession().createQuery("from Employee", Employee.class).list();
    }
}
