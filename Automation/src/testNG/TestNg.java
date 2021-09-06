package testNG;

import org.testng.annotations.Test;

public class TestNg {

	@Test
	public void createuser()
	{
		System.out.println("user created");
	}
	@Test
	public void userdeleted()
	{
		System.out.println("user deleted");
	}
	@Test
	public void modifyuser()
	{
		System.out.println("user modified");
	}
	@Test
	public void userrename()
	{
		System.out.println("user renamed");
	}
}
