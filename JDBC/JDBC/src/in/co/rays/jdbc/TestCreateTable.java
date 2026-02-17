package in.co.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCreateTable 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("create table st_user(Id int primary key, FirstName varchar(45) , LastName varchar(45), Login varchar(45) ,Password varchar(45), Dob Date)");

		System.out.println(i + " table created");
		
		conn.close();
		stmt.close();
	}
}
