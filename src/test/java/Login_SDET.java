import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_SDET {
    public static void main(String[] args) {
        //1 define the browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win_2-42.exe");
        WebDriver driver = new ChromeDriver();

        //2  Open the browser navigate to page
        driver.get("http://sdetuniversity.com/projects/");

        //3 maximize window
        driver.manage().window().maximize();

        // Locate webelement, determine the action , pass parameter,

        //4 click on Account managment

        WebElement ClickAccount = driver.findElement(By.cssSelector("body > div.container > div > div.col-md-10.service-block > a"));
        ClickAccount.click();
        //5 enter email address
        WebElement Searchemail = driver.findElement(By.id("MainContent_txtUserName"));
        Searchemail.sendKeys("tulsipatel195@yahoo.com");
        Searchemail.isDisplayed();

        //6 enter password
        WebElement SearchPassword = driver.findElement(By.id("MainContent_txtPassword"));
        SearchPassword.sendKeys("Selenium9915!");
        SearchPassword.isDisplayed();

        //7 click on sing in button
        WebElement Login = driver.findElement(By.id("MainContent_btnLogin"));
        Login.click();



        //8 close the browser
        driver.quit();
    }
}



