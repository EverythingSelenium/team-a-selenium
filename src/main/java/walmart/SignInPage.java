package walmart;

import org.openqa.selenium.By;

public class SignInPage extends WalmartBasePage {
    private By accountButton = By.cssSelector("#header-account-toggle");
    private By signInLink = By.cssSelector("div>a[title='Sign In']");
    private By emailInputField = By.cssSelector("input#email");
    private By passWordField = By.cssSelector("input#password");
    private By signInButton = By.cssSelector("#sign-in-form button.button.m-margin-top");
    private By signPB = By.cssSelector("span[data-tl-id=GlobalHeaderBubblesNav-Account-Initials]");





    public void clickOnAccountButton(){
        driver.findElement(accountButton).click();
    }
    public void clickOnSignInLink(){
        driver.findElement(signInLink).click();
    }
    public void enterEmailAddress(String email){
        driver.findElement(emailInputField).sendKeys(email);
    }
    public void enterPassWord(String passWord){
        driver.findElement(passWordField).sendKeys(passWord);
    }
    public void clickOnSignInButton(){
        driver.findElement(signInButton).click();
    }
    public String getSingINPB(){
     return   driver.findElement(signPB).getText();
    }



}
