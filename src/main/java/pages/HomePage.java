package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    protected WebDriver driver;

    @FindBy(xpath = "//*[@id=\"wrapper\"]/div[2]/div[2]/div/ul/li[6]/a/figure/img")
    WebElement bankLink;

    public void openLoginPage(){

        bankLink.click();
    }
}
