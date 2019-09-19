package Orange;

import orange.OrangeHRMPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class OrangeHRMTest extends OrangeHRMBaseTest {
    OrangeHRMPage orangeHRMPage = new OrangeHRMPage();


    String loginName = "Admin";
    String password = "eh@36SSrFE";

    @Test
    public void verifySuccessfullyLogin() {
        orangeHRMPage.enterLoginName(loginName);
        orangeHRMPage.enterPassword(password);
        orangeHRMPage.clickOnLogin();
    }

    @Test
    public void verifyDocumentList() {
        ArrayList<String> expectedList = new ArrayList();
        expectedList.add("Workplace Security");
        expectedList.add("Social Engineering");
        expectedList.add("Salary Information");
        expectedList.add("Health Insurance in the United States");
        expectedList.add("Paid Parental Leave in the United States");
        expectedList.add("Measurable Customer Service Standards");
        expectedList.add("Press Release on Laser Shooting Robot's Door");
        expectedList.add("Annual General meeting & Dinner");
        expectedList.add("Global Company Meeting");
        expectedList.add("Goals and Strategies");
        expectedList.add("Truth in Accounting");
        expectedList.add("Health & Safety Guideliness");


        orangeHRMPage.enterLoginName(loginName);
        orangeHRMPage.enterPassword(password);
        orangeHRMPage.clickOnLogin();
        orangeHRMPage.clickOnDashbord();
        List<String> actualList = orangeHRMPage.documentLists();
        boolean flag;
        if (actualList.containsAll(expectedList)) flag = true;
        else flag = false;

        if (flag = true) System.out.println("test pass");
    }

}
