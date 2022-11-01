package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "i[class = 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    public WebElement DropDownList;

    @FindBy(xpath = "//a[@href = '/web/index.php/recruitment/viewRecruitmentModule']")
    WebElement RecruitmentLink;

    @FindBy(linkText = "Vacancies")
    WebElement VacanciesButton;
    @FindBy(linkText = "Logout")
    WebElement logoutButton;

    public void openRecruitmentLink(){
        clickButton(RecruitmentLink);
    }

    public void openVacanciesTab(){
        clickButton(VacanciesButton);
    }

    public void logout(){
        clickButton(DropDownList);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickButton(logoutButton);
    }
}
