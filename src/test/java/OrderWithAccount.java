import PageObjects.RegistrationPage;
import StepObjects.*;
import Utils.ChromeRunner;
import Utils.Retry;
import Utils.SQLJDBCUtil;
import Utils.TestListener;
import io.qameta.allure.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
@Listeners(TestListener.class)
@Epic("Regression Tests")
@Feature("Register and purchase product")
public class OrderWithAccount extends ChromeRunner {

    @Test(description = "Create account with valid data")
    @Description("Go to registration page and create account")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Registration with valid data")
    public void createAccount() throws SQLException {
        CommonSteps commonSteps = new CommonSteps();
        RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();
        RegistrationPage registrationPage = new RegistrationPage();

        commonSteps.goToMyAccount()
                .clickRegisterButton();

        Connection conn = SQLJDBCUtil.getConnection();
        String query = "select *  from users;";
        Statement stmt = conn.createStatement();
        ResultSet rs= stmt.executeQuery(query);
        rs.next();

        registrationPageSteps.setFirstName(rs.getString("firstName"))
                .setLastName(rs.getString("lastName"))
                .setEmail(RandomStringUtils.randomAlphabetic(4) + rs.getString("email"))
                .setNumber(rs.getString("phone"))
                .setPassword(rs.getString("password"))
                .confirmPassword(rs.getString("password"))
                .agreeToTerms()
                .confirmRegistration();

        Assert.assertEquals(registrationPage.RegistrationSuccessHeader.getText(), "Your Account Has Been Created!" );
    }

    @Test(dependsOnMethods = "createAccount", groups = { "Regression2" }, description = "Add available product to cart")
    @Description("Choose and add available product to cart")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Add item to cart")
    public void addItemToCart() {
        CommonSteps commonSteps = new CommonSteps();
        DesktopsSteps desktopsSteps = new DesktopsSteps();
        IpodShuffleSteps ipodShuffleSteps = new IpodShuffleSteps();

        commonSteps.goToDesktops()
                    .goToAllDesktops();

        desktopsSteps.goToMP3Players()
                    .verifyTitleAttribute()
                    .goToIpodShuffle();

        ipodShuffleSteps.addItemToCart()
                    .checkShoppingCart();
    }

    @Test(dependsOnMethods = "addItemToCart", retryAnalyzer = Retry.class, groups = { "Regression2" }, description = "go to checkout, set billing details and validate total price")
    @Description("Go to checkout, set billing details and validate total price")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Go to checkout and set billind details with valid data")
    public void goToCheckout() throws SQLException {
        CommonSteps commonSteps = new CommonSteps();
        CheckoutSteps checkoutSteps = new CheckoutSteps();

        Connection conn = SQLJDBCUtil.getConnection();
        String query = "select *  from users;";
        Statement stmt = conn.createStatement();
        ResultSet rs= stmt.executeQuery(query);
        rs.next();

            commonSteps.goToShoppingCart();
            commonSteps.goToCheckOut();

            checkoutSteps.setPaymentFirstName(rs.getString("firstName"))
                        .setPaymentLastName(rs.getString("lastName"))
                        .setPaymentAddress(rs.getString("address"))
                        .setPaymentCity(rs.getString("city"))
                        .setPaymentPCode(rs.getString("zip"))
                        .setPaymentCountry(rs.getString("country"))
                        .setPaymentRegion(rs.getString("city"))
                        .confirmBillinginfo()
                        .confirmDeliveryDetails()
                        .confirmShippingMethod()
                        .agreeToPaymentTerms()
                        .confirmPaymentMethod()
                        .checkTotalPrice();

    }


    }

