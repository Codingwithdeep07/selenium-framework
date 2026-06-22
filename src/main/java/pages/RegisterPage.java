package pages;

import java.util.Date;

import org.openqa.selenium.By;

import base.BasePage;

public class RegisterPage extends BasePage{
	
	By myAccount=By.xpath("//*[@id='top-links']/ul/li[2]");
	By register =By.linkText("Register");
	By firstName= By.id("input-firstname");
	By lastName=By.id("input-lastname");
	By email=By.id("input-email");
	By telephone=By.id("input-telephone");
	By password =By.id("input-password");
	By confirmPassword=By.id("input-confirm");
	By agree=By.name("agree");
	By submit= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By logout=By.linkText("Logout");
	By expectedHeading =By.xpath("//*[@id=\"content\"]/h1");
	By expectedProperDetails=By.id("content");
	By next=By.xpath("//*[@id=\"content\"]/div/div/a");
	By accountInfo=By.linkText("Edit your account information");
	
	public void continueBtn() {
		click(next);
	}
	
	public boolean isaccountInfoDisplayed()
	{
		return isDisplayed(accountInfo);
	}
	
	public boolean isRegisterPageDisplayed() {
	    return isDisplayed(logout);
	}
	
	public String expectedProperDetails() {
		return getText(expectedProperDetails);
	}
	
	public String expectedHeading()
	{
		return getText(expectedHeading);
	}
	
	public void clickMyAccount() {
        click(myAccount);
    }
	
	public void registerBtn() {
		click(register);
	}
	
	public RegisterPage enterFirstname(String fName) {
        enterText(firstName,fName);
        return this;
    }
	
	public RegisterPage enterLastname(String lName) {
        enterText(lastName,lName);
        return this;
    }

	public RegisterPage enterMailId(String emailid) {
        enterText(email,emailid);
        return this;
    }

	public RegisterPage enterPhoneNum(String phnNum) {
        enterText(telephone,phnNum);
        return this;
    }
	
	public RegisterPage enterPassword(String pwd) {
        enterText(password,pwd);
        return this;
    }
	
	public RegisterPage enterConfirmPassword(String confirmpwd) {
        enterText(confirmPassword,confirmpwd);
        return this;
    }
	
	public void agreeBtn() {
		click(agree);
	}
	
	public void submitBtn() {
		click(submit);
	}
	
	public String generateNewEmail() {
		return new Date().toString().replaceAll("\\s", "").replaceAll("\\:", "")+"@gmail.com";
	}
	
	
}
