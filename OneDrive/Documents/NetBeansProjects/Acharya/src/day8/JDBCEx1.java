package day8;

import java.sql.*;
import java.sql.DriverManager;

public class JDBCEx1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Acharya", "root", "Ad@8248600372");
        System.out.println("Connection established..");
    }
}
