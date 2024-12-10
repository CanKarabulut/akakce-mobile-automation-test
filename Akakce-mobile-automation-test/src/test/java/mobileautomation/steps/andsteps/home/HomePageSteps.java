package mobileautomation.steps.andsteps.home;

import mobileautomation.steps.BaseSteps;

import static mobileautomation.elements.home.HomePage.SEARCH_BOX;

public class HomePageSteps extends BaseSteps {


    public void searchProductOnSearchBox(String searchData) {
        clickElement(SEARCH_BOX);
        forcedSendKeys(SEARCH_BOX, searchData);
        sendEnter();
    }
}
