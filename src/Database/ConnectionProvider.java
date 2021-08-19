package Database;

import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author calvy
 */
public class ConnectionProvider {
//Setting up url, default database name + password

    public static void main(String[] args) {
        try {
            System.out.println("Database starting connected");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internshiptracker", "root", "Book2computer2");
            System.out.println("Database connected");
//            return con;
        } catch (Exception e) {
            System.out.println("Connection failed");
//            return null;
        }
    }
;
}
