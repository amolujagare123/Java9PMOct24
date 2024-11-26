package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

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

        String sql = "INSERT INTO student VALUES (3, 'Ishaan', 'ME', 92)";

        // update / delete

        st.executeUpdate(sql);

    }
}
