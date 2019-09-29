package com.sda.service;

import com.sda.dao.DepartmentDao;
import com.sda.dao.EmployeeDao;
import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();
    private DepartmentDao departmentDao = new DepartmentDao();

    public List<Employee> getEmployeesListFromDao(){
        List<Employee> employeeList = employeeDao.getEmployeesList();
        return employeeList;
    }

    public Employee findById(Long id) {
        return employeeDao.getEntityById(Employee.class, id);
    }

    public void saveEmployee(Employee employee){
        employeeDao.createEntity(employee);
    }

    public boolean updateEmployee(Employee employee) {
        boolean updated = false;
        Employee entity = employeeDao.updateEntity(employee);
        if (employee != null) {
            updated = true;
        }
        return updated;
    }

    public void editEmployee(String id, String name, String position, String departmentName) {
        Department department = departmentDao.getDepartmentByName(departmentName);
        employeeDao.editEmployee(id, name, position, department);
    }

    public boolean deleteEmployee(Employee employee) {
        return employeeDao.deleteEntity(employee.getId());
    }
}