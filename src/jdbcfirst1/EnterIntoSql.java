package jdbcfirst1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EnterIntoSql {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection cn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://Localhost:3306/employeedetails";
			String user="root";
			String pass="123456789";
			cn=DriverManager.getConnection(url, user, pass);
			String query="insert into student values(?,?,?,?)";
			PreparedStatement ps=cn.prepareStatement(query);
			ps.setInt(1, 4);
			ps.setString(2, "vishnu");
			ps.setString(3, "hindustan");
			ps.setString(4, "chennai");
			ps.addBatch();
			ps.setInt(1, 5);
			ps.setString(2, "vishnu");
			ps.setString(3, "hindustan");
			ps.setString(4, "chennai");
			ps.addBatch();
			ps.setInt(1, 6);
			
			ps.setString(2, "vishnu");
			ps.setString(3, "hindustan");
			ps.setString(4, "chennai");
			ps.addBatch();
			int[] update = ps.executeBatch();
			System.out.println("data updated = "+update.length);
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				cn.close();
				
			}catch(SQLException e) {
				
				e.printStackTrace();
				
			}
		}
		

	}

}
