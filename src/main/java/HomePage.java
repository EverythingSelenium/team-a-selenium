import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{

    //Locators
    By productItems = By.cssSelector(".left-block");

    //Action Methods
    public int getNoOfProductItems() {
        List<WebElement> element = driver.findElements(productItems);
        return element.size();
    }
}
