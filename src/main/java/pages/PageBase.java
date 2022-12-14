package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;


    //create constructor
    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickButton(WebElement button){
        button.click();
    }
    public void setText(WebElement textBox, String value)
    {
        textBox.sendKeys(value);
    }
}
