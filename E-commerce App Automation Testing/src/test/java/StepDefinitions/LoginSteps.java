package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class LoginSteps {
    SoftAssert soft = new SoftAssert();

@And("user navigates to login page")
    public void userNavigatesToLoginPage() {
         Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
         soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F"));
         soft.assertAll();
}


@When("^user enters \"(.*)\" and \"(.*)\"$")
    public void validLogin(String email, String password) {
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);

    }

@And("user clicks the login button")
    public void loginBtnClick() {
        Hooks.driver.findElement(By.cssSelector("[class=\"button-1 login-button\"]")).click();
}

@Then("user could login successfully")
    public void successfulLogin() {
    soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
    soft.assertAll();
}

@Then("user could not login")
    public void unsuccessfulLogin() {
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]")).isDisplayed());
        soft.assertAll();


    }


}
