package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CompareListPage {

    public WebElement slctFirstProduct(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/notebooks");
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-compare-list-button\"])[1]"));
    }

    public WebElement slctSecondProduct(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/notebooks");
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-compare-list-button\"])[3]"));
    }

    public WebElement slctThirdProduct(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/notebooks");
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-compare-list-button\"])[6]"));
    }

    public WebElement productComparisonIcon(){

        return Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a"));
    }

    public List<WebElement> namesOfProductsInCompareList(){
        return Hooks.driver.findElements(By.xpath("//tr[@class=\"product-name\"]/td/a"));

    }
}
