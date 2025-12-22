package JDBC;
import java.sql.*;
public class Example {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/practice";
        String name="root";
        String pass="ajay@12345";
   String sql="select * from students";
   try {
      //  Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, name, pass);     
        Statement st=con.createStatement();
        ResultSet rs= st.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString("name"));
        }
con.close();
}
catch(Exception e) {
    System.out.println(e);
} } }
