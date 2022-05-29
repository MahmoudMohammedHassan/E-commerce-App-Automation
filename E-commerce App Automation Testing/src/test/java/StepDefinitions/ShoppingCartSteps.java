package StepDefinitions;


import Pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ShoppingCartSteps {

   SoftAssert soft = new SoftAssert();
   ShoppingCartPage cartPage = new ShoppingCartPage();
   int totalNumOfProductsAddedToShoppingCart = 0;

@Given("user adds three different products to shopping cart")
    public void addProductsToShoppingCart(){

    cartPage.selectFirstProduct().click();
    cartPage.selectSecondProduct().click();
    cartPage.selectThirdProduct().click();
    cartPage.selectThirdProduct().click();
}
@When("user navigates to shopping cart")
    public void clickOnShoppingCartIcon() {

    cartPage.shoppingCartIcon().click();
}

@And("user is directed to shopping cart page")
    public void checkDirectedToShoppingCartPage(){

    soft.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/cart"));
    soft.assertAll();
}

@And("user counts the number of products in his shopping cart")
    public void countNumbOfProductsInShoppingCart(){


        int numOfDifferentProducts = cartPage.numOfProductsInShoppingCart().size();

        for (int i=0;i<numOfDifferentProducts;i++){
        String value = cartPage.numOfProductsInShoppingCart().get(i).getAttribute("value");
        totalNumOfProductsAddedToShoppingCart = totalNumOfProductsAddedToShoppingCart + Integer.parseInt(value);
        }
}

@Then("user should find the number of products in his shopping cart matches the number of products he has added")
    public void checkNumOfProductsInShoppingCart(){

    int actualNumberOfProductsAddedInShoppingCart = 4;
    Assert.assertEquals(actualNumberOfProductsAddedInShoppingCart,
            totalNumOfProductsAddedToShoppingCart);
    soft.assertAll();
}

}

