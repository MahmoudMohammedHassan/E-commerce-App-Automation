package StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class RegisterSteps {
    SoftAssert soft = new SoftAssert();

    /* The following email and password are used for registration
       and hence used as a valid login credentials in both of
        "F02_Login.feature" and "ResetPasswordSteps.java"*/
    String email = "automation1@test.com";
    String password = "$Passw0rd";

@And("user navigates to register page")
    public void userNavigatesToRegisterPage(){
        Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]")).click();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/register?returnUrl=%2F"));
        soft.assertAll();
}

@When("user enters Valid Credentials and Password")
    public void userEntersData() {
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("Automated");
        Hooks.driver.findElement(By.id("LastName")).sendKeys("LastName");
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
}

@And("user clicks the register button")
    public void userClicksRegisterBtn() {
        Hooks.driver.findElement(By.id("register-button")).click();
}

@Then("user could register successfully")
    public void successfulRegister() {
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
        soft.assertAll();
}


}
