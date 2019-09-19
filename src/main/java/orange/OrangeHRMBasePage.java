package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMBasePage {


    static WebDriver driver;

    public static void setProperty(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win_2-42.exe");
        driver = new ChromeDriver();

        driver.get("https://poonamb-trials653.orangehrmlive.com");
        driver.manage().window().maximize();
    }

    public static void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }



}
