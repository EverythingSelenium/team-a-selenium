import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tulsi_Order_Reference {
    public static void main(String[] args) {
        // 1. define the webbrowser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win_2-42.exe");
        WebDriver driver = new ChromeDriver();

        //2.Open URL and  Navigate to page
        driver.get("http://automationpractice.com");

        //3.manage the window
        driver.manage().window().maximize();


        // locate webelement, determine the action, pass parameter


        //4. click on contact us

        WebElement SerachInputelement = driver.findElement(By.cssSelector("#contact-link > a"));
        SerachInputelement.click();

        //5.enter order reference
        WebElement EnterOrderReference = driver.findElement(By.id("id_order"));
        EnterOrderReference.click();
        EnterOrderReference.sendKeys();

        //
    }
}
