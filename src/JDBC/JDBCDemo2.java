package JDBC;

import java.sql.*;

public class JDBCDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/school";

        Connection con = DriverManager.getConnection(url,username,password);

        // 3. create statement
        Statement st = con.createStatement();

        // 4. executing query

        String sql = "select * from student where branch='ME'";

        // Select - DDL queries - Data Definition language
        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }

    }
}
