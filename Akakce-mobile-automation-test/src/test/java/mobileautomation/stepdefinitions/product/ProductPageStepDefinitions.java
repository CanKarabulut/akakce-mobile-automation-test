package mobileautomation.stepdefinitions.product;

import io.cucumber.java.en.Then;
import mobileautomation.steps.andsteps.product.ProductPageSteps;

public class ProductPageStepDefinitions {

    ProductPageSteps productPageSteps = new ProductPageSteps();


    @Then("User should see the Satıcıya Git button on the product page")
    public void userShouldSeeTheButtonOnTheProductPage() {
        productPageSteps.userVerifyOnTheProductPage();
    }
}
