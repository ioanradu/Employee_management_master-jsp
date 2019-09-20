package com.sda.dao;

import com.sda.model.Department;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDao extends GenericDao<Department> {

    public List<Department> getDepartmentsList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Department> elementList = new ArrayList<>();
        try {
            String sql = "from Department";
            Query query = session.createQuery(sql, Department.class);
            elementList = query.list();

        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();

        System.out.println(elementList);
        return elementList;
    }

    public Department getDepartmentByName(String departmentName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        List<Department> list = null;
        try {
            String sql = "from Department where name=:name";
            Query query = session.createQuery(sql);
            query.setParameter("name",departmentName);
            list = query.list();

        } catch (Exception e) {
            e.printStackTrace();
        }

        transaction.commit();
        session.close();
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }
}