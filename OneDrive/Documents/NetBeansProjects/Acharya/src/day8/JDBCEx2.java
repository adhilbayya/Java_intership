package day8;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCEx2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Acharya", "root", "Ad@8248600372");
        System.out.println("Connection established..");
        Statement stmt = con.createStatement();
        String sql = "delete from emp where id = 102";
        int i = stmt.executeUpdate(sql);
        if(i > 0){
            System.out.println("Record inserted");
        }else{
            System.out.println("Record not inserted");
        }
        con.close();
}
}
