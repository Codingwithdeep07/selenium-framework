package tests;

import org.testng.annotations.Test;

import dataproviders.TestDataProvider;

public class LoginTest {

    @Test(dataProvider = "loginData",
          dataProviderClass = TestDataProvider.class)
    public void verifyLogin(String username,
                            String password) {

        System.out.println(username);
        System.out.println(password);
    }
}