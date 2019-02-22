import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {

    By resultText = By.cssSelector("span.lighter");
    By resultsMessage = By.className("heading-counter");

    public String getResultHeaderText() {
        WebElement headerText = driver.findElement(resultText);
        return headerText.getText();
    }
    public String getResultsMessage()  {
        WebElement resultMessageElement = driver.findElement(resultsMessage);
        return resultMessageElement.getText();
    }
}
