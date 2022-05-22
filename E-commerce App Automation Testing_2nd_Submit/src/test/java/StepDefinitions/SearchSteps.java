package StepDefinitions;

import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class SearchSteps {

    SoftAssert soft = new SoftAssert();
    SearchPage search = new SearchPage();

@Given("user clicks in search field")
    public void userClicksInSearchField() {
        search.searchField().click();
}

@When("user search for a product with its name")
    public void SearchForProduct() {
        search.searchField().sendKeys("laptop");
}

@And("user clicks enter")
    public void userClicksEnter() {
        search.searchField().sendKeys(Keys.ENTER);
}

@Then("user could find the available products matching his search")
    public void userFindProducts() {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=laptop"));
        soft.assertAll();
}
}
