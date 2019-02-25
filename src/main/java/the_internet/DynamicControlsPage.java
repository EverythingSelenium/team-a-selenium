package the_internet;

import org.openqa.selenium.By;

public class DynamicControlsPage extends TheInternetBasePage{

    By checkbox = By.cssSelector("#checkbox>input");
    By removeButton = By.cssSelector("#checkbox-example>button");
    By loadingBar = By.cssSelector("#loading:not([style='display: none;'])");
    By message = By.id("message");

    public void clickOnCheckbox(){
        driver.findElement(checkbox).click();
    }

    public void clickOnRemoveButton(){
        driver.findElement(removeButton).click();
    }

    public void waitForLoadingBarToDisappear(){
        waitForInvisibilityOfAnElement(loadingBar);
    }

    public String getMessage(){
        return driver.findElement(message).getText();
    }

}
