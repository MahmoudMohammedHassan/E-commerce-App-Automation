package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;

public class SearchSteps {

    SoftAssert soft = new SoftAssert();

@Given("user clicks in search field")
    public void userClicksInSearchField() {
        Hooks.driver.findElement(By.id("small-searchterms")).click();
}

@When("user search for a product with its name")
    public void SearchForProduct() {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
}

@And("user clicks enter")
    public void userClicksEnter() {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
}

@Then("user could find the available products matching his search")
    public void userFindProducts() {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=laptop"));
        soft.assertAll();
}
}
