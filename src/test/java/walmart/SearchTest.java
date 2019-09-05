package walmart;

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
        String searchText1 = "cro";
        String searchText2 = "wave";
        //enter text in search input field
        searchPage.enterTextInToSearchInPutField(searchText);
        List<String> actualResultItems = searchPage.getTypeAheadOptions();

        //the following options are displayed in the search drop down:
        List<String> expectedResultItems = new ArrayList<>();
        expectedResultItems.add("microwave in Home");
        expectedResultItems.add("mini fridge");
        expectedResultItems.add("microwave");
        expectedResultItems.add("mirror");
        expectedResultItems.add("microwave oven");

        System.out.println("actualResultItems.toString() = " + actualResultItems.toString());
        System.out.println("expectedResultItems.toString() = " + expectedResultItems.toString());

        //verify all the expected items are found in actual result
        Assert.assertTrue(actualResultItems.containsAll(expectedResultItems));

        searchPage.enterTextInToSearchInPutField(searchText1);
        List<String> expectedResultItems1 = new ArrayList<>();

        expectedResultItems1.add("microwave");
        expectedResultItems1.add("microwave in Home");
        expectedResultItems1.add("microwave Oven");
        expectedResultItems1.add("2gb micro sd");
        expectedResultItems1.add("micro sd card");

        List<String> actualResult1 = searchPage.getProductTitles();

        System.out.println("actualResult1.toString() = " + actualResult1.toString());
        System.out.println("expectedResultItems1.toString() = " + expectedResultItems1.toString());

        Assert.assertTrue(actualResult1.containsAll(expectedResultItems1));

        searchPage.enterTextInToSearchInPutField(searchText2);
        List<String> expectedResultItems2 = new ArrayList<>();
        expectedResultItems2.add("microwave");
        expectedResultItems2.add("microwave in Home");
        expectedResultItems2.add("microwave Oven");
        expectedResultItems2.add("microwave popcorn");
        expectedResultItems2.add("microwave stand");

        List<String> actualResult2 = searchPage.getProductTitles();
        Assert.assertTrue(actualResult2.containsAll((expectedResultItems2)));

        //verify if type-ahead starts with search term
        for (String option : actualResultItems) {
            boolean flag = option.startsWith(searchText);
            Assert.assertTrue(flag, option);
        }
        //Verify if type-ahead text is bold
        List<String> boldTexts = searchPage.getTypeAheadBoldText();
        for (String actualText : boldTexts)
            Assert.assertEquals(searchText, actualText);
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
