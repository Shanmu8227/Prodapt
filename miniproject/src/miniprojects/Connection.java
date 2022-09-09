package miniprojects;
import java.sql.*;
import java.sql.DriverManager;

public class Connection {
    static Connection con; 
    public static Connection getConnection()
    {
        try {
            
            
            String mysqlJDBCDriver
                = "com.mysql.cj.jdbc.Driver"; 
            String url
                = "jdbc:mysql://localhost:3306/miniproject";
            String user = "root";       
            String pass = "root"; 
            Class.forName(mysqlJDBCDriver);
            con = (Connection) DriverManager.getConnection(url, user,pass);
          
        }
        catch (Exception e) {
            System.out.println("Connection Failed!");
        }
 
        return con;
    }
}