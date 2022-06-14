package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {

    public static WebDriver driver;

    @BeforeSuite
    public void startDriver(){

        System.setProperty("webdriver.chrome.driver", System.getProperty(("user.dir")+"drivers\\chromedriver.exe"));
        driver = new ChromeDriver();
        driver.navigate().to("https://www.way2automation.com/protractor-angularjs-practice-website.html");
    }
    @AfterSuite
    public void closeDriver(){
        driver.quit();
    }
}
