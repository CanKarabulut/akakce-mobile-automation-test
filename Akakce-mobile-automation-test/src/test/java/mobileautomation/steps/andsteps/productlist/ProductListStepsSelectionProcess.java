package mobileautomation.steps.andsteps.productlist;

import mobileautomation.steps.BaseSteps;

import static mobileautomation.elements.productlist.ProductListPage.*;

public class ProductListStepsSelectionProcess extends BaseSteps {

    public void selectSpecificProduct(int productOrder) {
        int count = 1;
        while (count < productOrder + 1) {
            scrollByElementHeight(findElement(PRODUCT_SCROLL_AREA), findElement(PRODUCTS_OPTIONS), "down");
            count++;
        }
        findElements(PRODUCTS_NAME_OPTIONS).get(1).click();
        clickElement(CONTINUE_PRODUCT_BUTTON);
    }
}
