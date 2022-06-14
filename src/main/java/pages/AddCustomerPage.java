package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends PageBase{
    public AddCustomerPage(WebDriver driver) {
        super(driver);
    }
    protected WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/button[1]")
    WebElement addCustomerButton;

    public void openAddCustomerPage(){

        addCustomerButton.click();
    }
}
