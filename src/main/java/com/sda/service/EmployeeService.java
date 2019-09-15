package com.sda.service;

import com.sda.dao.EmployeeDao;
import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public List<Employee> getEmployeesListFromDao(){
      List<Employee> employeeList = employeeDao.getEmployeesList();
      return employeeList;
    }


    public Employee findById(Long id) {

        return employeeDao.getEntityById(Employee.class, id);
    }



}
