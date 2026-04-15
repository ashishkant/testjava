package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.demo.Message;

/**
 * Main class for the test Java project
 */
public class Main {
    
    public static void main(String[] args) {
        // Create the Spring bean container using beans.xml configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        
        System.out.println("Spring ApplicationContext loaded successfully!");
        
        // Get the Message bean and print its msg value
        Message message = context.getBean("message", Message.class);
        System.out.println("Message: " + message.getMsg());

    }
    
    
}
