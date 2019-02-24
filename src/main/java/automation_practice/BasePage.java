package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    static WebDriver driver;

    public static void setup() {
        //Set the path for the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win_2-42.exe");
        //Instantiate driver
        driver = new ChromeDriver();

        //open a url
        driver.get("http://www.automation_practice.com");

        //maximize a window
        driver.manage().window().maximize();
    }

    public static void teardown() {
        if (driver != null)
            driver.quit();
    }

    /**
     * This method waits for an element to become invisible.
     * @param by
     */
    public void waitForInvisibilityOfAnElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void waitForElementToBeClickable(By by){
        //write the code to wait for an element to be clickable
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

    public void acceptAnAlert(){
        //write code to accept an alert
    }

    public void dismissAnAlert(){
        //write code to dismiss an alert
    }

    public String getAlertMessage(){
        String message = "";
        //write code to get the message from alert text box
        return message;
    }

    public void enterTextInAlert(){

    }
}
