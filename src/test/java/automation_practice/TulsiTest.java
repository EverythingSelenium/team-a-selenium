package automation_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TulsiTest extends BaseTest {

         public HeaderPage headerPage2 = new HeaderPage();
         public SearchPage searchPage2 = new SearchPage();
         public ContactUsPage contactUsPage2 = new ContactUsPage();

    @Test
    public void tc002_verify_A_User_Is_Able_To_Send_A_Message_Through_Contact_Us_Form(){

        String expectedMessage = "Your message has been successfully sent to our team.";

        //click on the contact us link
         headerPage2.clickOnContactUsLink();
         //select a subject heading - (2) Webmaster
        contactUsPage2.selectSubjectHeading(2);
        //enter email address in email input field
        contactUsPage2.enterEmailAddress("Test1@gmail.com");
        //enter order reference in order reference input field
        contactUsPage2.enterOrderReference("12345a");
        //enter a message in message input box
        contactUsPage2.enterMessageText("This is Test1");
        //click on send button
        contactUsPage2.clickOnSendButton();
        //verify the success message as "Your message has been successfully sent to our team."
        String actualMessage = contactUsPage2.getSuccessMessage();
        Assert.assertEquals(actualMessage,expectedMessage);

    }

    @Test
    public void tc003_verify_the_validation_error_message_when_a_mandatory_field_is_missing(){
        String expectedErrorMessage = "There is 1 error\nInvalid email address.";
        //click on the contact us link
        headerPage2.clickOnContactUsLink();
        //select a subject heading - (2) Webmaster
        contactUsPage2.selectSubjectHeading(1);
        //keep email address field empty - (no action needed)
        contactUsPage2.enterEmailAddress("");
        //enter order reference in order reference input field
        contactUsPage2.enterOrderReference("12345a");
        //enter a message in message input box
        contactUsPage2.enterMessageText("This is Test1");
        //click on send button
        contactUsPage2.clickOnSendButton();
        //verify the validation error message as "There is 1 error\n 1. Invalid email address."
         String actualErrormessage = contactUsPage2.getErrorMessage();
        Assert.assertEquals(actualErrormessage,expectedErrorMessage);

    }

    @Test
    public void tc004_verify_No_Of_Items_In_Search_Result(){
           String expectedResultMessage = "7 results have been found.";
        //enter text in search input
        headerPage2.enterTextInSearchBox("Dresses");
        //click on search button
        headerPage2.clickOnSearchButton();
        //verify the number of items returned as expected - 7
        String actualResultMessage = searchPage2.getResultMessage();
        Assert.assertEquals(actualResultMessage, expectedResultMessage);


    }

}
