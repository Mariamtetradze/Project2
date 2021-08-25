package StepObjects;

import PageObjects.LaptopsAndNotebooksPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.util.Collection;

public class LaptopsAndNotebooksSteps extends LaptopsAndNotebooksPage {

    @Step("Click sort by")
    public LaptopsAndNotebooksSteps clickSortBy() {
        SortByPriceSelection.click();
        return this;
    }

    @Step("Choose to sort by price - higher to lower")
    public LaptopsAndNotebooksSteps sortByHigherToLower() {
        HigherToLowerOption.click();
        return this;
    }


    public LaptopsAndNotebooksSteps printCollection() {
        for(int i=0; i<ProductPrices.size(); i++) {
          //  Integer.parseInt(ProductPrices.get(i).getText().substring(8, ProductPrices.get(i).getText().length() -3 ));
            System.out.println(ProductPrices.get(i).getText().substring(9, ProductPrices.get(i).getText().length() -3 ));
        }
        return this;
    }


}
