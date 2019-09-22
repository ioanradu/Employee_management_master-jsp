package com.sda.service;

import com.sda.dao.DepartmentDao;
import com.sda.model.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao departmentDao = new DepartmentDao();

    public List<Department> getDepartmentsListFromDao(){
        List<Department> departmentsList = departmentDao.getDepartmentsList();
        return departmentsList;
    }

    public Department findById(Long id) {

        return departmentDao.getEntityById(Department.class, id);
    }

    public void saveDepartment(Department department){
        departmentDao.createEntity(department);
    }
}
