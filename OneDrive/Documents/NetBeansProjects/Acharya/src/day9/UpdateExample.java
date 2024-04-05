package day9;

import java.sql.*;
import java.util.Scanner;

public class UpdateExample {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Acharya", "root", "Ad@8248600372");
        while(true) {
            Scanner sc = new Scanner(System.in);
            String sql = "insert into emp values(?, ?, ?)";
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            System.out.println("Enter name: ");
            String name = sc.next();
            System.out.println("Enter age: ");
            int age = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Inserted successfully");
                System.out.println("Do you wanna continue ? [yes/no]");
                String option = sc.next();
                if(option.equalsIgnoreCase("no"))
                    break;
            } else {
                System.out.println("Inserted Unsuccessfully");
            }
        }

        con.close();
    }
}
