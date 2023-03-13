package jdbcfirst1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update1 {
	public static void main(String[]args) {
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/m2e2jdbc1","root","123456789");
			// statement is available in the java.sql.connection.
			Statement stm=con.createStatement();
			String query="delete from student where id=8;";
			int res=stm.executeUpdate(query);
			System.out.println("No.of rows updated"+res);
			System.out.println("connection build successfully");
			
		}
		catch(ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				
			}
			catch(SQLException e) {
				
				
			}
		}
		
	}

}
