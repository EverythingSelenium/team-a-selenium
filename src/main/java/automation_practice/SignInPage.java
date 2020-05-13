package automation_practice;

import org.openqa.selenium.By;

public class SignInPage extends BasePage {
    private By signInButton = By.cssSelector(".header_user_info");
    private By emailInputField = By.cssSelector("#email");
    private By passWordField = By.cssSelector("#passwd");
    private By signInButton1 = By.cssSelector("#SubmitLogin");
    private By signInVerify = By.cssSelector(".account>span");


    public void clickOnSignInButton() {
        driver.findElement(signInButton).click();
    }

    public void enterEmailAddress(String emailAddress) {
        driver.findElement(emailInputField).sendKeys(emailAddress);
    }

    public void enterPassWord(String password) {
        driver.findElement(passWordField).sendKeys(password);
    }

    public void clickOnSignIn1() {
        driver.findElement(signInButton1).click();
    }

    public String getSignInVerify() {
        return driver.findElement(signInVerify).getText();

    }
    public void signIn(String email, String password){
        enterEmailAddress(email);
        enterPassWord(password);
        clickOnSignInButton();
    }
}
