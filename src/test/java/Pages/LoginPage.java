package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebElement logInIcon(){

        return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }

    public WebElement Email(){

        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement Password(){

        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginBtn(){

        return  Hooks.driver.findElement(By.cssSelector("[class=\"button-1 login-button\"]"));
    }

    public WebElement unsuccessfulLogMsg(){

        return  Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }


}
