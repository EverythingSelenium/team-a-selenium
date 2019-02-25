package the_internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage extends TheInternetBasePage {

    int figureIndex;

    public void hoverOverAFigure(int index) {

        //Assigning the value to this global variable so that can be used to construct the locator for image and caption.
        figureIndex = index + 2;
        By figure = By.cssSelector(".figure:nth-child(" + figureIndex + ") > img");
        WebElement figureEle = driver.findElement(figure);

        Actions actions = new Actions(driver);
        actions.moveToElement(figureEle).build().perform();
    }

    public String getUserName() {
        By figureCaption = By.cssSelector(".figure:nth-child(" + figureIndex + ") .figcaption > h5");
        return driver.findElement(figureCaption).getText();
    }
}
