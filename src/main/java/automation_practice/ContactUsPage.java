package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;
import sun.plugin.javascript.navig.Window;

import java.awt.*;

public class ContactUsPage extends BasePage {

    // locators
    private By subjectHeadingSelect = By.cssSelector("#id_contact");
    private By emailAddressInput = By.id("email");
    private By orderReferenceInput = By.id("id_order");
    private By messageInput = By.id("message");
    private By sendButton = By.cssSelector("#submitMessage > span");
    private By successMessage = By.className("alert-success");
    private By errorMessage = By.className("alert-danger");
    private By loadingBar = By.cssSelector("#loading:not([style='display: none;'])");
    private By homeIcon = By.cssSelector(".home");
    By searchButton = By.cssSelector("form#searchbox button[type='submit']");

    //methods
    public void selectSubjectHeading(int option) {
        WebElement element = driver.findElement(subjectHeadingSelect);
        Select select = new Select(element);
        select.selectByIndex(option);

    }

    public void enterEmailAddress(String email) {
        WebElement emailAddressElement = driver.findElement(emailAddressInput);
        emailAddressElement.sendKeys(email);

    }

    public void enterOrderReference(String order) {
        WebElement orderReferenceElement = driver.findElement(orderReferenceInput);
        orderReferenceElement.sendKeys(order);
    }

    public void enterMessageText(String message) {
        WebElement messageElement = driver.findElement(messageInput);
        messageElement.sendKeys(message);

    }

    public void clickOnSendButton() {
        WebElement sendButtonEle = driver.findElement(sendButton);
        clickOnElement(sendButtonEle);

        //sendButtonEle.click();
    }

    public String getSuccessMessage() {
        WebElement successMessageEle = driver.findElement(successMessage);
        return successMessageEle.getText();
    }

    public String getErrorMessage() {
        WebElement errorMessageEle = driver.findElement(errorMessage);
        return errorMessageEle.getText();
    }

    public String getMessageText() {
        return driver.findElement(messageInput).getText();
    }

    public void waitForLoadingBarToDisappear() {
        waitForInvisibilityOfAnElement(loadingBar);
    }

    public void pp() {
        String title = driver.getTitle();
        System.out.println("title = " + title);
        System.out.println(driver.getCurrentUrl());

    }

    public void clickOnHomeButton() {
        driver.findElement(homeIcon).click();

    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public String javascriptGetTitle() {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        return js.executeScript("return document.title").toString();

    }

    public void clickOnElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
    }
    public void scrollDown(){
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
    }
    public void scrollInToView(){
        By iCon = By.cssSelector("em#icon-phone");
        WebElement element = driver.findElement(iCon);

        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void scrollDownToEnd(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.scrollHeight)");
    }

    public void generateAlert(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("alert('this is  a   test')");
    }
    public void enterTextJs(String id, String textValue) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('" + id + "').value='" + textValue + "';");
    }

}