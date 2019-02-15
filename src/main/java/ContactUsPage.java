import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage {

    // locators
    By subjectHeadingSelect = By.cssSelector("#id_contact");
<<<<<<< HEAD
    By emailAddressinput = By.id("email");
    By orderReferencsinput = By.id("id_order");
    By messageinput = By.id("message");
    By sendSelect = By.cssSelector("#submitMessage > span");
=======
    By emailAddressInput = By.id("email");
    By orderReferencsInput = By.id("id_order");
    By messageInput = By.id("message");
    By sendButton = By.cssSelector("#submitMessage > span");
>>>>>>> a0ed5201c0dc29f667101f897e71d8acf7232d17



    //methods
    public void selectSubjectHeading(int option){
        WebElement element = driver.findElement(subjectHeadingSelect);
        Select select = new Select(element);
        select.selectByIndex(option);

    }

}
