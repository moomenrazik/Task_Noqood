package pages;

import com.google.common.base.CharMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage extends PageBase{
    public OpenAccountPage(WebDriver driver) {
        super(driver);
    }
    protected WebDriver driver;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/button[2]")
    WebElement openAccountButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button")
    WebElement processButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/button[3]")
    WebElement customersButton;

    public void openAccountPage(){

        openAccountButton.click();
        Select customerNameDropdown = new Select(driver.findElement(By.id("userSelect")));
        customerNameDropdown.selectByVisibleText("Moomen Abdelrazik");
        Select currencyNameDropdown = new Select(driver.findElement(By.id("currency")));
        currencyNameDropdown.selectByIndex(2);
        processButton.click();

        String alertText = driver.switchTo().alert().getText();
        //use charmatcher to get customer id
        String accountnumber = CharMatcher.inRange('0', '9').retainFrom(alertText);
        driver.switchTo().alert().dismiss();

        customersButton.click();
    }
}
