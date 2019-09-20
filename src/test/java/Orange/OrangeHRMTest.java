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
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Workplace Security");
        expectedList.add("Social Engineering");
        expectedList.add("Salary Information (Compensation & Classification)");
        expectedList.add("Health Insurance in the United States");
        expectedList.add("Paid Parental Leave in the United States");
        expectedList.add("Measurable Customer Service Standards");
        expectedList.add("Press Release on Laser Shooting Robot's Door");
        expectedList.add("Annual General meeting & Dinner");
        expectedList.add("Global Company Meeting");
        expectedList.add("Goals and Strategies");
        expectedList.add("Truth in Accounting");
        expectedList.add("Health & Safety Guidelines");

        orangeHRMPage.login(loginName,password);
        orangeHRMPage.clickOnDashboard();
        List<String> actualList = orangeHRMPage.documentLists();

//        Assert.assertEquals(expectedList, actualList);

        int index = 0;
        for (String docTitle : actualList) {
            Assert.assertEquals(expectedList.get(index), docTitle);
            index++;
        }

    }
    @Test
    public void verify_Alice_Menu_List(){

        List<String>expectedMenuList = new ArrayList<>();

        expectedMenuList.add("PIM");
        expectedMenuList.add("My Info");
        expectedMenuList.add("Leave");
        expectedMenuList.add("Time");
        expectedMenuList.add("Training");
        expectedMenuList.add("Performance");
        expectedMenuList.add("Expense");
        expectedMenuList.add("More");
        expectedMenuList.add("Announcements");
        expectedMenuList.add("Dashboard");
        expectedMenuList.add("Buzz");
        expectedMenuList.add("Directory");
        expectedMenuList.add("Organization Chart");
        expectedMenuList.add("Preferences");
        expectedMenuList.add("Assets");


        orangeHRMPage.login("alice","Abcd1234");
        List<String> actualResult = orangeHRMPage.getAlice_menu_list();

//        Assert.assertEquals(actualResult,expectedMenuList);
//        System.out.println("actual" + actualResult);
//        System.out.println("expected" + expectedMenuList);

    }
    @Test
    public void verifyIsDisplayed(){
        orangeHRMPage.login(loginName,password);
        orangeHRMPage.IsPresented();



    }

}
