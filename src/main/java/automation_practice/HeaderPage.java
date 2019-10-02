package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HeaderPage extends BasePage {

    //Locators
    By searchInputField = By.cssSelector("#search_query_top");
    By searchButton = By.cssSelector("button.btn.btn-default.button-search");
    By contactUsLink = By.cssSelector("#contact-link");
    By womenLink = By.cssSelector("li.sfHoverForce>a");
    By tShirt = By.cssSelector("");
    By sCheckBox = By.cssSelector("div#uniform-layered_id_attribute_group_1>span>.checkbox");
    By shortSleeveTShirt = By.cssSelector("div.product-container");
    By addCart = By.xpath("//span[contains(text(),'Add to cart')]");
    By proceedToCheckout = By.cssSelector("a[title ='Proceed to checkout']");
    By iAgreeCheckBox = By.cssSelector("div#uniform-cgv");
    By payBank  = By.cssSelector("p.payment_module>a.bankwire");
    By confirmOrder = By.cssSelector("button.button.btn.btn-default.button-medium");
    By orderConfirmation = By.xpath("//h1[contains(text(),'Order confirmation')]");


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
    public void clickOnWomenLink(){

        WebElement element = driver.findElement(womenLink);
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();

    }

    public void clickOnTShirt(){
        driver.findElement(tShirt).click();
    }
    public void clickOnSizeCheckBox(){
        driver.findElement(sCheckBox);
    }
    public void HoverOverToShortSleeve() {
        WebElement element = driver.findElement(shortSleeveTShirt);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

    }
    public void clickOnAddCart(){
        driver.findElement(addCart).click();
    }
    public void clickOnProceedToCheckout(){
        driver.findElement(proceedToCheckout).click();
    }
    public void clickOnIAgreeCheckBox(){
        driver.findElement(iAgreeCheckBox).click();
    }
    public void setClickOnPayByBank(){
        driver.findElement(payBank).click();
    }
    public void clickOnConfirmOrder(){
        driver.findElement(confirmOrder).click();
    }
    public String getConfirmationOrderText(){
       return driver.findElement(orderConfirmation).getText();

    }

}