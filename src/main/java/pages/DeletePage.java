package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletePage extends PageBase{
    public DeletePage(WebDriver driver) {
        super(driver);
    }
    protected WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/form/div/div/input")
    WebElement searchButton;
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[5]/button")
    WebElement deleteButton;

    public void deleteAccount(){

        searchButton.sendKeys("Moomen Abdelrazik");
        deleteButton.click();
    }
}
