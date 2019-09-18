import automation_practice.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.jws.Oneway;

public class OrangeHRMBaseTest  {
    OrangeHRMBasePage orangeHRMBasePage =new OrangeHRMBasePage();


    @BeforeMethod
    public void verifySetProperty(){
        orangeHRMBasePage.setProperty();
    }
    @AfterMethod
    public void teardown(){
        orangeHRMBasePage.tearDown();
    }
}
