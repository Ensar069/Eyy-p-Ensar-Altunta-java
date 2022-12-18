package com.example.demo;
import java.sql.*;
import java.util.Scanner;
public class Hackaton {
    
    public static void main(String[] args) {
        System.out.println("\n\n***** MySQL JDBC Connection Testing *****");
        try
        {
        String userName = "root";
            String password = "Passw0rd";
            String url = "jdbc:MySQL://localhost:3306/Hackaton";      
            DriverManager.getConnection (url, userName, password);
            System.out.println ("\nDatabase Connection Established...");
        }
       catch (Exception ex)
        {
            System.err.println ("Cannot connect to database server");
            ex.printStackTrace();
        }
    try (Scanner myObj = new Scanner(System.in)) {
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
}