package day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateEx {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Acharya", "root", "Ad@8248600372");
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What do you wanna update? [age/name]");
            String choose = sc.next();
            String sql = "update emp set "+ choose + " = ? where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println("Enter id: ");
            int id = sc.nextInt();

            ps.setInt(2, id);
            if(choose.equalsIgnoreCase("name")){
                System.out.println("Enter name: ");
                String name = sc.next();
                ps.setString(1, name);
            }
            if(choose.equalsIgnoreCase("age")){
                System.out.println("Enter age: ");
                int age = sc.nextInt();
                ps.setInt(1, age);
            }

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Updated successfully");
                System.out.println("Do you wanna continue ? [yes/no]");
                String option = sc.next();
                if(option.equalsIgnoreCase("no"))
                    break;
            } else {
                System.out.println("Update Unsuccessfully");
            }
        }

        con.close();
    }
}
