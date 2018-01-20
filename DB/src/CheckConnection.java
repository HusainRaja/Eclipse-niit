import java.sql.Statement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

public class CheckConnection {
    public static void main(String ma[]) {
    	try {
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		System.out.println("Enter Student ID ");
    		int id=Integer.parseInt(br.readLine());
    		System.out.println("Endter Student Name ");
    		String name=br.readLine();
    	Connection con=DBConnect.getConnection();
    	Statement st=con.createStatement();
    	st.execute("insert into sample values("+id+",\'"+name+"\')");
    	System.out.println("Successfully Inserted");
    	}catch(SQLException e) {
    		System.err.println("Error at "+e.getMessage());
    	}
    	catch(IOException e) {}
    }
}