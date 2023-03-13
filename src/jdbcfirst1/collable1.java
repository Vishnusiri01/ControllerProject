package jdbcfirst1;

import java.sql.*;

public class collable1 {

	public static void main(String[] args) {
		Connection cn=null;
		try {
			cn=DriverManager.getConnection("jdbc:mysql://Localhost:3306/", "root", "123456789");
			String query="";
			CallableStatement cst=cn.prepareCall("{call add()}");
			
			
		}catch(SQLException e) {
			
		}

	}

}
