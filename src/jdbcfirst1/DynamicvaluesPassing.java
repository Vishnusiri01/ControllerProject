package jdbcfirst1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DynamicvaluesPassing {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the eno");
		int eno=sn.nextInt();
		System.out.println("Enter the name");
		String ename=sn.next();
		System.out.println("Enter the salary");
		double esalary=sn.nextDouble();
		System.out.println("Enter the address");
		String eaddress=sn.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn=DriverManager.getConnection("jdbc:mysql://Localhost:3306/Practice", "root", "123456789");
			Statement st=cn.createStatement();
			String query=String.format("insert into employee values(%d,'%s',%f,'%s')",eno,ename,esalary,eaddress);
			int rs=st.executeUpdate(query);
			System.out.println("Succesfully update"+rs);
			cn.close();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
