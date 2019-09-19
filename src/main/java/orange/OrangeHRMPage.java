package orange;

import orange.OrangeHRMBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class OrangeHRMPage extends OrangeHRMBasePage {

    private By loginInputField = By.cssSelector("input#txtUsername");
    private By loginButton = By.cssSelector("input#btnLogin");
    private By passWordField = By.cssSelector("input#txtPassword");
    private By myInfoLink = By.cssSelector("li.level1.my_info.active span:nth-child(2)");
    private By spinner = By.cssSelector("div.loading");
    private By moreMenu = By.cssSelector("a.collapsible-header.waves-effect.waves-orange.active span.left-menu-title");
    private By dashbord = By.xpath("//li[@class='level2 current active']/a/span[@class='left-menu-title']");
    private By documentLists = By.cssSelector("ul#documentList>li>div.truncate a");


    public void enterLoginName(String loginName) {
        WebElement element = driver.findElement(loginInputField);
        element.sendKeys(loginName);
    }

    public void enterPassword(String password){
        WebElement element = driver.findElement(passWordField);
        element.sendKeys(password);
    }

    public void clickOnLogin(){
        driver.findElement(loginButton).click();

    }

    public void test(){
        WebDriverWait webDriverWait = new WebDriverWait(driver,5);
        webDriverWait.pollingEvery(Duration.ofMillis(100))
                .until(ExpectedConditions.invisibilityOfElementLocated(spinner));
    }
    public void clickOnMoreMenu(){
        driver.findElement(moreMenu).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnDashbord(){
        driver.findElement(dashbord).click();
    }
    public List<String> documentLists(){
        ArrayList<String> docList = new ArrayList<>();
        List<WebElement>elements =driver.findElements(documentLists);

        for(WebElement element: elements){
           String list = element.getText();
           docList.add(list);
        }
        return docList;
    }


}
