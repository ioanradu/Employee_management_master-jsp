package com.sda.servlet;

import com.sda.dao.DepartmentDao;
import com.sda.model.Department;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/department")
public class Departments extends HttpServlet {

    private DepartmentDao departmentDao = new DepartmentDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Department department = departmentDao.getEntityById(Department.class, 1L);
        response.getWriter().println("Hello World!");
    }
}
