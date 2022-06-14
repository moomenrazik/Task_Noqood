package tests;

import org.testng.annotations.Test;
import pages.*;

public class TestBankScenarios extends TestBase{
    HomePage homeObject;
    LoginPage loginObject;
    AddCustomerPage addObject;
    CustomerRegisterPage customerRegisterPageObject;
    OpenAccountPage openAccountObject;
    DeletePage deleteObject;

    @Test (priority = 0)
    public void TestAddingCustomerSuccess(){

        homeObject = new HomePage(driver);
        homeObject.openLoginPage();
        loginObject = new LoginPage(driver);
        loginObject.openAddCustomerPage();
        addObject = new AddCustomerPage(driver);
        addObject.openAddCustomerPage();
        customerRegisterPageObject = new CustomerRegisterPage(driver);
        customerRegisterPageObject.registerCustomerPage();
        //Assert.assertEquals();

    }

    @Test (priority = 1 ,dependsOnMethods = {"TestAddingCustomerSuccess"})
    public void TestOpeningCustomer(){
        openAccountObject = new OpenAccountPage(driver);
        openAccountObject.openAccountPage();

    }

    @Test (priority = 2 ,dependsOnMethods = {"TestOpeningCustomer"})
    public void TestDeletingCustomer(){
        deleteObject = new DeletePage(driver);
        deleteObject.deleteAccount();
    }
}
