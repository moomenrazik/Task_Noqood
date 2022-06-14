package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    protected WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/button")
    WebElement bankManagerLoginButton;

    public void openAddCustomerPage(){

        bankManagerLoginButton.click();

    }
}
