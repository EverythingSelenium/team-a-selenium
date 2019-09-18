package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

    public void enterMessageText(String message){
        WebElement messageElement = driver.findElement(messageInput);
        messageElement.sendKeys(message);

    }

    public void clickOnSendButton(){
        WebElement sendButtonEle = driver.findElement(sendButton);
        sendButtonEle.click();
    }

    public String getSuccessMessage(){
        WebElement successMessageEle = driver.findElement(successMessage);
        return successMessageEle.getText();
    }

    public String getErrorMessage(){
        WebElement errorMessageEle = driver.findElement(errorMessage);
        return errorMessageEle.getText();
    }
    public String getMessageText(){
       return driver.findElement(messageInput).getText();
    }

    public void waitForLoadingBarToDisappear(){
        waitForInvisibilityOfAnElement(loadingBar);
    }

    public void pp(){
        String title = driver.getTitle();
        System.out.println("title = " + title);
        System.out.println(driver.getCurrentUrl());

    }
}