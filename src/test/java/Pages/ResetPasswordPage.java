package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import StepDefinitions.Hooks;


public class ResetPasswordPage {

    public WebElement validEmail(){

        return Hooks.driver.findElement(By.id("Email"));
    }


    public WebElement forgotPasswordIcon(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }

    public WebElement recoveryEmail(){

        return Hooks.driver.findElement(By.id("Email"));
    }


    public WebElement recoverBtn(){

        return Hooks.driver.findElement(By.cssSelector("button[name=\"send-email\"]"));
    }

    public WebElement emailSent(){
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

}
