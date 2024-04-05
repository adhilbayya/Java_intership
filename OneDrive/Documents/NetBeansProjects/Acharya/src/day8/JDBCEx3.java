package day8;

import java.sql.*;

public class JDBCEx3 {
    public static void main(String[] args) throws SQLException {
        String sql = "select * from emp";
        String url = "jdbc:mysql://localhost:3306/Acharya";
        String usrName = "root";
        String password = "Ad@8248600372";

        Connection con = DriverManager.getConnection(url, usrName, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            String res = rs.getInt(1) + " " + rs.getString(2);
            System.out.println(res);
        }

        con.close();
    }
}
