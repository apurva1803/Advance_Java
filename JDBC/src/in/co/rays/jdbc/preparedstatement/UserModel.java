package in.co.rays.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserModel {

	public int add(UserBean bean) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
		PreparedStatement pstmt = conn.prepareStatement("insert into st_user values(?,?,?,?,?,?)");
		
		pstmt.setInt(1, bean.getId());
		pstmt.setString(2, bean.getFirstName());
		pstmt.setString(3, bean.getLastName());
		pstmt.setString(4, bean.getLogin());
		pstmt.setString(5, bean.getPassword());
		pstmt.setDate(6, new java.sql.Date(bean.getDob().getTime()));
		
		int i = pstmt.executeUpdate();
		

		conn.close();
		pstmt.close();
		System.out.println(i+ " rows affected (Record inserted) ");
		
		return bean.getId();
		
		
	}
	
	public void update(UserBean bean) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
		PreparedStatement pstmt = conn.prepareStatement("update st_user set FirstName = ?, LastName = ?, Login =?, Password = ?, Dob = ? where id = ?");
		
		pstmt.setString(1, bean.getFirstName());
		pstmt.setString(2, bean.getLastName());
		pstmt.setString(3, bean.getLogin());
		pstmt.setString(4, bean.getPassword());
		pstmt.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		pstmt.setInt(6, bean.getId());
		
		int i = pstmt.executeUpdate();
		
		conn.close();
		pstmt.close();
		System.out.println(i+ " rows affected (Record Updated) ");
		
	}
	
	public void delete(UserBean bean) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
		PreparedStatement pstmt = conn.prepareStatement("delete from st_user where id = ?");
	
		pstmt.setInt(1, bean.getId());
		
		int i = pstmt.executeUpdate();
		
		conn.close();
		pstmt.close();
		System.out.println(i+ " rows affected (Record deleted) ");
		
	}
}
