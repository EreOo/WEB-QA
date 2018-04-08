package com.qaforpeople.functionality.tests;

import com.qaforpeople.base.BaseTest;
import org.testng.annotations.Test;


/**
 * Author Vladimir S
 */
public class NoSearchResults extends BaseTest {

    public static final String NO_RESULTS_QUERY = "qweqwe";

    @Test
    public void noSearchResults() {
        openSite()
                .inputSeearch(NO_RESULTS_QUERY)
                .clickSearchButton()
                .checkNoSearchResultsMessage();
    }
}
