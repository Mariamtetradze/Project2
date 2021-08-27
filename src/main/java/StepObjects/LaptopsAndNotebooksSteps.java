package StepObjects;

import PageObjects.LaptopsAndNotebooksPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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


    public LaptopsAndNotebooksSteps validateSorting() {
        for(int i=0; i<ProductPrices.size(); i++) {
            List<String> prices = new ArrayList<String>();
            String productPrices = ProductPrices.get(i).getText().substring(9, ProductPrices.get(i).getText().length() -3 );
           // int pricesWithoutComma = Integer.parseInt(productPrices.replace(",", ""));
         //   int withoutCommaInt = Integer.parseInt(pricesWithoutComma);
            prices.add(productPrices);
            List<String> sortedPrices = new ArrayList<String>(prices);
            Collections.sort(sortedPrices);
            Assert.assertEquals(prices, sortedPrices);
        }
        return this;
    }

}
