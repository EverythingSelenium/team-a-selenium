import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Some of the method in WebDriver Interface
 * <p>
 * driver.getTitle();
 * driver.getCurrentUrl();
 * driver.get("http://www.google.com");
 * driver.navigate().to("http://www.google.com");
 * driver.navigate().refresh();
 * driver.findElement(By.cssSelector("#someSelector"));
 * driver.close();
 * <p>
 * Some of the methods in WebElement Interface
 * <p>
 * element.clear();
 * element.click();
 * element.getText();
 * element.sendKeys("Some Text String to enter");
 * element.findElements(By.cssSelector("#someId"));
 * element.isSelected();
 * element.getAttribute("class");
 * element.isDisplayed();
 */

/** Some of the methods in WebElement Interface
 *
 *         element.clear();
 *         element.click();
 *         element.getText();
 *         element.sendKeys("Some Text String to enter");
 *         element.findElements(By.cssSelector("#someId"));
 *         element.isSelected();
 *         element.getAttribute("class");
 *         element.isDisplayed();
 *
 * */

/**declaring 'By' objects*/

public class GaurangTest extends BaseTest {

    @Test
    public void tc001_verifyLoginPage() {
        HeaderPage vhp = new HeaderPage();
        SearchPage gsp = new SearchPage();

        String searchText = "dresses";
        String expectedText = "\"DRESSES\"";

        //enter text in search button
        vhp.enterTextInSearchBox(searchText);

        //click on search button
        vhp.clickOnSearchButton();

        //verify result text
        String actualResultText = gsp.getResultHeaderText();

        Assert.assertEquals(actualResultText,expectedText.toUpperCase());

    }
}
