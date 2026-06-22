package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import base.BaseTest;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {
	
	@Test
	public void verifyMyAccountClick() throws InterruptedException
	{
		    RegisterPage register = new RegisterPage();
		    
		    Thread.sleep(3000);

		    System.out.println(register.generateNewEmail());
	        register.clickMyAccount();
	        Thread.sleep(1000);
	        register.registerBtn();
	        Thread.sleep(1000);
	        register.enterFirstname("Test");
	        Thread.sleep(1000);
	        register.enterLastname("User");
	        Thread.sleep(1000);
	        register.enterMailId("TestUser121@yopmail.com");
	        Thread.sleep(1000);
	        register.enterPhoneNum("0123456789");
	        Thread.sleep(1000);
	        register.enterPassword("Admin@123");
	        Thread.sleep(1000);
	        register.enterConfirmPassword("Admin@123");
	        Thread.sleep(1000);
	        register.agreeBtn();
	        Thread.sleep(1000);
	        register.submitBtn();
	        Thread.sleep(1000);
	        System.out.println("Account Registration Successfully.");
	        
	        Assert.assertTrue(register.isRegisterPageDisplayed(),"Logout button is not displayed");
	        Thread.sleep(1000);
	        String expected=register.expectedHeading();
	        String actual="Your Account Has Been Created!";
	        Assert.assertEquals(actual, expected);
	        Thread.sleep(1000);

	        String actualProperDetails1="Congratulations! Your new account has been successfully created!";
	        String actualProperDetails2="You can now take advantage of member privileges to enhance your online shopping experience with us.";
	        String actualProperDetails3="If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
	        String actualProperDetails4="contact us.";
	        
	        String expProperDetails=register.expectedProperDetails();
	        
	        Assert.assertTrue(expProperDetails.contains(actualProperDetails1));
	        Assert.assertTrue(expProperDetails.contains(actualProperDetails2));
	        Assert.assertTrue(expProperDetails.contains(actualProperDetails3));
	        Assert.assertTrue(expProperDetails.contains(actualProperDetails4));
	        Thread.sleep(1000);
	        
	        register.continueBtn();
	        Thread.sleep(1000);

	        boolean result=register.isaccountInfoDisplayed();
	        
	        Assert.assertTrue(result);
	        Thread.sleep(1000);


	}

}
