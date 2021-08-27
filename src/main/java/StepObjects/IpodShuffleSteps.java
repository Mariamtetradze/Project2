package StepObjects;

import PageObjects.IpodShufflePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import PageObjects.Common;


public class IpodShuffleSteps extends IpodShufflePage {
Common common = new Common();

    @Step("Add item to cart")
    public IpodShuffleSteps addItemToCart() {
        AddToCart.click();
        return this;
    }

    @Step("Check by item's count and price, that product was successfully added to cart")
    public IpodShuffleSteps checkShoppingCart() {
        String expectedTextOnCart =  ProductQuantity.getAttribute("value") + " item(s) -" +" " + ProductPrice.getText();
        SuccessMessage.shouldBe(Condition.visible);
        Assert.assertTrue(common.ShoppingCart.getText().equals(expectedTextOnCart));
        return this;
    }

}
