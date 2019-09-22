package com.sda.servlet;

import com.sda.model.Employee;
import com.sda.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/employeesOfManager")
public class EmployeesOfManagerServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        Employee employee = employeeService.findById(Long.parseLong(id));
        request.setAttribute("manager", employee);
        request.getRequestDispatcher("employeesOfManager.jsp").forward(request, response);
    }
}
