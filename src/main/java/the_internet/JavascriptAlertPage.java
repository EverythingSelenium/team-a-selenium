package the_internet;

import org.openqa.selenium.By;

public class JavascriptAlertPage extends TheInternetBasePage {
    By jsAlertButton = By.cssSelector("li:nth-child(1) > button");
    By jsConfirmButton = By.cssSelector("li:nth-child(2) > button");
    By jsPromptButton = By.cssSelector("li:nth-child(3) > button");
    By resultText = By.id("result");

    public void clickOnAButton(String buttonName) {
        switch (buttonName.toLowerCase()) {
            case "js alert":
                driver.findElement(jsAlertButton).click();
                break;
            case "js confirm":
                driver.findElement(jsConfirmButton).click();
                break;
            case "js prompt":
                driver.findElement(jsPromptButton).click();
                break;
            default:
        }
    }

    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
}
