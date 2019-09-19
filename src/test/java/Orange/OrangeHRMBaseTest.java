package Orange;

import orange.OrangeHRMBasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OrangeHRMBaseTest  {

    @BeforeMethod
    public void verifySetProperty(){
        OrangeHRMBasePage.setProperty();
    }
    @AfterMethod
    public void teardown(){
        OrangeHRMBasePage.tearDown();
    }
}
