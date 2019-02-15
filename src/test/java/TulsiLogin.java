import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TulsiLogin {
    public static void main(String[] args) {
        // 1. Define the web browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_win_2-42.exe");
        WebDriver driver = new ChromeDriver();



        // 2. open the URL and navigate the browser
        driver.get("http://www.automationpractice.com");

        //maximize a window
        driver.manage().window().maximize();

        // find the element: locate element, determine the action, pass any parameters

        //3 click on sign in button
        WebElement Signbutton =  driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a"));
        Signbutton.click();

        // 4. enter email address
           WebElement Emailtext = driver.findElement(By.id("email"));
           Emailtext.sendKeys("TulsiPatel25@gmail.com");
           Emailtext.isDisplayed();

         //5. enter password
        WebElement Passwordtext =  driver.findElement(By.id("passwd"));
        Passwordtext.sendKeys("Selenium619!");
        Passwordtext.isDisplayed();

        //6 click on sing in

        WebElement Submitbutton = driver.findElement(By.cssSelector("#SubmitLogin > span"));
        Submitbutton.click();

        // click on sing out
        WebElement Logoutbutton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
        Logoutbutton.click();


        //7. close the browser
             driver.quit();



    }
}
