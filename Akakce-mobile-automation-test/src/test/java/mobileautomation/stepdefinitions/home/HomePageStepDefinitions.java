package mobileautomation.stepdefinitions.home;

import io.cucumber.java.en.And;
import mobileautomation.steps.andsteps.home.HomePageSteps;

public class HomePageStepDefinitions {

    HomePageSteps homePageSteps = new HomePageSteps();

    @And("User searches {string}")
    public void userSearches(String searchData) {
        homePageSteps.searchProductOnSearchBox(searchData);
    }
}
