package com.sda.servlet;

import com.sda.model.Employee;
import com.sda.service.EmployeeService;
import org.w3c.dom.ls.LSOutput;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Ionel Radu on 9/29/2019
 */

@WebServlet("/deleteEmployee")
public class DeleteEmployeesServlet extends HttpServlet {

    private EmployeeService employeeService = new EmployeeService();


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String employeeId = request.getParameter("id");
        Employee employee = employeeService.findById(
                Long.parseLong(employeeId));
        try {
            if (employeeService.deleteEmployee(employee)) {
                response.sendRedirect("/employees.jsp");
            } else {
                response.sendRedirect("/deleteEmployeeFailed.jsp");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
