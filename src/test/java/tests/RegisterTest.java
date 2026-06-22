package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {
	
	@Test
	public void verifyMyAccountClick() throws InterruptedException
	{
		    RegisterPage register = new RegisterPage();
		    
		    Thread.sleep(3000);

	        register.clickMyAccount();
	        Thread.sleep(3000);
	        register.registerBtn();
	        Thread.sleep(3000);
	        register.enterFirstname("Test");
	        Thread.sleep(3000);
	        register.enterLastname("User");
	        Thread.sleep(3000);
	        register.enterMailId("TestUser123@yopmail.com");
	        Thread.sleep(3000);
	        register.enterPhoneNum("0123456789");
	        Thread.sleep(3000);
	        register.enterPassword("Admin@123");
	        Thread.sleep(3000);
	        register.enterConfirmPassword("Admin@123");
	        Thread.sleep(3000);
	        register.agreeBtn();
	        Thread.sleep(3000);
	        register.submitBtn();
	        Thread.sleep(3000);
	        System.out.println("My Account clicked successfully");
	}

}
