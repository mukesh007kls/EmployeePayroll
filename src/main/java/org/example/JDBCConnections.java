package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnections {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/employeePayroll";
        String userName="root";
        String password="klsa2921";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection con= DriverManager.getConnection(url,userName,password);
            System.out.println("connection sucessfull");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
