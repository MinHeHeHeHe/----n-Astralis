package com.mycompany.mavenproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
public class DB_Connection {
    
    static final String DB_URL = "jdbc:oracle:thin:@//hostname:port/service_name";
    static final String USER = "your_username";
    static final String PASSWORD = "your_password";
    public static Connection connectDB() {
        Connection conn= null;
        try {
            // register jdbc driver, not required for newer versions of jdk
            Class.forName("oracle.jdbc.OracleDriver");           
        //open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            return conn;
        } catch (Exception ex) {
            System.out.println("Error while connecting to database.");
            return null;
        }
    }
}
