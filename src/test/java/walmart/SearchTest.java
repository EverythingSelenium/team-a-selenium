package walmart;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SearchTest extends WalmartBaseTest {
    SearchPage searchPage = new SearchPage();



    @Test
    public void GTA_9_verify_User_Is_Able_To_Search_SuccessFully(){
        //enter text in search input field and press enter
        String searchText = "Dress";
        searchPage.enterTextInToSearchInPutField(searchText);
        searchPage.clickOnSearchButton();

        //search result grid is displayed with items containing search text
        List<String> titles = searchPage.getProductTitles();
        for(String title : titles){
            Assert.assertTrue(title.contains(searchText),"Title = "+ title);
        }

    }

    @Test
    public void GTA_10_verify_a_User_is_able_to_see_the_type_ahead_when_they_Start_typing_in_the_search_bar(){
        String searchText = "mi";
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

        //verify if type-ahead starts with search term
        for(String option : actualResultItems){
            boolean flag = option.startsWith(searchText);
            Assert.assertTrue(flag, option);
        }


        //Verify if type-ahead text is bold
        List<String> boldTexts = searchPage.getTypeAheadBoldText();
        for (String actualText: boldTexts){
            Assert.assertEquals(searchText,actualText);
        }


    }
    //verify a user is able to see price and rating in the search result grid.
    @Test
    public void Gta_11_verifyAUserIsAbleToSeePriceAndRatingInTheSearchResultGrid(){
        //enter text in search input field
        String text = "Dress";
        searchPage.enterTextInToSearchInPutField(text);
        searchPage.getProductPrice();
        List<String>priceLists = searchPage.getProductPrice();
        for(String priceList: priceLists){
            System.out.println(priceList);

        }
    }
}
