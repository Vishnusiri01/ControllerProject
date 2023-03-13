package jdbcfirst1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Newconnection {

	public static void main(String[] args) {
		try {
			//Class.forName(null);
			
			Connection cn=DriverManager.getConnection(null, null, null);
			Statement stm=cn.createStatement();
			String query="Select * from student";
			ResultSet rs=stm.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			cn.close();
			
			
		}
		catch(Exception e) {
			
		}

	}

}
