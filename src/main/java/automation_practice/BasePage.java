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
        driver.get("http://www.automationpractice.com");

        //maximize a window
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
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
}
