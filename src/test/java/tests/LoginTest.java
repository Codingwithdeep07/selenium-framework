package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import dataproviders.TestDataProvider;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    
    @Test(dataProvider = "loginData",
            dataProviderClass = TestDataProvider.class)
    public void loginTest(String email,
            String password) throws InterruptedException
    {
      LoginPage loginpage =new LoginPage();
        
       loginpage.clickMyAccount();
       Thread.sleep(3000); 
       loginpage.loginBtn();
       Thread.sleep(3000);
       loginpage.enterEmail(email);
       Thread.sleep(3000);
       loginpage.enterPassword(password);
       Thread.sleep(3000);
       loginpage.clickLogin();
       Thread.sleep(3000);
    }
}