import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonBaseTest {
    AmazonBasePage amazonPage = new AmazonBasePage();

    @BeforeMethod
    public void verifySetup() {
        amazonPage.setProperty();
    }

    @AfterMethod
    public void verifyQuit() {
        amazonPage.tearDown();

    }


}
