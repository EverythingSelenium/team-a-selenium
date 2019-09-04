package walmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends WalmartBasePage {
    //by element
    private By searchInputElement = By.cssSelector("input#global-search-input");
    private By searchButton = By.cssSelector("button#global-search-submit");
    private By productTitles = By.cssSelector(".product-title-link>span:nth-child(2)");
    private By typeAheadOption = By.cssSelector("#global-search-dropdown>li>div");
    private By typeAheadBoldText = By.cssSelector("#global-search-dropdown>li>div>span");
    private By productPriceElement = By.cssSelector(".price-main-block>span");
    private By productRatings = By.cssSelector(".search-result-product-rating > div.stars");
    private By errorMessage = By.cssSelector("#mainSearchContent");
    private By productTitle1 = By.cssSelector("#global-search-dropdown div.typeahead-text");


    public void enterTextInToSearchInPutField(String text) {

        driver.findElement(searchInputElement).sendKeys(text);
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
    }

    public List<String> getProductTitles() {
        List<WebElement> titleElements = driver.findElements(productTitles);
        List<String> titles = new ArrayList<>();
        for (WebElement titleElement : titleElements) {
            titles.add(titleElement.getText());
        }
        return titles;
    }

    public List<String> getTypeAheadOptions() {
        List<String> options = new ArrayList<>();

        waitForElementClickable(typeAheadOption);
        List<WebElement> typeAheadOptions = driver.findElements(typeAheadOption);
        for (WebElement typeAheadOption : typeAheadOptions) {
            options.add(typeAheadOption.getText());
        }
        return options;
    }

    public List<String> getTypeAheadBoldText() {
        List<String> options = new ArrayList<>();

        waitForElementClickable(typeAheadOption);
        List<WebElement> typeAheadOptions = driver.findElements(typeAheadOption);
        for (WebElement typeAheadOption : typeAheadOptions) {
            WebElement element = typeAheadOption.findElement(By.cssSelector("span"));
            options.add(element.getText());
        }
        return options;
    }

    public List<String> getProductPrice() {
        List<String> productPriceList = new ArrayList<>();
        List<WebElement> productPrices = driver.findElements(productPriceElement);
        for (WebElement productPrice : productPrices) {
            productPriceList.add(productPrice.getText());
        }
        return productPriceList;
    }

    public boolean areRatingsDisplayed(){
        // find the size of all the title elements
        List<WebElement> productTitle = driver.findElements(productTitles);
        int productTitleSize = productTitle.size();

        // find the size of the ratings element
        List<WebElement> ratings = driver.findElements(productRatings);
        int ratingSize = ratings.size();

        // compare the size and return the result
        return productTitleSize == ratingSize;
    }
    public String getErrorMessage(){
       return driver.findElement(errorMessage).getText();

    }
    public List<String> getProductTitles1() {
        List<WebElement> titleElements1 = driver.findElements(productTitle1);
        List<String> titles = new ArrayList<>();
        for (WebElement titleElement : titleElements1) {
            titles.add(titleElement.getText());
        }
        return titles;
    }
    public List<String> getProductTitles2(){
        List<WebElement> titleElement2 = driver.findElements(productTitle1);
        List<String> titles = new ArrayList<>();
        for(WebElement titleElement: titleElement2){
            titles.add(titleElement.getText());
        }
        return titles;
    }
    public void clearText(){
        driver.findElement(searchInputElement).clear();
    }

}
