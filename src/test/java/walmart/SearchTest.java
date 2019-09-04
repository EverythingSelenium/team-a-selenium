package walmart;

import org.apache.xpath.objects.XString;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SearchTest extends WalmartBaseTest {
    SearchPage searchPage = new SearchPage();


    @Test
    public void GTA_9_verify_User_Is_Able_To_Search_SuccessFully() {
        //enter text in search input field and press enter
        String searchText = "Dress";
        searchPage.enterTextInToSearchInPutField(searchText);
        searchPage.clickOnSearchButton();

        //search result grid is displayed with items containing search text
        List<String> titles = searchPage.getProductTitles();
        for (String title : titles) {
            Assert.assertTrue(title.toLowerCase().contains(searchText.toLowerCase()), "Title = " + title);
        }

    }

    @Test
    public void GTA_10_verify_a_User_is_able_to_see_the_type_ahead_when_they_Start_typing_in_the_search_bar() {
        String searchText = "mi";
        String searchText1 = "micro";
        String searchText2 ="microwave";
        //enter text in search input field
        searchPage.enterTextInToSearchInPutField(searchText);

        //the following options are displayed in the search drop down:
        List<String> expectedResultItems = new ArrayList<>();
        expectedResultItems.add("microwave in Home");
        expectedResultItems.add("mini fridge");
        expectedResultItems.add("microwave");
        expectedResultItems.add("mirror");
        expectedResultItems.add("microwave oven");

        List<String> actualResultItems = searchPage.getTypeAheadOptions();

        //verify all the expected items are found in actual result
        actualResultItems.containsAll(expectedResultItems);
        searchPage.clearText();

        searchPage.enterTextInToSearchInPutField(searchText1);
        List<String> expectedResultItems1 = new ArrayList<>();

        expectedResultItems.add("microwave");
        expectedResultItems.add("microwave in Home");
        expectedResultItems.add("microwave Oven");
        expectedResultItems.add("2gb micro sd");
        expectedResultItems.add("micro sd card");

        List<String> actualResult1 = searchPage.getProductTitles1();
        actualResult1.containsAll(expectedResultItems1);
        searchPage.clearText();

        searchPage.enterTextInToSearchInPutField(searchText2);
        List<String> expectedResultItems2 = new ArrayList<>();
        expectedResultItems.add("microwave");
        expectedResultItems.add("microwave in Home");
        expectedResultItems.add("microwave Oven");
        expectedResultItems.add("microwave popcorn");
        expectedResultItems.add("microwave stand");

        List<String> actualResult2 = searchPage.getProductTitles2();
        actualResult2.containsAll((expectedResultItems2));

        //verify if type-ahead starts with search term
        for (String option : actualResultItems) {
            boolean flag = option.startsWith(searchText);
            Assert.assertTrue(flag, option);
        }
        //Verify if type-ahead text is bold
        List<String> boldTexts = searchPage.getTypeAheadBoldText();
        for (String actualText : boldTexts) {
            Assert.assertEquals(searchText, actualText);
        }


    }

    //verify a user is able to see price and rating in the search result grid.
    @Test
    public void GTA_11_verifyAUserIsAbleToSeePriceAndRatingInTheSearchResultGrid() {
        //enter text in search input field
        String text = "shoes";
        searchPage.enterTextInToSearchInPutField(text);
        searchPage.clickOnSearchButton();
        List<String> priceLists = searchPage.getProductPrice();
        for (String priceList : priceLists) {
            Assert.assertTrue(priceList.startsWith("$"));
        }
        Assert.assertTrue(searchPage.areRatingsDisplayed());
    }

    @Test
    public void GTA_12_Verify_Error_Message() {
        String expectedResult = "Sorry, no products matched \"JKJKJKJKJK\"\n" +
                "Check your spelling\n" +
                "Use different keywords and try again\n" +
                "Contact your local store";
        String errorMessage = "JKJKJKJKJK";
        searchPage.enterTextInToSearchInPutField(errorMessage);
        searchPage.clickOnSearchButton();
        searchPage.getErrorMessage();
        System.out.println(searchPage.getErrorMessage());
        Assert.assertEquals(expectedResult, searchPage.getErrorMessage());

    }
}
