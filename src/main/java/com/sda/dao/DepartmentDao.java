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
}
