package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class ColorFilterSteps {
    SoftAssert soft = new SoftAssert();
    HomePage category = new HomePage();

    @Given("user selects a category that includes colored items")
    public void selectCategory_Colors() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(category.colorCategoryHover()).perform();
        Thread.sleep(1000);
        category.colorCategorySelect().click();
        Thread.sleep(2000);
    }

    @When("user is directed to the page of the selected category")
    public void checkRedirectToCategory(){
        soft.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/shoes"));
        soft.assertAll();
    }

    @And("user selects a specific color")
    public void selectColor() {
        category.colorCheckBox().click();
    }

    @Then("items are filtered according to the selected color")
    public void checkItemsFiltered(){
        soft.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=14"));
        soft.assertAll();

    }

}

