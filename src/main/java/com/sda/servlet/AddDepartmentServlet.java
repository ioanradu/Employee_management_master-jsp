package com.sda.servlet;
import com.sda.model.Department;
import com.sda.service.DepartmentService;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/addDepartment")
public class AddDepartmentServlet extends HttpServlet {
    private DepartmentService departmentService = new DepartmentService();
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
        Department department = new Department();
        String text = request.getParameter("un");
        department.setName(text);
        if (department != null){
            departmentService.saveDepartment(department);
            response.sendRedirect("departments.jsp");
        }
    }
}