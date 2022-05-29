package StepDefinitions;

import Pages.CompareListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class CompareListSteps {

    CompareListPage compare = new CompareListPage();
    SoftAssert soft = new SoftAssert();

@Given("user adds three different products to compare list")
    public void addProductsToCompareList(){

    compare.slctFirstProduct().click();
    compare.slctSecondProduct().click();
    compare.slctThirdProduct().click();
}

@When("user navigates to compare list")
    public void navigateToCompareList() {

        compare.productComparisonIcon().click();
}

@And("user is directed to compare list")
    public void checkDirectedToCompareList(){

    soft.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/compareproducts"));
    soft.assertAll();
}

@Then("user should find the names of products in the compare list match that he has selected")
    public void validateNamesOfProductsInCompareList(){
        soft.assertTrue(compare.namesOfProductsInCompareList().get(0).getText().equals("Samsung Series 9 NP900X4C Premium Ultrabook"));
        soft.assertTrue(compare.namesOfProductsInCompareList().get(1).getText().equals("HP Envy 6-1180ca 15.6-Inch Sleekbook"));
        soft.assertTrue(compare.namesOfProductsInCompareList().get(2).getText().equals("Apple MacBook Pro 13-inch"));
        soft.assertAll();
}

}
