package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Database initializer for creating school.db with student table
 */
public class DatabaseInitializer {
    
    private static final String DB_URL = "jdbc:sqlite:src/main/resources/school.db";
    
    public static void main(String[] args) {
        createDatabase();
    }
    
    public static void createDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            if (conn != null) {
                System.out.println("Connected to SQLite database.");
                
                // Create table
                String createTableSQL = "CREATE TABLE IF NOT EXISTS student (" +
                    "student_roll_number INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "student_name TEXT," +
                    "student_address TEXT," +
                    "student_email TEXT" +
                    ");";
                
                conn.createStatement().execute(createTableSQL);
                System.out.println("Table 'student' created successfully.");
                
                // Insert sample data
                insertSampleData(conn);
                
                System.out.println("Database initialized successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void insertSampleData(Connection conn) throws SQLException {
        String insertSQL = "INSERT INTO student (student_name, student_address, student_email) VALUES (?, ?, ?)";
        
        String[][] students = {
            {"John Doe", "123 Main St", "john@example.com"},
            {"Jane Smith", "456 Oak Ave", "jane@example.com"},
            {"Bob Johnson", "789 Pine Rd", "bob@example.com"},
            {"Alice Brown", "321 Elm St", "alice@example.com"},
            {"Charlie Wilson", "654 Maple Dr", "charlie@example.com"},
            {"Diana Davis", "987 Cedar Ln", "diana@example.com"},
            {"Edward Miller", "147 Birch Blvd", "edward@example.com"},
            {"Fiona Garcia", "258 Spruce Ct", "fiona@example.com"},
            {"George Rodriguez", "369 Willow Way", "george@example.com"},
            {"Helen Martinez", "741 Poplar Pl", "helen@example.com"},
            {"Ian Anderson", "852 Ash St", "ian@example.com"},
            {"Julia Thomas", "963 Hickory Ave", "julia@example.com"},
            {"Kevin Jackson", "159 Dogwood Dr", "kevin@example.com"},
            {"Laura White", "260 Magnolia Ln", "laura@example.com"},
            {"Michael Harris", "371 Sycamore Blvd", "michael@example.com"},
            {"Nancy Clark", "482 Chestnut Ct", "nancy@example.com"},
            {"Oliver Lewis", "593 Redwood Way", "oliver@example.com"},
            {"Paula Walker", "604 Palm Pl", "paula@example.com"},
            {"Quinn Hall", "715 Cypress St", "quinn@example.com"},
            {"Rachel Young", "826 Fir Ave", "rachel@example.com"}
        };
        
        try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            for (String[] student : students) {
                pstmt.setString(1, student[0]);
                pstmt.setString(2, student[1]);
                pstmt.setString(3, student[2]);
                pstmt.executeUpdate();
            }
        }
        
        System.out.println("Inserted 20 student records.");
    }
}