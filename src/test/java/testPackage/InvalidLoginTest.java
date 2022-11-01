package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class InvalidLoginTest extends TestBase{
    LoginPage LoginObject;
    String Username = "Admin";
    String Password = "invalid";

    @Test
    public void loginWithInvalidData(){
        LoginObject = new LoginPage(driver);
        System.out.println(Thread.currentThread().getId());
        //Login to system using invalid data
        LoginObject.loginToSystem(Username, Password);
        //Check that error message is displayed
        Assert.assertTrue(LoginObject.errorMessage.isDisplayed());
        //Check the content of the error message
        Assert.assertEquals(LoginObject.errorMessage.getText(),"Invalid credentials");
    }
}
