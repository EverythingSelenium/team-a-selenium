package the_internet;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class TIGaurangTest extends TheInternetBaseTest {

    DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    JavascriptAlertPage javascriptAlertPage = new JavascriptAlertPage();
    HoversPage hoversPage = new HoversPage();

    @Test
    public void tc001_verifyDynamicControlsCheckBox(){

        String expectedMessage = "It's gone!";
        //click on Dynamic Controls
        dynamicControlsPage.clickOnLinkOnHomePage("Dynamic Controls");
        //click on check box
        dynamicControlsPage.clickOnCheckbox();
        //click on Remove button
        dynamicControlsPage.clickOnRemoveButton();
        //wait for invisibility of loadingBar
        dynamicControlsPage.waitForLoadingBarToDisappear();
        //verify the text 'It's gone!'
        String actualMessage = dynamicControlsPage.getMessage();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Test
    public void tc002_verifyJSAlert(){

        String expectedMessage = "I am a JS Alert";
        String expectedResult = "You successfuly clicked an alert";

        //click on JavaScript Alerts link
        javascriptAlertPage.clickOnLinkOnHomePage("JavaScript Alerts");
        //click on jsAlert button
        javascriptAlertPage.clickOnAButton("JS Alert");
        if(!javascriptAlertPage.isAnAlertPresent())
            fail("The alert is not present");
        //verify alert message
        Assert.assertEquals(javascriptAlertPage.getAlertMessage(),expectedMessage);
        //click on ok on alert
        javascriptAlertPage.acceptAnAlert();
        //verify the result text
        Assert.assertEquals(javascriptAlertPage.getResultText(),expectedResult);
    }

    @Test
    public void tc003_verifyJSPrompt(){

        String message = "This is test text for an alert";
        //click on JavaScript Alerts link
        javascriptAlertPage.clickOnLinkOnHomePage("JavaScript Alerts");
        //click on jsPrompt button
        javascriptAlertPage.clickOnAButton("JS Prompt");
        if(!javascriptAlertPage.isAnAlertPresent())
            fail("The alert is not present");
        //send some text in prompt
        javascriptAlertPage.enterTextInAlert(message);
        //click ok
        javascriptAlertPage.acceptAnAlert();
        javascriptAlertPage.takeScreenshot();
        //verify the result text
        Assert.assertEquals(javascriptAlertPage.getResultText(),"You entered: " + message );
    }

    @Test
    public void tc004_verifyHoverOver(){

        //click on Hovers Alerts link
        hoversPage.clickOnLinkOnHomePage("Hovers");

        //hover over figure 2
        hoversPage.hoverOverAFigure(1);
        Assert.assertEquals(hoversPage.getUserName(),"name: user1");

        hoversPage.hoverOverAFigure(2);
        Assert.assertEquals(hoversPage.getUserName(),"name: user2");

        hoversPage.hoverOverAFigure(3);
        hoversPage.takeScreenshot();
        Assert.assertEquals(hoversPage.getUserName(),"name: user3");
    }
    @Test
    public void tc_007_verify_Hover(){
        hoversPage.clickOnHovers();
        hoversPage.clickOnImag1();
        hoversPage.getText();
    }

}
