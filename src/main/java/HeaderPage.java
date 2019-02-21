import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage {

    //Locators
    By searchInputField = By.cssSelector("#search_query_top");
    By searchButton = By.cssSelector("button.btn.btn-default.button-search");
    By contactUsLink = By.cssSelector("#contact-link");



    public void enterTextInSearchBox(String searchTex) {
        //find an element on the DOM
        WebElement searchInputElement = driver.findElement(searchInputField);
        //click on an element
        searchInputElement.sendKeys(searchTex);
    }

    public void clickOnSearchButton() {
        WebElement searchButtonElement = driver.findElement(searchButton);
        searchButtonElement.click();
    }

    public void clickOnContactUsLink() {
        WebElement contactUsLinkElement = driver.findElement(this.contactUsLink);
        contactUsLinkElement.click();
    }




    }








