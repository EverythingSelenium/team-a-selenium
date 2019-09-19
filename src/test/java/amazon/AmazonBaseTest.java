package amazon;

import amazon.AmazonBasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AmazonBaseTest {
    @BeforeMethod
    public void verifySetup() {
        AmazonPage.setProperty();
    }

    @AfterMethod
    public void verifyQuit() {
        AmazonPage.tearDown();

    }


}
