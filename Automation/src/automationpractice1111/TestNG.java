package automationpractice1111;

import org.testng.annotations.Test;

public class TestNG {

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
	@Test(enabled=true)
	public void userrename()
	{
		System.out.println("user renamed");
	}
}
