package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMBasePage {


    static WebDriver driver;

    public static void setProperty(String browser, String app){
        if(browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win_2-42.exe");
            driver = new ChromeDriver();
        }

        driver.get(app);
        driver.manage().window().maximize();
    }

    public static void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }



}
