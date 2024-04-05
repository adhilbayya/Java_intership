package day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementEx {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        String sql = "insert into emp values(?, ?, ?)";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Acharya", "root", "Ad@8248600372");
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);
        int i = ps.executeUpdate();
        if(i > 0){
            System.out.println("Inserted successfully");
        }else{
            System.out.println("Inserted Unsuccessfully");
        }

        con.close();
    }
}
