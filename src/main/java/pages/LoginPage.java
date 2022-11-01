package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "username")
    WebElement UsernameField;

    @FindBy(name = "password")
    WebElement PasswordField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement LoginButton;

    @FindBy(xpath = "//p[@class = 'oxd-text oxd-text--p oxd-alert-content-text']")
    public WebElement errorMessage;

    public void loginToSystem(String Username, String Password){
        setText(UsernameField, Username);
        setText(PasswordField, Password);
        clickButton(LoginButton);
    }
}
