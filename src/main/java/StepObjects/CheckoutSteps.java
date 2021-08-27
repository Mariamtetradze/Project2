package StepObjects;

import PageObjects.CheckoutPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.sleep;

public class CheckoutSteps extends CheckoutPage {
    @Step("Set billing details with first name - {payfname}")
    public CheckoutSteps setPaymentFirstName(String payfname) {
        PaymentFirstName.setValue(payfname);
        return this;
    }
    @Step("Set billing details with last name - {paylname}")
    public CheckoutSteps setPaymentLastName(String paylname) {
        PaymentLastName.setValue(paylname);
        return this;
    }

    @Step("Set billing details with address - {payaddress}")
    public CheckoutSteps setPaymentAddress(String payaddress) {
        PaymentAddress.setValue(payaddress);
        return this;
    }
    @Step("Set billing details with city - {city}")
    public CheckoutSteps setPaymentCity(String city) {
        PaymentCity.setValue(city);
        return this;
    }
    @Step("Set billing details with post code - {pcode}")
    public CheckoutSteps setPaymentPCode(String pcode) {
        PaymentPostCode.setValue(pcode);
        return this;
    }
    @Step("Set billing details with country - {country}")
    public CheckoutSteps setPaymentCountry(String country) {
        PaymentCountry.selectOption(country);
        return this;
    }
    @Step("Set billing details with region - {region}")
    public CheckoutSteps setPaymentRegion(String region) {
        PaymentRegion.selectOption(region);
        return this;
    }
    @Step("Confirm billing information")
    public CheckoutSteps confirmBillinginfo() {
        ConfirmBillingInfo.click();
        return this;
    }
    @Step("Confirm delivery details")
    public CheckoutSteps confirmDeliveryDetails() {
        ConfirmDeliveryDetails.click();
        return this;
    }
    @Step("Confirm shipping method")
    public CheckoutSteps confirmShippingMethod() {
        ConfirmShippingMethod.click();
        return this;
    }
    @Step("Agree to payment terms")
    public CheckoutSteps agreeToPaymentTerms() {
        AgreeToPaymentTerms.click();
        return this;
    }
    @Step("Confirm payment method")
    public CheckoutSteps confirmPaymentMethod() {
        ConfirmPaymentMethod.click();
        return this;
    }

    @Step("check that Sub-Total, Flat Shipping Rate and Total amount is correct")
    public CheckoutSteps checkTotalPrice() {
        sleep(1000);
        int softPrice =Integer.parseInt(SubToTal.getText().substring(1, SubToTal.getText().length() -3 ));
        int softFlat = Integer.parseInt(FlatRate.getText().substring(1, FlatRate.getText().length() -3 ));
        int softTotal = Integer.parseInt(Total.getText().substring(1, Total.getText().length() -3 ));
        int expectedTotal = softPrice + softFlat;
        Assert.assertEquals(softTotal, expectedTotal);
        return this;
    }
}

