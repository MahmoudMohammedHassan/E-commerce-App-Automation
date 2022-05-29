package StepDefinitions;


import Pages.WishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class WishlistSteps {

    WishlistPage wish = new WishlistPage();
    SoftAssert soft = new SoftAssert();
    int totalNumOfProductsAddedToWishlist=0;

@Given("user adds three different products to wishlist")
    public void addProductsToWishlist(){
        wish.select1stProduct().click();
        wish.select2ndProduct().click();
        wish.select3rdProduct().click();
        wish.select3rdProduct().click();
}

@When("user navigates to wishlist")
    public void clickWishlistIcon() {
        wish.wishlistIcon().click();
}

@And("user is directed to wishlist")
    public void checkDirectedToWishlist(){
            soft.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/wishlist"));
            soft.assertAll();
}

@And("user counts the number of products in his wishlist")
    public void countNumbOfProductsInWishlist(){

    int numOfDiffProducts = wish.numOfProductsInWishlist().size();

    for (int i=0;i<numOfDiffProducts;i++){
        String value = wish.numOfProductsInWishlist().get(i).getAttribute("value");
        totalNumOfProductsAddedToWishlist = totalNumOfProductsAddedToWishlist + Integer.parseInt(value);
    }
}

@Then("user should find the number of products in his wishlist matches the number of products he has added")
    public void checkNumOfProductsInWishlist(){

    int actualNumberOfProductsAddedInWishlist = 4;
    Assert.assertEquals(actualNumberOfProductsAddedInWishlist,
            totalNumOfProductsAddedToWishlist);
    soft.assertAll();
}

}
