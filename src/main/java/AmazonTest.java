import org.openqa.selenium.By;
import org.testng.annotations.Test;

    @Test
    public class AmazonTest extends AmazonBaseTest {
    //navigate to amazon.com
    AmazonPage amazonPage = new AmazonPage();
    //search for kids scooter
    String text = "scooter for kids";

    @Test
    public void verifySearchText() {
        amazonPage.enterTextInSearchInputBox("scooter");
        amazonPage.clickOnSearchButton();
    }
    //select scooter

}
