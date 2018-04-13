package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;
import org.testng.annotations.Test;


/**
 * Author Vladimir S
 */
public class NoSearchResults extends BaseTest {

    private static final String NO_RESULTS_QUERY = "qweqwe";

    @Test
    public void noSearchResults() {
        openSite()
                .inputSearch(NO_RESULTS_QUERY)
                .clickSearchButton()
                .checkNoSearchResultsMessage(NO_RESULTS_QUERY);
    }
}
