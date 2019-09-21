package com.sda;

import com.sda.dao.EmployeeDao;
import com.sda.dao.UserDao;
import com.sda.model.*;
import com.sda.model.User;
import com.sda.service.DepartmentService;
import com.sda.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        User user = new User("admin", "admin");
        UserDao userDao = new UserDao();
        userDao.createEntity(user);

        /*Employee employee = new Employee();
        employee.setName("Cosmin C");
        EmployeeDao employeeDao = new EmployeeDao();
        employee = employeeDao.getEntityById(Employee.class, 1L);
        employeeDao.createEntity(employee);*/

        /*EmployeeService employeeService = new EmployeeService();
        List<Employee> employeesList = employeeService.getEmployeesListFromDao();
        DepartmentService departmentService = new DepartmentService();
        List<Department> departmentList = departmentService.getDepartmentsListFromDao();

        for (Department dep : departmentList) {
            System.out.println(dep.getName());
        }*/
    }
}
