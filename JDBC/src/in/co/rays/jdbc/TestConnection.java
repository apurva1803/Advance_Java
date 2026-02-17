package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestConnection 
{
	public static void main(String[] args) throws Exception 
	{
		// load the Driver class in class loader
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Make connection to the Database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		System.out.println("connection successfully = " + conn.getCatalog());
		
		// Create Statement
		Statement stmt = conn.createStatement();
		
		// Execute query and get ResultSet
		ResultSet rs = stmt.executeQuery("select * from employee");
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1));
			System.out.print("\t " + rs.getString(2));
			System.out.print("\t " + rs.getString(3));
			System.out.println("\t " + rs.getInt(4));
		}
		
		conn.close();
		stmt.close();
		
	}
}
