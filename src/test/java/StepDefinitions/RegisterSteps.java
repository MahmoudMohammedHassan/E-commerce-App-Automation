package StepDefinitions;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class RegisterSteps {
    SoftAssert soft = new SoftAssert();
    RegisterPage register = new RegisterPage();

    /* The following email and password are used for registration
  and hence used as a valid login credentials in both of
   "F02", "F05","F06","F07" and "ResetPasswordSteps.java"  */
    String email = "automation@test.com";
    String password = "$Passw0rd";


@Given("user navigates to register page")
    public void userNavigatesToRegisterPage(){

        register.registerIcon().click();

        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/register?returnUrl=%2F"));
        soft.assertAll();
}

@When("user enters Valid Credentials and Password")
    public void userEntersData() {

        register.enterFirstName().sendKeys("Automated");
        register.enterLastName().sendKeys("Test");
        register.Email().sendKeys(email);
        register.Password().sendKeys(password);
        register.confirmPassword().sendKeys(password);

}

@And("user clicks the register button")
    public void userClicksRegisterBtn() {
        register.registerBtn().click();
}

@Then("user could register successfully")
    public void successfulRegister(){
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
        soft.assertTrue(register.validateRegistration().isDisplayed());
        soft.assertAll();

}


}
