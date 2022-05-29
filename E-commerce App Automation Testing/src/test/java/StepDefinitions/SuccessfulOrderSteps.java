package StepDefinitions;

import Pages.SuccessfulOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SuccessfulOrderSteps {

    SuccessfulOrderPage order = new SuccessfulOrderPage();
    SoftAssert soft = new SoftAssert();

@And("user checks the terms of service box")
    public void checkTermsBox() {
        order.termsOfService().click();
}
@And("user clicks the checkout button")
    public void clickCheckoutBtn() {
        order.checkoutBtb().click();
}

@And("user is directed to checkout page")
    public void checkDirectToCheckoutPage(){
        soft.assertTrue(order.titleOfCheckoutPage().getText().equals("Checkout"));
        soft.assertAll();
}
@And("user selects country")
    public void selectCountry() throws InterruptedException {

    Select selectCountry = new Select(order.country());
    selectCountry.selectByVisibleText("Spain");
    Thread.sleep(3000);

}
}
