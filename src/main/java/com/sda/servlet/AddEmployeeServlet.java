package com.sda.servlet;

import com.sda.model.Employee;
import com.sda.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addEmployee")
public class AddEmployeeServlet extends HttpServlet{
  private EmployeeService employeeService = new EmployeeService();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String text = request.getParameter("un");
        String position = request.getParameter("po");
        Employee employee = new Employee();
        employee.setName(text);
        employee.setFunction(position);
        employeeService.saveEmployee(employee);
        response.sendRedirect("home.jsp");
    }
}
