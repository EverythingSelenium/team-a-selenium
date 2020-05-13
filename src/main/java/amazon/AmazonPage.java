package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonPage extends AmazonBasePage {
    By searchInputBox = By.cssSelector("input#twotabsearchtextbox");
    By searchButton = By.cssSelector("span#nav-search-submit-text");

    public void enterTextInSearchInputBox(String text){
        WebElement element = driver.findElement(searchInputBox);
        element.sendKeys(text);
    }
    public void clickOnSearchButton(){
        WebElement element = driver.findElement(searchButton);
        element.click();
    }





}
