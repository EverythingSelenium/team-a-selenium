import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage {

    // locators
    By subjectHeadingSelect = By.cssSelector("#id_contact");
    By emailAddressinput = By.id("email");
    By orderReferenceinput = By.id("id_order");
    By messageinput = By.id("message");
    By sendButton = By.cssSelector("#submitMessage > span");


    //methods
    public void selectSubjectHeading(int option) {
        WebElement element = driver.findElement(subjectHeadingSelect);
        Select select = new Select(element);
        select.selectByIndex(option);
    }

    public WebElement emailAddressInputValue(String email) {
        WebElement emailAddressElement = driver.findElement(emailAddressinput);
        return emailAddressElement;
    }

    public WebElement orderReferenceInputValue(String order) {
        WebElement orderReferencsElement = driver.findElement(orderReferenceinput);
        return orderReferenceElement;
    }

}