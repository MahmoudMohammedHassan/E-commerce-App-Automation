package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebElement dropdown() {

     return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement productPrice(){
     return Hooks.driver.findElement(By.xpath("(//span[@class=\"price actual-price\"])[2]"));

    }

    public WebElement categorySelect(){

        return Hooks.driver.findElement(By.xpath("(//a[@href=\"/electronics\"])[1]"));
    }

    public WebElement subCategorySelect(){

        return Hooks.driver.findElement(By.xpath("(//a[@href=\"/cell-phones\"])[1]"));
    }

    public WebElement colorCategoryHover(){
        return Hooks.driver.findElement(By.xpath("(//a[@href=\"/apparel\"])[1]"));
    }


    public WebElement colorCategorySelect(){
        return Hooks.driver.findElement(By.xpath("(//a[@href=\"/shoes\"])[1]"));
    }

    public WebElement colorCheckBox(){
        return Hooks.driver.findElement(By.cssSelector("[data-option-id=\"14\"]"));
    }

}
