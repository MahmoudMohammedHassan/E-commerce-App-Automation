package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class TagPage {

    public WebElement selectCat(){
        return Hooks.driver.findElement(By.xpath("(//a[@href=\"/jewelry\"])[1]"));
    }

    public List <WebElement> allTags(){
        List <WebElement> Tags =  Hooks.driver.findElements(By.xpath("//div[@class=\"tags\"]/ul/li/a"));
        return Tags;
    }

    public WebElement TagPageTitle(){
        return Hooks.driver.findElement(By.cssSelector("[class=\"page-title\"]"));
    }

}
