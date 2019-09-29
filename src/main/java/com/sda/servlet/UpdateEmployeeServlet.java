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
@WebServlet("/update-Employee")
public class UpdateEmployeeServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        EmployeeService employeeService = new EmployeeService();
        String employeeId = request.getParameter("id");
        String name = request.getParameter("un");
        String position = request.getParameter("po");
        String departmentName = request.getParameter("department");

        employeeService.editEmployee(employeeId, name, position, departmentName);
        try {
            response.sendRedirect("employees.jsp"); //logged-in page
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
