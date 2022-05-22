package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class SelectCategorySteps {

    SoftAssert soft = new SoftAssert();
    HomePage category = new HomePage();
@When("user hover a category")
    public void hoverCategory() throws InterruptedException {
      Actions action = new Actions(Hooks.driver);
      action.moveToElement(category.categorySelect()).perform();
      Thread.sleep(1000);
}

@When("user selects a subcategory")
    public void selectSubcategory() {
    category.subCategorySelect().click();
}

@Then("user should be directed to the page of the selected subcategory")
    public void checkSelectedSubCategory(){
    soft.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/cell-phones"));
    soft.assertAll();

}


}
