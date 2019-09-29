package com.sda.servlet;

import com.sda.model.Employee;
import com.sda.service.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Ionel Radu on 9/29/2019
 */

@WebServlet("/updateEmployee")
public class UpdateEmployee extends HttpServlet {

    EmployeeService employeeService = new EmployeeService();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String employeeId = request.getParameter("id");
        Employee employee = employeeService.findById(Long.parseLong(employeeId));
        request.setAttribute("employee", employee);
        RequestDispatcher rd = request.getRequestDispatcher("updateEmployee.jsp");
        try {
            rd.forward(request, response);
        } catch (ServletException | IOException ex) {
            System.out.println(ex);
        }
    }
}
