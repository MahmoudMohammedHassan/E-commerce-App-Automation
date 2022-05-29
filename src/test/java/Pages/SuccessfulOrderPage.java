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

    public WebElement city(){
        return Hooks.driver.findElement(By.id("BillingNewAddress_City"));
    }

    public WebElement Address(){
        return Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));
    }

    public WebElement postalCode(){
        return Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }

    public WebElement phoneNumber(){
        return Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }

    // First Continue Button of "1. Billing Address"
    public WebElement continueBtn(){
        return Hooks.driver.findElement(By.name("save"));
    }


    // Second Continue Button of "3. Shipping Method"
    public WebElement continueBtn2(){
        return Hooks.driver.findElement(By.cssSelector("[class=\"button-1 shipping-method-next-step-button\"]"));
    }

    // Third Continue Button of "4. Payment Method"
    public WebElement continueBtn3(){
        return Hooks.driver.findElement(By.cssSelector("[class=\"button-1 payment-method-next-step-button\"]"));
    }

    // Forth Continue Button of "5. Payment Information"
    public WebElement continueBtn4(){
        return Hooks.driver.findElement(By.cssSelector("[class=\"button-1 payment-info-next-step-button\"]"));
    }

    public WebElement confirmBtn(){
        return Hooks.driver.findElement(By.cssSelector("[class=\"button-1 confirm-order-next-step-button\"]"));
    }

    public WebElement confirmMsg(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"section order-completed\"]/div/strong"));
    }

}
