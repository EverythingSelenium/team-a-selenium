import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBasePage {
    public WebDriver driver;

    public void setProperty(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win_2-42.exe");

        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();


    }

    public void tearDown(){
       if(driver != null){
           driver.quit();
       }
    }
}
