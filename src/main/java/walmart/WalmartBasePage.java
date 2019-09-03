package walmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class WalmartBasePage {
    static WebDriver driver;

    public static void setup(){
        //Set the path for the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win_2-42.exe");
        //Instantiate driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //open a url
        driver.get("https://walmart.com/");
        //maximize a window
        driver.manage().window().maximize();
    }

    public static void teardown() {
        if (driver != null)
            driver.quit();
    }

    public void waitForElementClickable(By by){
        new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(by));
    }
}
