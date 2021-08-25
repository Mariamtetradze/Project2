package StepObjects;

import PageObjects.Common;
import io.qameta.allure.Step;

public class CommonSteps extends Common {
    @Step("Click my account on main page")
    public CommonSteps goToMyAccount() {
        MyAccount.click();
        return this;
    }
    @Step("Choose to register")
    public CommonSteps clickRegisterButton() {
        RegisterOption.click();
        return this;
    }
    @Step("Go to laptops and notebooks section from main page")
    public CommonSteps clickLaptopsAndNotebooks() {
        LaptopsAndNotebooksOption.click();
        return this;
    }

    @Step("Choose to see all laptops and notebooks")
    public CommonSteps clickShowAllLaptopsAndNotebooksOption() {
        ShowAllLaptopsAndNotebooksOption.click();
        return this;
    }

    @Step("Go to desktops from main page")
    public CommonSteps goToDesktops() {
        DesktopsOption.click();
        return this;
    }
    @Step("Choose to see all desktops")
    public CommonSteps goToAllDesktops() {
        ShowAllDesktops.click();
        return this;
    }

    @Step("Go to shopping cart")
    public CommonSteps goToShoppingCart() {
        ShoppingCart.click();
        return this;
    }

    @Step("Choose to checkout")
    public CommonSteps goToCheckOut() {
        Checkout.click();
        return this;
    }


}
