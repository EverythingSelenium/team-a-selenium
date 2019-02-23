import automationpractice.ContactUsPage;
import automationpractice.HeaderPage;
import automationpractice.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VrutaTest extends BaseTest{


    private HeaderPage headerPage = new HeaderPage();
    private SearchPage searchPage = new SearchPage();
    private ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    public void tc002_verify_A_User_Is_Able_To_Send_A_Message_Through_Contact_Us_Form(){

        String expectedMessage = "Your message has been successfully sent to our team.";

        //click on the contact us link
        headerPage.clickOnContactUsLink();
        //select a subject heading - (2) Webmaster
        contactUsPage.selectSubjectHeading(2);
        //enter email address in email input field
        contactUsPage.enterEmailAddress("test@test.com");
        //enter order reference in order reference input field
        contactUsPage.enterOrderReference("1n3nm5tk");
        //enter a message in message input box
        contactUsPage.enterMessageText("This is a message.");
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
        //verify the validation error message as "There is 1 error\n 1. Invalid email address."
        String actualErrorMessage = contactUsPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);
    }

    @Test
    public void tc004_verify_No_Of_Items_In_Search_Result(){

        //enter text in search input

        //click on search button
        //verify the number of items returned as expected - 7
    }
    
}
