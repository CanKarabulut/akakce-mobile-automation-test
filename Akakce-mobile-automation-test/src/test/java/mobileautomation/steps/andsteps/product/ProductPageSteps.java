package mobileautomation.steps.andsteps.product;

import mobileautomation.steps.BaseSteps;
import org.junit.jupiter.api.Assertions;

import static mobileautomation.elements.product.ProductPage.GO_TO_SELLER_BUTTON;

public class ProductPageSteps extends BaseSteps {

    public void userVerifyOnTheProductPage() {
        Assertions.assertTrue(isDisplayed(GO_TO_SELLER_BUTTON));
    }
}
