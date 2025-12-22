package StudentManagementSystemJDBC;
import java.sql.*;

public class Student {
    void add(Entity sb) throws Exception{
        String sql="insert into stu values (?,?,?)";
        try (Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

ps.setString(1,sb.getname());
ps.setInt(2,sb.getnum());
ps.setInt(3,sb.getmark());
ps.executeUpdate();
System.out.println("added suceesfully");
             }
}
void view() throws Exception{
        String sql="select * from stu";
Connection c = DBConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
            
           ResultSet rs=  ps.executeQuery();
             while(rs.next()){
                System.out.println(rs.getString("name")+" --- "+rs.getInt("num")+"  ---  "+rs.getInt("mark"));
             }
}
}
