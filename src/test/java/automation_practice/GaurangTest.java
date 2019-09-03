package automation_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Some of the method in WebDriver Interface
 * <p>
 * driver.getTitle();
 * driver.getCurrentUrl();
 * driver.get("http://www.google.com");
 * driver.navigate().to("http://www.google.com");
 * driver.navigate().refresh();
 * driver.findElement(By.cssSelector("#someSelector"));
 * driver.close();
 * <p>
 */

/** Some of the methods in WebElement Interface
 *
 *         WebElement element = driver.findElement(By.className("header"))
 *         element.clear();
 *         element.click();
 *         element.getText();
 *         element.sendKeys("Some Text String to enter");
 *         element.findElements(By.cssSelector("#someId"));
 *         element.isSelected();
 *         element.getAttribute("class");
 *         element.isDisplayed();
 *
 * */

/**declaring 'By' objects*/

public class GaurangTest extends BaseTest {

    private HeaderPage headerPage = new HeaderPage();
    private SearchPage searchPage = new SearchPage();
    private ContactUsPage contactUsPage = new ContactUsPage();
    private HomePage homePage = new HomePage();

    @Test
    public void tc001_verifySearchResultText() {

        String searchText = "dresses";
        String expectedText = "\"DRESSES\"";

        //enter text in search input
        headerPage.enterTextInSearchBox(searchText);

        //click on search button
        headerPage.clickOnSearchButton();

        //verify result text
        String actualResultText = searchPage.getResultHeaderText();

        Assert.assertEquals(actualResultText,expectedText.toUpperCase());

    }

    @Test
    public void tc002_verify_A_User_Is_Able_To_Send_A_Message_Through_Contact_Us_Form(){

        String expectedMessage = "Your message has been successfully sent to our team.";

        //click on the contact us link
        headerPage.clickOnContactUsLink();
        //select a subject heading - (2) Webmaster
        contactUsPage.selectSubjectHeading(2);
        //enter email address in email input field as test@test.com
        contactUsPage.enterEmailAddress("test@test.com");
        //enter order reference in order reference input field
        contactUsPage.enterOrderReference("1n3nm5tk");
        //enter a message in message input box
        contactUsPage.enterMessageText("This is a message.");
        //click on send button
        contactUsPage.clickOnSendButton();
        //verify the success message as "Your message has been successfully sent to our team."
        String actualMessage = contactUsPage.getSuccessMessage();
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    @Test
    public void tc003_verify_the_validation_error_message_when_a_mandatory_field_is_missing(){

        String expectedErrorMessage = "There is 1 error\nInvalid email address.";
        //click on the contact us link
        headerPage.clickOnContactUsLink();
        //select a subject heading - (2) Webmaster
        contactUsPage.selectSubjectHeading(1);
        //keep email address field empty - (no action needed)
        contactUsPage.enterEmailAddress(" ");
        //enter order reference in order reference input field
        contactUsPage.enterOrderReference("some or");
        //enter a message in message input box
        contactUsPage.enterMessageText("Some message text");
        //click on send button
        contactUsPage.clickOnSendButton();
        //verify the validation error message as "There is 1 error\n 1. Invalid email address."
        String actualErrorMessage = contactUsPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
        //end of test
    }

    @Test
    public void tc004_verify_No_Of_Items_In_Search_Result(){

        //enter text in search input
        //click on search button
        //verify the number of items returned as expected - 7
    }
    
    @Test
     public void arrayListTest(){

        String s = "selenium tests are running smoothly";
        String[] words = s.split(" ");
        System.out.println("words.length = " + words.length);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Chicago");
        stringArrayList.add("Dallas");
        stringArrayList.add("New york");
        stringArrayList.add("Bartlett");
        stringArrayList.add("Streamwood");
        stringArrayList.add("Schaumburg");

        List<String> stringList = new ArrayList<>();


        System.out.println("stringArrayList.size() = " + stringArrayList.size());
        System.out.println("stringArrayList.indexOf(\"New york\") = " + stringArrayList.indexOf("New york"));
        System.out.println("stringArrayList.get(3) = " + stringArrayList.get(3));
    }

    @Test
    public void verifyItemDescriptions(){

        List<String> items = homePage.getItemDesc();
        for(String item:items){
            System.out.println("item = " + item);
        }
    }
    @Test
    public void verifyArryListTest1(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Krish");
        arrayList.add("Kush");
        arrayList.add("poonam");
        arrayList.add("gaurang");
        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf("Kush"));
        System.out.println(arrayList.get(2));

    }
}
