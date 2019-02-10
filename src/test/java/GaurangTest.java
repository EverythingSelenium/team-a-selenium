import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaurangTest extends BaseTest{
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

        //open a url
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
    }


 /*       @Test
    public void tc001_verifyLoginPage(){
            //Instantiate driver
            WebDriver driver = new ChromeDriver();

            //open a url
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
            Assert.assertEquals("SEARCH  \"DRESSES\"\n7 results have been found.",headerText.getText());
        }*/

}
