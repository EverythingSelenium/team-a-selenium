import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.support.ui.Select;


public class HomePage extends BasePage{

    //Locators
    By productItems = By.cssSelector(".left-block");
    By sortBySelect = By.cssSelector("#selectProductSort");

    //Action Methods
    public int getNoOfProductItems() {
        List<WebElement> element = driver.findElements(productItems);
        return element.size();
    }

    public void selectSortByOptions(int option)  {
        WebElement element = driver.findElement(sortBySelect);
        Select select = new Select(element);
        select.selectByIndex(option);
    }

}
