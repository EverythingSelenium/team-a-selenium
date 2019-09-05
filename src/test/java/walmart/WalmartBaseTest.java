package walmart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import the_internet.TheInternetBasePage;

public class WalmartBaseTest {
    @BeforeMethod
    public void setup(){
        WalmartBasePage.setup();
    }

    @AfterMethod
    public void teardown(){
        WalmartBasePage.teardown();
    }
}
