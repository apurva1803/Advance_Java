package in.co.rays.jdbc.preparedstatement;

import java.util.Date;

public class TestUserModel 
{
	public static void main(String[] args) throws Exception 
	{
		//testAdd();
		//testUpdate();
		testDelete();
		
	}
	
	public static void testAdd() throws Exception
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

	public static void testUpdate() throws Exception
	{
		UserBean bean = new UserBean();
		
		bean.setId(5);
		bean.setFirstName("Rocky");
		bean.setLastName("Roy");
		bean.setLogin("rocky@gmail.com");
		bean.setPassword("rockyrd45");
		bean.setDob(new Date());
		
		UserModel model = new UserModel();
		
		model.update(bean);
		
	}
	
	public static void testDelete() throws Exception
	{
		UserBean bean = new UserBean();
		
		bean.setId(5);
		
		UserModel model = new UserModel();
		
		model.delete(bean);
		
	}


}

