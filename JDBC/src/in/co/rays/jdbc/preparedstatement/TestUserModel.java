package in.co.rays.jdbc.preparedstatement;

import java.util.Date;

public class TestUserModel 
{
	public static void main(String[] args) throws Exception 
	{
		UserBean bean = new UserBean();
		
		bean.setId(5);
		bean.setFirstName("Bobby");
		bean.setLastName("Roy");
		bean.setLogin("bobby@gmail.com");
		bean.setPassword("word12345");
		bean.setDob(new Date());
		
		UserModel model = new UserModel();
		
		int id = model.add(bean);
		
		System.out.println("Record inserted at id: " + id);
	}
}
