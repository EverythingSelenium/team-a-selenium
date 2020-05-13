package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class WomenHoverPage extends BasePage {
    By womenHoverElement = By.cssSelector(".sfHover");
    By womenTab = By.cssSelector(".sf-menu>li:nth-child(1)");


    public void hoverWomen() {
        WebElement webElement = driver.findElement(womenTab);
        Actions action = new Actions(driver);
        action.moveToElement(webElement).build().perform();
        waitForVisibilityOfAnElement(womenHoverElement);
    }

    public void getAllDivs(){
        List<WebElement> divList = driver.findElements(By.tagName("div"));
        System.out.println("divList.size() = " + divList.size());
        System.out.println("divList = " + divList);

        for(WebElement div : divList){
//            System.out.println(div.getText());
        }
    }

    public void verifyDescAndPrice(){
        // add values in a list for expected results
        List<String> descList = new ArrayList<>();
        descList.add("Blouse");
        descList.add("Blfdouse");
        descList.add("Bloube");
        descList.add("Blofduse");
        descList.add("Bloubase");

        List<String> priceList = new ArrayList<>();
        priceList.add("$270.00");
        priceList.add("$257.00");
        priceList.add("$2587.00");
        priceList.add("$2777.00");
        priceList.add("$22527.00");


        List<WebElement> priceListElements = driver.findElements(By.cssSelector("price-list"));
        List<WebElement> descListElements = driver.findElements(By.cssSelector("desc-list"));

        int index = 0;
        for(WebElement element : priceListElements){
            String actualPrice = element.getText();
            String expectedPrice = priceList.get(index);

            Assert.assertEquals(expectedPrice,actualPrice);
            index++;
        }

    }

}
