package automation_practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup(){
        BasePage.setup();
    }

    @AfterMethod
    public void teardown(){
        BasePage.teardown();
    }
}
