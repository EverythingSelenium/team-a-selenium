import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrangeHRMPage extends OrangeHRMBasePage {

    private By loginInputField = By.cssSelector("input#txtUsername");
    private By loginButton = By.cssSelector("input#btnLogin");
    private By passWordField = By.cssSelector("input#txtPassword");


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


}
