package automation_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PoonamTest extends BaseTest {

    ContactUsPage contactUsPage = new ContactUsPage();
    HeaderPage headerPage = new HeaderPage();
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();
    WomenHoverPage womenHoverPage = new WomenHoverPage();

    String email = "bpoonamg@gmail.com";
    String orderReference = "reference1";
    String message = "this is a test from poonam";

    @Test
    public void tc002_verify_A_User_Is_Able_To_Send_A_Message_Through_Contact_Us_Form(){
        String expectedMessage = "Your message has been successfully sent to our team.";
        //click on the contact us link
        headerPage.clickOnContactUsLink();
        //select a subject heading - (2) Webmaster
        contactUsPage.selectSubjectHeading(1);
        //enter email address in email input field
        contactUsPage.                                                                                                                                                          enterEmailAddress(email);
        //enter order reference in order reference input field
        contactUsPage.enterOrderReference(orderReference);
        //enter a message in message input box
        contactUsPage.enterMessageText(message);
        //click on send button
        contactUsPage.clickOnSendButton();
        //verify the success message as "Your message has been successfully sent to our team."
        Assert.assertEquals(expectedMessage,contactUsPage.getSuccessMessage());
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
        contactUsPage.enterOrderReference(orderReference);
        //enter a message in message input box
        contactUsPage.enterMessageText(message);
        //click on send button
        contactUsPage.clickOnSendButton();
        //verify the validation error message as "There is 1 error\n 1. Invalid email address."
        Assert.assertEquals(expectedErrorMessage,contactUsPage.getErrorMessage());
    }

    @Test
    public void tc004_verify_No_Of_Items_In_Search_Result(){
        String text = "dress";
       int expected = 7;
        //enter text in search input
        headerPage.enterTextInSearchBox(text);
        //click on search button
        headerPage.clickOnSearchButton();
        //verify the number of items returned as expected - 7
        Assert.assertEquals(expected,homePage.getNoOfProductItems());
    }
    @Test
    public void tc005_verify_user_is_able_to_signIn_successfully(){
        String email = "bpoonamg@gmail.com";
        String password = "bpoonamg";
        // click on sign in link
        signInPage.clickOnSignInButton();
        //enter email address
        signInPage.enterEmailAddress(email);
        //enter password
        signInPage.enterPassWord(password);
        //click on sign in button
        signInPage.clickOnSignIn1();
        //verify sign in
        String expectedResult = "poonam b";
       String actualResult = signInPage.getSignInVerify();
       Assert.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void tc_006_verify_women_Hover() throws InterruptedException {
        womenHoverPage.getAllDivs();

//        womenHoverPage.hoverWomen();
//        Thread.sleep(5000);

    }


}
