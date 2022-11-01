package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void openBrowser(@Optional("chrome") String browser)
    {
        if (browser.equalsIgnoreCase("Chrome"))
        {
            //SetUp chrome driver
            WebDriverManager.chromedriver().setup();
            //Initialize chrome driver
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            //SetUp firefox driver
            WebDriverManager.firefoxdriver().setup();
            //Initialize chrome driver
            driver = new FirefoxDriver();
        }
        //Navigate to Website
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void closeBrowser()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }
}
