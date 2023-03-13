package jdbcfirst1;

import java.sql.*;

public class delete1 {

	public static void main(String[] args) {
		try 
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/m2e2jdbc1";
		String user="root";
		String password="123456789";
		Connection cnn=DriverManager.getConnection(url, user, password);
		Statement stm=cnn.createStatement();
		String query="delete from student where id=7";
		int re=stm.executeUpdate(query);
		System.out.println("succesfully updated");
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
		
		

	}

}
