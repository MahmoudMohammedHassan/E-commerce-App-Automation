package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RegisterPage {



    public WebElement registerIcon(){

        return Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }

    public WebElement enterFirstName(){

        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement enterLastName(){

        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement Email(){

        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement Password(){

        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword(){

        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerBtn(){

        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement validateRegistration(){

        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

}
