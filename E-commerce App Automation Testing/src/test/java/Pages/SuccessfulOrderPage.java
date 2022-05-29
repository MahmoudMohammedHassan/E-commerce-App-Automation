package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SuccessfulOrderPage {


    public WebElement termsOfService(){
        return Hooks.driver.findElement(By.id("termsofservice"));
    }

    public WebElement checkoutBtb(){
        return Hooks.driver.findElement(By.id("checkout"));
    }

    public WebElement titleOfCheckoutPage(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"page checkout-page\"]/div/h1"));
    }

    public WebElement country(){
        return Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));

    }
}
