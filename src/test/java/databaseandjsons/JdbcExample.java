package databaseandjsons;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




import java.sql.SQLException;

public class JdbcExample {
    public static void main(String[] args) throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Newpass@123";
        String DBDriver="com.mysql.cj.jdbc.Driver";
        
        Class.forName(DBDriver).getDeclaredConstructor().newInstance();

       
        String sql = "select min(sal) from (select distinct(sal) from emp order by sal desc limit 2) as emp1 ";

        Connection conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement  psmt=conn.prepareStatement(sql);
        
        ResultSet rs= psmt.executeQuery();
        
        while (rs.next()) {
            String name = rs.getString(1);
            System.out.println("Second Highest Sal " + name);
        }
        
    }
}
