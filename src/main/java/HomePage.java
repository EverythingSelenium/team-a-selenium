import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{

    //Locators
    By sortBySelect = By.cssSelector("#selectProductSort");

    //Action Methods
    public void selectSortByOptions(int option)  {
        WebElement element = driver.findElement(sortBySelect);
        Select select = new Select(element);
        select.selectByIndex(option);
    }

}
