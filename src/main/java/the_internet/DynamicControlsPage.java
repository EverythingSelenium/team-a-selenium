package the_internet;

import org.openqa.selenium.By;

public class DynamicControlsPage extends TheInternetBasePage{

    By checkbox = By.cssSelector("#checkbox>input");
    By removeButton = By.cssSelector("#checkbox-example>button");
    By loadingBar = By.cssSelector("#loading:not([style='display: none;'])");
    By message = By.id("message");
    By addButton = By.cssSelector("#checkbox-example>button");
    By enableButton = By.cssSelector("#input-example>button");
    By enterText = By.cssSelector("#input-example>input");
    By disableButton = By.cssSelector("#input-example>button");

    public void clickOnCheckbox() {
        driver.findElement(checkbox).click();
    }

    public void clickOnRemoveButton() {
        driver.findElement(removeButton).click();
    }

    public void waitForLoadingBarToDisappear() {
        waitForInvisibilityOfAnElement(loadingBar);
    }

    public String getMessage() {
        return driver.findElement(message).getText();
    }

    public void clickOnAddButton(){
        driver.findElement(addButton).click();
    }

    public void enterTextWhenEnabled(String Text){
        driver.findElement(enterText).sendKeys(Text);
    }


    public void clickOnEnableButton() {
        driver.findElement(enableButton).click();
    }


    public void clickOnDisableButton() {
        driver.findElement(disableButton).click();
    }
}
