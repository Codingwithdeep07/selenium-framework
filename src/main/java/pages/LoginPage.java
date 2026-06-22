package pages;

import org.openqa.selenium.By;

import base.BasePage;

public class LoginPage extends BasePage {

	By login=By.linkText("Login");
    By email= By.id("input-email");
    By password = By.id("input-password");
    By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By myAccount=By.xpath("//*[@id='top-links']/ul/li[2]");
    
    public void clickMyAccount() {
        click(myAccount);
    }
    
    public void loginBtn() {
		click(login);
	}
    
    public LoginPage enterEmail(String user) {
        enterText(email,user);
        return this;
    }

    public LoginPage enterPassword(String pass) {
        enterText(password,pass);
        return this;
    }

    public HomePage clickLogin() {
        click(loginBtn);
        return new HomePage();
    }
}
