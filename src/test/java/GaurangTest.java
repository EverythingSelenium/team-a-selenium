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

<<<<<<< HEAD
public class GaurangTest {

    public static void main(String[] args) {

        /**Some of the method in WebDriver Interface
         *
         *         driver.getTitle();
         *         driver.getCurrentUrl();
         *         driver.get("http://www.google.com");
         *         driver.navigate().to("http://www.google.com");
         *         driver.navigate().refresh();
         *         driver.findElement(By.cssSelector("#someSelector"));
         *         driver.close();
         *
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
        By searchInputField = By.id("search_query_top");
        By searchButton = By.cssSelector("button.btn.btn-default.button-search");
        By pageHeading = By.cssSelector("h1.page-heading");

        //Set the path for the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win_2-42.exe");

        //Instantiate driver
        WebDriver driver = new ChromeDriver();

        //open the brwoser and navigate the page
        driver.get("http://www.automationpractice.com");

        //maximize a window
        driver.manage().window().maximize();

        //find an element on the DOM

        WebElement searchInputElement = driver.findElement(searchInputField);
        //click on an element
        searchInputElement.sendKeys("dresses");

        //find another element on the dom
        WebElement searchButtonElement = driver.findElement(searchButton);
        searchButtonElement.click();

        //find an element on dom
        WebElement headerText = driver.findElement(pageHeading);
        String text = headerText.getText();
        System.out.println("text = " + text);

        //quit the driver object / browser
        driver.quit();
=======
>>>>>>> 05ded214b2089ce3d981556f00c6b56da47ca8fa
    }

}
