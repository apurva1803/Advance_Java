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
		
		System.out.println(i+ " rows affected (Record inserted) ");
		
		return bean.getId();
		
		
	}
}
