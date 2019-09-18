import org.testng.annotations.Test;

public class OrangeHRMTest extends OrangeHRMBaseTest {
    OrangeHRMPage orangeHRMPage = new OrangeHRMPage();


    String loginName = "Admin";
    String password = "eh@36SSrFE";

    @Test
    public void verifySuccessfullyLogin(){
        orangeHRMPage.enterLoginName(loginName);
        orangeHRMPage.enterPassword(password);
        orangeHRMPage.clickOnLogin();

    }



}
