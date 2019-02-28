package the_internet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TIPrachiTest extends TheInternetBaseTest {

    DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    JavascriptAlertPage javascriptAlertPage = new JavascriptAlertPage();
    HoversPage hoversPage = new HoversPage();


    @Test
    public void tc001_verifyDynamicControlsCheckBox_EnableDisable() {
        String expectedMessageRemoveButton = "It's gone!";
        String expectedMessageAddButton = "It's back!";

        //click on Dynamic controls link
        dynamicControlsPage.clickOnLinkOnHomePage("Dynamic Controls");
        //click on checkbox
        dynamicControlsPage.clickOnCheckbox();
        //click on Remove button
        dynamicControlsPage.clickOnRemoveButton();
        //wait for an invisibility of loading bar
        dynamicControlsPage.waitForLoadingBarToDisappear();
        //verify the message 'It's gone!'
        Assert.assertEquals(dynamicControlsPage.getMessage(), expectedMessageRemoveButton);
        //click on Add button
        dynamicControlsPage.clickOnAddButton();
        //wait for an invisibility of loading bar
        dynamicControlsPage.waitForLoadingBarToDisappear();
        //verify the message It's back!
        Assert.assertEquals(dynamicControlsPage.getMessage(), expectedMessageAddButton);
    }

    @Test
    public void tc002_verifyDynamicControlEnableDisable() {
        String expectedMessageEnableButton = "It's enabled!";
        String expectedMessageDisableButton = "It's disabled!";

        //click on Dynamic controls link
        dynamicControlsPage.clickOnLinkOnHomePage("Dynamic Controls");
        //click on Enable button
        dynamicControlsPage.clickOnEnableButton();
        //wait for an invisibility of loading bar
        dynamicControlsPage.waitForLoadingBarToDisappear();
        //verify the message 'It's enabled!'
        Assert.assertEquals(dynamicControlsPage.getMessage(), expectedMessageEnableButton);
        //enter text in enabled bar
        dynamicControlsPage.enterTextWhenEnabled("Hello My name is Prachi");
        //click on disable button
        dynamicControlsPage.clickOnDisableButton();
        //wait for an invisibility of loading bar
        dynamicControlsPage.waitForLoadingBarToDisappear();
        //verify the message 'It's disabled!'
        Assert.assertEquals(dynamicControlsPage.getMessage(), expectedMessageDisableButton);
    }


    @Test
    public void tc003_verifyJSAlert() {
        String expectedMessage = "I am a JS Alert";
        String expectedResult = "You successfuly clicked an alert";

        //click on javascript alerts link
        javascriptAlertPage.clickOnLinkOnHomePage("JavaScript Alerts");
        //click on jsAlert button
        javascriptAlertPage.clickOnAButton("JS Alert");
        //verify alert message
        Assert.assertEquals(javascriptAlertPage.getAlertMessage(), expectedMessage);
        //click ok on alert
        javascriptAlertPage.acceptAnAlert();
        //verify the result text
        Assert.assertEquals(javascriptAlertPage.getResultText(), expectedResult);
    }

    @Test
    public void tc004_verifyJSConfirmAlertScenario1() {
        String expectedMessage = "I am a JS Confirm";
        String expectedResultAfterClickOk = "You clicked: Ok";

        //click on javascript alerts
        javascriptAlertPage.clickOnLinkOnHomePage("JavaScript Alerts");
        //click on jsConfirm button
        javascriptAlertPage.clickOnAButton("JS Confirm");
        //verify alert message
        Assert.assertEquals(javascriptAlertPage.getAlertMessage(), expectedMessage);
        //click ok on alert
        javascriptAlertPage.acceptAnAlert();
        //verify the result text after clicking ok
        Assert.assertEquals(javascriptAlertPage.getResultText(), expectedResultAfterClickOk);
    }

    @Test
    public void tc005_verifyJSConfirmAlertScenario2() {
        String expectedResultAfterClickCancel = "You clicked: Cancel";

        //click on javascript alerts
        javascriptAlertPage.clickOnLinkOnHomePage("JavaScript Alerts");
        //click on jsConfirm button
        javascriptAlertPage.clickOnAButton("JS Confirm");
        //click cancel on alert
        javascriptAlertPage.dismissAnAlert();
        //verify the result after clicking cancel
        Assert.assertEquals(javascriptAlertPage.getResultText(), expectedResultAfterClickCancel);
    }

    @Test
    public void tc006_verifyJSPromptScenario1() {
        String message = "This is alert test by prachi";

        //click on JavaScript Alerts link
        javascriptAlertPage.clickOnLinkOnHomePage("JavaScript Alerts");
        //click on jsPrompt button
        javascriptAlertPage.clickOnAButton("JS Prompt");
        //send some text in prompt
        javascriptAlertPage.enterTextInAlert(message);
        //click ok on alert
        javascriptAlertPage.acceptAnAlert();
        //verify the result text after clicking ok
        Assert.assertEquals(javascriptAlertPage.getResultText(), "You entered: " + message);

    }

    @Test
    public void tc007_verifyJSPromptScenario2() {
        String expectedResultTextAfterClickCancel = "null";

        //click on JavaScript Alerts link
        javascriptAlertPage.clickOnLinkOnHomePage("JavaScript Alerts");
        //click on jsPrompt button
        javascriptAlertPage.clickOnAButton("JS Prompt");
        //click cancel on alert
        javascriptAlertPage.dismissAnAlert();
        //verify the result text after clicking cancel
        Assert.assertEquals(javascriptAlertPage.getResultText(), "You entered: " + expectedResultTextAfterClickCancel);

    }

    @Test
    public void tc008_verifyHoverOverImages() {

        //click on Hovers link
        hoversPage.clickOnLinkOnHomePage("Hovers");
        //hover over on figure1
        hoversPage.hoverOverAFigure(1);
        Assert.assertEquals(hoversPage.getUserName(),"name: user1");
        //hover over in figure2
        hoversPage.hoverOverAFigure(2);
        Assert.assertEquals(hoversPage.getUserName(),"name: user2");
        //hover over on figure3
        hoversPage.hoverOverAFigure(3);
        Assert.assertEquals(hoversPage.getUserName(),"name: user3");

    }
}

