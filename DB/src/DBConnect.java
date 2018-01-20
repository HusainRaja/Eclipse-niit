import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static Connection getConnection() {
    	Connection con=null;
    	try {
    		Class.forName("oracle.jdbc.OracleDriver");
    		
    		String url="jdbc:oracle:thin:@localhost:1521:XE";
    		String username="system";
    		String pwd="rj2568662";
    		con=DriverManager.getConnection(url, username, pwd);
    		//System.out.println("Data base connected Successfully");
    		
    	}catch(ClassNotFoundException e) {
    		System.err.println("Sorry Class was not found");
    	}
    	catch(SQLException e) {
    		System.err.println("Database location Not found");
    	}
    	return con;
    }
}
