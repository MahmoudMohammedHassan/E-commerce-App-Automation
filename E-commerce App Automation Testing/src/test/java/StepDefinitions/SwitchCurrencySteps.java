package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SwitchCurrencySteps {

    SoftAssert soft =new SoftAssert();
    HomePage object = new HomePage();
    @When("user selects currency to be Euro")
    public void switchCurrency() {

        Select selectCurrency = new Select(object.dropdown());
        selectCurrency.selectByVisibleText("Euro");
    }

    @Then("The price of a product should be displayed in US Dollars")
    public void validateDefaultCurrency() throws InterruptedException {
        Thread.sleep(1000);
        String actualResult = object.productPrice().getText();
        String expectedResult = "$1,800.00";
        soft.assertTrue(actualResult.equals(expectedResult),"US Dollar is not the default currency");
        soft.assertAll();
    }

    @Then("The price of a product should be displayed in Euro")
    public void validateCurrencyChanged() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = object.productPrice().getText();
        String expectedResult = "€1548.00";
        soft.assertTrue(actualResult.equals(expectedResult),"Currency has not been changed to Euro");
        soft.assertAll();

        // Reset the currency to "US Dollar" since we validate that it is the default currency at first
        Select selectCurrency = new Select(object.dropdown());
        selectCurrency.selectByVisibleText("US Dollar");
    }
}
