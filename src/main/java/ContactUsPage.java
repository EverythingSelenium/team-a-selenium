import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage {

    // locators
    By subjectHeadingSelect = By.cssSelector("#id_contact");
    By emailAddressInput = By.id("email");
    By orderReferenceInput = By.id("id_order");
    By messageinput = By.id("message");
    By sendButton = By.cssSelector("#submitMessage > span");

    //create conflict - poonam
    //create conflict - gaurang
    //methods
    public void selectSubjectHeading(int option) {
        WebElement element = driver.findElement(subjectHeadingSelect);
        Select select = new Select(element);
        select.selectByIndex(option);
    }

    public void enterEmailAddressInputField(String email) {
        WebElement emailAddressElement = driver.findElement(emailAddressInput);
        emailAddressElement.sendKeys(email);
    }

    public void enterOrderReferenceInputField(String order) {
        WebElement orderReferencsElement = driver.findElement(orderReferenceInput);
        orderReferencsElement.sendKeys(order);
    }

}