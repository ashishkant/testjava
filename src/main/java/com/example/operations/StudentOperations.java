package com.example.operations;


public interface StudentOperations<T> {
    void addStudent(T student);
    void updateStudent(T student);
    void deleteStudent(int studentRollNumber);
    T getStudentByRollNumber(int studentRollNumber);
    java.util.List<T> getAllStudents();
        
}