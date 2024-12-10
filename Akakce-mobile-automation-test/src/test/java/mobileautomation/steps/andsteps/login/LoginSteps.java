package mobileautomation.steps.andsteps.login;

import mobileautomation.steps.BaseSteps;

import static mobileautomation.elements.login.LoginPage.*;

public class LoginSteps extends BaseSteps {

    public void continuesWithoutLogin() {
        if (isDisplayed(CONTINUE_WITHOUT_LOGIN_BUTTON)) {
            clickElement(CONTINUE_WITHOUT_LOGIN_BUTTON);
        }
    }

    public void continuesWithLogin(String userName, String password) {
        sendKeys(USER_NAME_INPUT, userName);
        sendKeys(USER_PASSWORD_INPUT, password);
        clickElement(LOGIN_BUTTON);
    }
}
