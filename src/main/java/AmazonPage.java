import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    public void practiceDriver(){
//       String currentURL =  driver.getCurrentUrl();
//        System.out.println(currentURL);
        String title = driver.getTitle();
        System.out.println(title);

    }




}
