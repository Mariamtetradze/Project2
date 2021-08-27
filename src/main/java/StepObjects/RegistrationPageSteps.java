package StepObjects;
import PageObjects.RegistrationPage;
import io.qameta.allure.Step;

public class RegistrationPageSteps extends RegistrationPage {
    @Step("Sign up step with first name - {fname}")
    public RegistrationPageSteps setFirstName(String fname) {
        FirstNameInput.setValue(fname);
        return this;
    }
    @Step("Sign up step with last name - {lname}")
    public RegistrationPageSteps setLastName(String lname) {
        LastNameInput.setValue(lname);
        return this;
    }
    @Step("Sign up step with email - {email}")
    public RegistrationPageSteps setEmail(String email) {
        EmailInput.setValue(email);
        return this;
    }
    @Step("Sign up step with number - {number}")
    public RegistrationPageSteps setNumber(String number) {
        TelephoneInput.setValue(number);
        return this;
    }
    @Step("Sign up step with password - {pass}")
    public RegistrationPageSteps setPassword(String pass) {
        PasswordInput.setValue(pass);
        return this;
    }
    @Step("Sign up step with confirm password - {confPass}")
    public RegistrationPageSteps confirmPassword(String confPass) {
        PasswordConfirmInput.setValue(confPass);
        return this;
    }
    @Step("Agree to registration terms")
    public RegistrationPageSteps agreeToTerms() {
        AgreeTermsCheckBox.click();
        return this;
    }

    @Step("Confirm registration")
    public RegistrationPageSteps confirmRegistration() {
        ConfirmButton.click();
        return this;
    }







}
