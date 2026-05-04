package Practices.MvnCommand_01;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createcontactTest() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Execute createcontactTest");
	}

	@Test
	public void modifycontactTest() {
		System.out.println("Execute modifycontactTest");
	}
	
	@Test
	public void deletecontactTest() {
		System.out.println("Execute deletecontactTest");
	}
	
	@Test
	public void contactTest() {
		System.out.println("Execute contactTest");
	}
}
