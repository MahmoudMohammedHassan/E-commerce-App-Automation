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

@And("user enters city")
    public void enterCity(){
        order.city().sendKeys("Madrid");
}

@And("user enters Address 1")
    public void enterAddress(){
        order.Address().sendKeys("Gran Via");
}

@And("user enters postal code")
    public void enterPostalCode(){
        order.postalCode().sendKeys("14359");
}

@And("user enters phone number")
    public void enterPhoneNumber(){
        order.phoneNumber().sendKeys("09547203816");
}

@And("user enters first continue button")
    public void clickContinueButton(){
        order.continueBtn().click();
}

@And("user clicks second continue button")
    public void clickContinueButton2() {
        order.continueBtn2().click();
}

@And("user clicks third continue button")
    public void clickContinueButton3(){
        order.continueBtn3().click();
}

@And("user clicks forth continue button")
    public void clickContinueButton4(){
        order.continueBtn4().click();
}

@And("user clicks confirm button")
    public void clickConfirmBtn(){
        order.confirmBtn().click();
}

@Then("user should be directed to the checkout page and confirmation message is displayed")
    public void checkConfirmationMsg(){
        soft.assertTrue(order.confirmMsg().getText().equals("Your order has been successfully processed!"));
        soft.assertAll();
}
}

