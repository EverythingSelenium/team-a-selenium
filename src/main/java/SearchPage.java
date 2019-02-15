import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {

    By resultText = By.cssSelector("span.lighter");

    public String getResultHeaderText() {
        WebElement headerText = driver.findElement(resultText);
        return headerText.getText();
    }
}
