package the_internet;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TheInternetBaseTest {
    @BeforeMethod
    public void setup(){
        TheInternetBasePage.setup();
    }

    @AfterMethod
    public void teardown(){
        TheInternetBasePage.teardown();
    }
}
