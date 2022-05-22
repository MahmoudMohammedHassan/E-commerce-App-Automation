package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class LoginSteps {
    SoftAssert soft = new SoftAssert();
    LoginPage login = new LoginPage();

@Given("user navigates to login page")
    public void userNavigatesToLoginPage() {

         login.logInIcon().click();
         soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F"));
         soft.assertAll();
}


@When("^user enters \"(.*)\" and \"(.*)\"$")
    public void validLogin(String email, String password) {
        login.Email().sendKeys(email);
        login.Password().sendKeys(password);
    }

@And("user clicks the login button")
    public void loginBtnClick() {
      login.loginBtn().click();
}

@Then("user could login successfully")
    public void successfulLogin() {
    soft.assertTrue(Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
    soft.assertAll();
}

@Then("user could not login")
    public void unsuccessfulLogin() {
        soft.assertTrue(login.unsuccessfulLogMsg().isDisplayed());
        soft.assertAll();
    }


}
