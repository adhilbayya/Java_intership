package day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementEx {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter location: ");
        String loc = sc.nextLine();

        System.out.println("Enter Date: ");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Enter Description: ");
        String age = sc.nextLine();
        String sql = "insert into Journal_Project values(?, ?, ?)";
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Ad@8248600372");
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, loc);
        ps.setString(2, name);
        ps.setString(3, age);
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println("Inserted successfully");
        } else {
            System.out.println("Inserted Unsuccessfully");
        }

        con.close();
    }
}
  