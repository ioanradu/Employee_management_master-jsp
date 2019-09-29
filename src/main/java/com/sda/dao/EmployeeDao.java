package com.sda.dao;

import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao extends GenericDao<Employee>{

    public List<Employee> getEmployeesList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Employee> elementList = new ArrayList<>();
        try {
            String sql = "from Employee";
            Query query = session.createQuery(sql, Employee.class);
            elementList = query.list();

        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
        return elementList;
    }

    public void editEmployee(String id, String name, String position, Department department){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {
            String sql = "update Employee SET name =:name, function=:position, department =:department"
                    + " where id =:id";
            Query query = session.createQuery(sql);
            query.setParameter("name",name);
            query.setParameter("department",department);
            query.setParameter("position", position);
            Long employeeId = Long.parseLong(id);
            query.setParameter("id", employeeId);
            query.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public boolean deleteEntity(Long employeeId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        boolean validator = false;
        try {
            Employee employee = deleteEntityById(Employee.class,employeeId);
            if (employee!=null){
                session.delete(employee);
                validator = true;
            }else{
                System.out.println("The employees could not be deleted!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        transaction.commit();
        session.close();
        return validator;
    }

}
