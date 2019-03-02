package the_internet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TheInternetBasePage {

    static WebDriver driver;

    public static void setup() {
        //Set the path for the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win_2-42.exe");
        //Instantiate driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //open a url
        driver.get("https://the-internet.herokuapp.com/");

        //maximize a window
        driver.manage().window().maximize();
    }

    public static void teardown() {
        if (driver != null)
            driver.quit();
    }

    public void clickOnLinkOnHomePage(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    /**
     * This method waits for an element to become invisible.
     * @param by
     */
    public void waitForInvisibilityOfAnElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void waitForElementToBeClickable(By by){
        //write the code to wait for an element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitForPresenceOfElementLocated(){
        //write the code to wait for an element to be present
    }

    public boolean isAnAlertPresent(){
        try{
            driver.switchTo().alert();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public void acceptAnAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAnAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getAlertMessage() {
        return driver.switchTo().alert().getText();
    }

    public void enterTextInAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public void testJavaScriptExecutor(int pixels) {
        WebElement element = driver.findElement(By.cssSelector(""));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //click on an element
        js.executeScript("arguments[0].click();", element);

        //scroll into view
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //Enter text using java script
        js.executeScript("document.getElementById('some_id').value='someValue';");
        js.executeScript("document.getElementById('Email').value='SoftwareTestingMaterial.com';");


        //Vertical scroll - down by 500  pixels
        js.executeScript("window.scrollBy(0,"+pixels+")");

        // for scrolling till the bottom of the page we can use the code like
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public void clickOnAnElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void clickOnAnElement(By by){

        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void takeScreenshot(){
        //Generate a string using current time in millis
        String fileName = String.valueOf(System.currentTimeMillis()/1000);

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File imgFile = screenshot.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(imgFile,new File("target/screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}