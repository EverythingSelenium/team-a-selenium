package automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    }

    public static void teardown() {
        if (driver != null)
            driver.quit();
    }
}
