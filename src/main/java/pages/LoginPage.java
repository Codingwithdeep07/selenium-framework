package pages;

import org.openqa.selenium.By;

import base.BasePage;

public class LoginPage extends BasePage {

    By username = By.id("userName");
    By password = By.id("password");
    By loginBtn = By.id("login");

    public LoginPage enterUsername(String user) {
        enterText(username,user);
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
