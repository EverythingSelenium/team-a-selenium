package walmart;
import org.testng.annotations.Test;

public class SignInTest extends WalmartBaseTest {

    SignInPage signIn  = new SignInPage();

    @Test
    public void GTA_13_verify_User_is_able_to_signIn_successfully(){
        String email = "bpoonamg@gmail.com";
        String password = "Jignag99";
        //click on account button
        signIn.clickOnAccountButton();

        //click on sign in button
        signIn.clickOnSignInLink();

        //enter email address and password
        signIn.enterEmailAddress(email);
        signIn.enterPassWord(password);

        //click on sign in button
        signIn.clickOnSignInButton();

        //verify user is able to sigh in successfully
        signIn.getSingINPB();
        System.out.println(signIn.getSingINPB());


    }




    //enter email address and password


}
