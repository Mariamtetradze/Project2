package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
    FirstNameInput =  $(By.id("input-firstname")),
    LastNameInput = $(By.id("input-lastname")),
    EmailInput =  $(By.id("input-email")),
    TelephoneInput = $(By.id("input-telephone")),
    PasswordInput = $(By.id("input-password")),
    PasswordConfirmInput = $(By.id("input-confirm")),
    AgreeTermsCheckBox = $(By.name("agree")),
    ConfirmButton = $(".btn-primary"),
    RegistrationSuccessHeader = $("#content").$("h1");
}
