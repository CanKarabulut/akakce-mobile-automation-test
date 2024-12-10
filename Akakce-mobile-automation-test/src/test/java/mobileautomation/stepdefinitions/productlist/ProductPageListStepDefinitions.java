package mobileautomation.stepdefinitions.productlist;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import mobileautomation.steps.andsteps.productlist.ProductListPageOrderProcess;
import mobileautomation.steps.andsteps.productlist.ProductListStepsFilterProcess;
import mobileautomation.steps.andsteps.productlist.ProductListStepsSelectionProcess;

public class ProductPageListStepDefinitions {

    ProductListStepsFilterProcess filterProcess = new ProductListStepsFilterProcess();
    ProductListPageOrderProcess orderProcess = new ProductListPageOrderProcess();
    ProductListStepsSelectionProcess selectionProcess = new ProductListStepsSelectionProcess();

    @When("User applies filters on product list")
    public void userAppliesFiltersOnProductList(DataTable dataTable) {
        filterProcess.applyFilters(dataTable);
    }

    @When("User orders by products starting {string}")
    public void userOrdersByProductsStarting(String orderingType) {
        orderProcess.orderProducts(orderingType);
    }

    @And("User selects the {int}  product")
    public void userSelectsTheProduct(int productOrder) {
        selectionProcess.selectSpecificProduct(productOrder);
    }
}
