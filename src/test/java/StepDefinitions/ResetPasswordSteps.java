package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import Pages.ResetPasswordPage;

public class ResetPasswordSteps {

    String email = "automation@test.com";
    SoftAssert soft = new SoftAssert();
    ResetPasswordPage reset = new ResetPasswordPage();

@And("user enters valid email")
    public void enterValidEmail() {
        reset.validEmail().sendKeys(email);
}

@And("user clicks forgot password?")
    public void clickForgotPassword() {
        reset.forgotPasswordIcon().click();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/passwordrecovery"));
        soft.assertAll();
}

@When("user enters his email in password recovery")
    public void enterRecoveryEmail() {
        reset.recoveryEmail().sendKeys(email);
}

@And("user clicks the recover button")
    public void clickRecoverBtn() {
        reset.recoverBtn().click();
}

@Then("message of confirmation that an email has been sent is displayed")
    public void emailSentCheck() {
    String actualResult = reset.emailSent().getText();
    String expectedResult = "Email with instructions has been sent to you.";
    soft.assertTrue(actualResult.contains(expectedResult), "Error Msg: Message not shown");
    soft.assertAll();
}

}
