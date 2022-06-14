package pages;

import com.google.common.base.CharMatcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerRegisterPage extends PageBase {
    public CustomerRegisterPage(WebDriver driver) {
        super(driver);
    }
    protected WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input")
    WebElement firstNameButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/input")
    WebElement lastNameButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/input")
    WebElement postCodeButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button")
    WebElement confirmButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/button[3]")
    WebElement customerTab;

    public void registerCustomerPage(){

        firstNameButton.sendKeys("Moomen");
        lastNameButton.sendKeys("Abdelrazik");
        postCodeButton.sendKeys("65125");
        confirmButton.click();
        String alertText = driver.switchTo().alert().getText();
        //use charmatcher to get customer id
        String customerId = CharMatcher.inRange('0', '9').retainFrom(alertText);
        driver.switchTo().alert().dismiss();
        customerTab.click();


    }
}
