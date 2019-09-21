package com.sda.servlet;

import com.sda.dao.DepartmentDao;
import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.service.EmployeeService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addEmployee")
public class AddEmployeeServlet extends HttpServlet {

    private EmployeeService employeeService = new EmployeeService();
    private DepartmentDao departmentDao = new DepartmentDao();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Employee employee = new Employee();
        String text = request.getParameter("un");
        String position = request.getParameter("po");
        String departmentName = request.getParameter("department");

        Department department = departmentDao.getDepartmentByName(departmentName);

        employee.setName(text);
        employee.setFunction(position);
        employee.setDepartment(department);

        if (employee != null) {
            employeeService.saveEmployee(employee);
            response.sendRedirect("employees.jsp");
        }
    }
}