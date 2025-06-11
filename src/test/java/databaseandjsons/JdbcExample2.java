package databaseandjsons;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




import java.sql.SQLException;

public class JdbcExample2 {
    public static void main(String[] args) throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Newpass@123";
        String DBDriver="com.mysql.cj.jdbc.Driver";
        
        Class.forName(DBDriver).getDeclaredConstructor().newInstance();

       
        String sql = "select * from emp";

        Connection conn = DriverManager.getConnection(url, user, password);
        
        PreparedStatement  psmt=conn.prepareStatement(sql);
        
        ResultSet rs= psmt.executeQuery();
        
        while (rs.next()) {
            
        	for(int i=1;i<=8;i++) {
        		System.out.print(rs.getString(i)+"\t");
        	}
        	System.out.println();
        }
        
    }
}
