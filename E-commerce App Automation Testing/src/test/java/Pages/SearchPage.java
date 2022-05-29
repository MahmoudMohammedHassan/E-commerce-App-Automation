package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public WebElement searchField(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

}
