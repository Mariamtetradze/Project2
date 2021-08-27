package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {
    public SelenideElement
    PaymentFirstName = $("#input-payment-firstname"),
    PaymentLastName = $("#input-payment-lastname"),
    PaymentAddress = $("#input-payment-address-1"),
    PaymentCity = $("#input-payment-city"),
    PaymentPostCode = $("#input-payment-postcode"),
    PaymentCountry = $("#input-payment-country"),
    PaymentRegion = $("#input-payment-zone"),
    ConfirmBillingInfo = $("#button-payment-address"),
    ConfirmDeliveryDetails = $("#button-shipping-address"),
    ConfirmShippingMethod = $("#button-shipping-method"),
    AgreeToPaymentTerms = $(By.name("agree")),
    ConfirmPaymentMethod = $("#button-payment-method"),
    SubToTal = $(By.xpath("//div[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tfoot/tr[1]/td[2]")),
    FlatRate = $(By.xpath("//div[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tfoot/tr[2]/td[2]")),
    Total = $(By.xpath("//div[@id=\"collapse-checkout-confirm\"]/div/div[1]/table/tfoot/tr[3]/td[2]"));

}
