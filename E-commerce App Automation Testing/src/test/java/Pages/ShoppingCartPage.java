package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartPage {

    public WebElement selectFirstProduct(){
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]"));
    }

    public WebElement selectSecondProduct(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/desktops");
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]"));
    }

    public WebElement selectThirdProduct(){

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/accessories");
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]"));
    }

    public WebElement shoppingCartIcon(){
        return Hooks.driver.findElement(By.className("cart-label"));
    }

    public   List<WebElement> numOfProductsInShoppingCart(){
        return Hooks.driver.findElements(By.cssSelector("input[class=\"qty-input\"]"));
    }


}
