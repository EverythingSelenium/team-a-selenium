package the_internet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FramesPage extends TheInternetBasePage {

   By submitButton = By.cssSelector("");
   By inputBox = By.cssSelector("");

   public void submit(){
       WebElement element = driver.findElement(submitButton);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();", element);
   }

   public void enterTextInSearchBox(){
       WebElement element = driver.findElement(inputBox);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();", element);
   }

    //switch to default content

    //switch to iFrame
}
