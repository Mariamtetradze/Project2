package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Common {
    public SelenideElement
    MyAccount = $(byText("My Account")),
    RegisterOption =  $(byText("Register")),
    LaptopsAndNotebooksOption = $(byText("Laptops & Notebooks")),
    ShowAllLaptopsAndNotebooksOption = $(byText("Show All Laptops & Notebooks")),
    DesktopsOption = $(byText("Desktops")),
    ShowAllDesktops = $(byText("Show All Desktops")),
    ShoppingCart = $("#cart-total"),
    Checkout = $(".fa-share");


}
