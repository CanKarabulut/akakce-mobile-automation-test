package mobileautomation.stepdefinitions.login;

import io.cucumber.java.en.When;
import mobileautomation.steps.andsteps.login.LoginSteps;


public class LoginStepDefinitions {
    LoginSteps loginSteps = new LoginSteps();


    @When("User continues without login")
    public void userContinuesWithoutLogin() {
        loginSteps.continuesWithoutLogin();
    }

    @When("User login with {string} username and {string} password")
    public void userContinuesWithLogin(String userName, String password) {
        loginSteps.continuesWithLogin(userName, password);
    }
}
