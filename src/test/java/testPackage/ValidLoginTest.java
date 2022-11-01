package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import pages.HomePage;
import pages.LoginPage;
public class ValidLoginTest extends TestBase{
    LoginPage LoginObject;
    HomePage HomePageObject;
    String Username = "Admin";
    String Password = "admin123";

    @Test
    public void loginWithValidData(){
        LoginObject = new LoginPage(driver);
        HomePageObject = new HomePage(driver);
        //Login to the system with valid utilities
        LoginObject.loginToSystem(Username, Password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Check that login is done successfully
        Assert.assertTrue(HomePageObject.DropDownList.isDisplayed());
        HomePageObject.logout();
    }
}
