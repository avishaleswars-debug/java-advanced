package StudentManagementSystemJDBC;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection()throws Exception{
          String url="jdbc:mysql://localhost:3306/studDB";
        String name="root";
        String pass="ajay@12345";
   
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, name, pass);
        return con;     
    }
}
