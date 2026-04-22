package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.demo.Message;
import com.example.operations.StudentOperations;
import com.example.models.StudentModel;
import java.util.List;

/**
 * Main class for the test Java project
 */
public class Main {
    
    public static void main(String[] args) {
        // Create the Spring bean container using bean_dao.xml configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_dao.xml");
        
        System.out.println("Spring ApplicationContext loaded successfully!");
        
        // Create a reference to StudentOperations and initialize using the StudentOperationsClass bean
        StudentOperations<StudentModel> studentOperations = context.getBean("studentDao", StudentOperations.class);
        
        // Call getAllStudents() method
        List<StudentModel> allStudents = studentOperations.getAllStudents();
        
        // Print all students
        System.out.println("\n=== All Students ===");
        if (allStudents != null && !allStudents.isEmpty()) {
            for (StudentModel student : allStudents) {
                System.out.println("Roll Number: " + student.getStudentRollNumber() + 
                                 ", Name: " + student.getStudentName() + 
                                 ", Address: " + student.getStudentAddress() + 
                                 ", Email: " + student.getStudentEmail());
            }
            System.out.println("Total Students: " + allStudents.size());
        } else {
            System.out.println("No students found in the database.");
        }

    }
    
    
}
