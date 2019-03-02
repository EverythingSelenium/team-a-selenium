package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.support.ui.Select;


public class HomePage extends BasePage{

    //Locators
    By productItems = By.cssSelector("#homefeatured > li");
    By sortBySelect = By.cssSelector("#selectProductSort");

    //Action Methods
    public int getNoOfProductItems() {
        List<WebElement> elements = driver.findElements(productItems);
        return elements.size();
    }

    public List<String> getItemDesc(){
        List<String> itemDescs = new ArrayList<>();
        List<WebElement> elements = driver.findElements(productItems);
        for(WebElement element: elements){
            String elementText = element.getText();
            itemDescs.add(elementText);
        }
        return itemDescs;
    }

    public void selectSortByOptions(int option)  {
        WebElement element = driver.findElement(sortBySelect);
        Select select = new Select(element);
        select.selectByIndex(option);
    }

}
