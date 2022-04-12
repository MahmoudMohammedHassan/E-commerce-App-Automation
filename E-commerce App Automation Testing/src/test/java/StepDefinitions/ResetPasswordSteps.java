package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class ResetPasswordSteps {

    String email = "automation1@test.com";
    SoftAssert soft = new SoftAssert();

@And("user enters valid email")
    public void validEmail() {
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);
}
@And("user clicks forgot password?")
    public void clickForgotPassword() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/passwordrecovery"));
        soft.assertAll();
}
@When("user enters his email in password recovery")
    public void enterRecoveryEmail() {
    Hooks.driver.findElement(By.id("Email")).sendKeys(email);
}

@And("user clicks the recover button")
    public void clickRecoverBtn() {
    Hooks.driver.findElement(By.cssSelector("button[name=\"send-email\"]")).click();
}

@Then("message of confirmation that an email has been sent is displayed")
    public void emailSent() {
    String actualResult = Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();
    String expectedResult = "Email with instructions has been sent to you.";
    soft.assertTrue(actualResult.contains(expectedResult), "Error Msg: Message not shown");
    soft.assertAll();
}
}
