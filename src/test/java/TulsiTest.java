import org.testng.annotations.Test;

public class TulsiTest {

    @Test
    public void tc002_verify_A_User_Is_Able_To_Send_A_Message_Through_Contact_Us_Form(){
        //click on the contact us link
        //select a subject heading - (2) Webmaster
        //enter email address in email input field
        //enter order reference in order reference input field
        //enter a message in message input box
        //verify the success message as "Your message has been successfully sent to our team."
    }

    @Test
    public void tc003_verify_the_validation_error_message_when_a_mandatory_field_is_missing(){
        //click on the contact us link
        //select a subject heading - (2) Webmaster
        //keep email address field empty - (no action needed)
        //enter order reference in order reference input field
        //enter a message in message input box
        //verify the validation error message as "There is 1 error\n 1. Invalid email address."
    }

    @Test
    public void tc004_verify_No_Of_Items_In_Search_Result(){

        //enter text in search input
        //click on search button
        //verify the number of items returned as expected - 7
    }

}
