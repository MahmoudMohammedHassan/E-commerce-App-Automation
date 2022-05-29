package StepDefinitions;


import Pages.TagPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class TagSelectionSteps {

    SoftAssert soft = new SoftAssert();
    TagPage tag = new TagPage();
    Random randomNumber = new Random();
    int randNum;

@Given("user selects a category")
    public void selectCategory(){

    tag.selectCat().click();
}

@And("user is directed to the selected category page")
    public void checkSelectedCat(){

    soft.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/jewelry"));
    soft.assertAll();
}

@When("user selects a tag")
    public void selectAnyTag() {

    int availableNumOfTags = tag.allTags().size();
    randNum = randomNumber.nextInt(availableNumOfTags);
    tag.allTags().get(randNum).click();

}

@Then("user should be directed to the page of the products tagged with the selected tag")
    public void checkSelectedTag(){

    soft.assertTrue(tag.TagPageTitle().getText().equals("Products tagged with '" + tag.allTags().get(randNum).getText() + "'"));
    soft.assertAll();
}


}
