package mobileautomation.steps.andsteps.productlist;

import mobileautomation.steps.BaseSteps;

import static mobileautomation.elements.productlist.ProductListPage.*;

public class ProductListPageOrderProcess extends BaseSteps {


    enum SortingType {
        EXPENSIVE, CHEAP, POPULARITY, HIGH_RATING, NEWEST
    }

    public void orderProducts(String orderingType) {
        clickElement(SORTING_BUTTON);
        SortingType sortingType = SortingType.valueOf(orderingType);
        switch (sortingType) {
            case CHEAP:
                clickElement(SORTING_BY_CHEAP_BUTTON);
                break;
            case NEWEST:
                clickElement(SORTING_BY_NEWEST_BUTTON);
                break;
            case EXPENSIVE:
                clickElement(SORTING_BY_EXPENSIVE_BUTTON);
                break;
            case POPULARITY:
                clickElement(SORTING_BY_POPULARITY_BUTTON);
                break;
            case HIGH_RATING:
                clickElement(SORTING_BY_HIGH_RATE_BUTTON);
                break;
        }
    }

}
