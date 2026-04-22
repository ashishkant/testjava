package com.example.operations.operation;

import com.example.models.StudentModel;
import com.example.operations.StudentOperations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import java.util.List;

public class StudentOperationsClass implements StudentOperations<StudentModel> {
    
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addStudent(StudentModel student) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateStudent(StudentModel student) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteStudent(int studentRollNumber) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public StudentModel getStudentByRollNumber(int studentRollNumber) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<StudentModel> getAllStudents() {
        Session session = sessionFactory.openSession();
        try {
            String hql = "FROM StudentModel";
            Query<StudentModel> query = session.createQuery(hql, StudentModel.class);
            return query.getResultList();
        } finally {
            session.close();
        }
    }
    
}