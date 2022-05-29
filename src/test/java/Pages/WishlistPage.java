package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class WishlistPage {

    public WebElement select1stProduct(){
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[3]"));
    }

    public WebElement select2ndProduct(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/desktops");
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[2]"));
    }

    public WebElement select3rdProduct(){

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/accessories");
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[2]"));
    }

    public WebElement wishlistIcon(){
        return Hooks.driver.findElement(By.className("ico-wishlist"));
    }



    public List<WebElement> numOfProductsInWishlist(){
        return Hooks.driver.findElements(By.cssSelector("input[class=\"qty-input\"]"));
    }
}
