package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import javax.swing.*;

public class WomenHoverPage extends BasePage {
    By womenHoverElement = By.cssSelector(".sfHover");


    public void hoverWomen() {
       WebElement  webElement= driver.findElement(womenHoverElement);
        Actions action = new Actions(driver);
        action.moveToElement(webElement).build().perform();

    }

}
