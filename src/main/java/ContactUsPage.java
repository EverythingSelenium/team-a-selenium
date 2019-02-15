import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage {

    // locators
    By subjectHeadingSelect = By.cssSelector("#id_contact");
    By EmailAddressSelect = By.id("email");
    By OrderReferencsSelect = By.id("id_order");
    By AttachFileSelect = By.cssSelector("#id_order");
    By MessageSelect = By.id("message");
    By SendSelect = By.cssSelector("#submitMessage > span");



    //methods
    public void selectSubjectHeading(int option){
        WebElement element = driver.findElement(subjectHeadingSelect);
        Select select = new Select(element);
        select.selectByIndex(option);

    }

}
