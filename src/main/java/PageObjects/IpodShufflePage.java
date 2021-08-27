package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class IpodShufflePage {
    public SelenideElement
    AddToCart = $("#button-cart"),
    ProductQuantity = $(By.name("quantity")),
    ProductPrice = $(By.xpath("//div[@class=\"col-sm-4\"]//li//h2[contains(text(), '$')]")),
    SuccessMessage = $(".alert-success");

}
