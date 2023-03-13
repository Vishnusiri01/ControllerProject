package jdbcfirst1;
import java.sql.*;

public class Select1 {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con=null;
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/m2e2jdbc1";
		String user="root";
		String password="123456789";
		con=DriverManager.getConnection(url, user, password);
		Statement stm=con.createStatement();
		String query="select * from student";
		ResultSet res=stm.executeQuery(query);
		while(res.next()) {
		
			System.out.print(res.getInt(1)+"\t");
			System.out.print(res.getString(2)+"\t");
			System.out.print(res.getString(3)+"\t");
			System.out.print(res.getInt(4)+"\t");
		}
			System.out.println();
		
		System.out.println(".............");
		
		}
		catch(SQLException e) 
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
