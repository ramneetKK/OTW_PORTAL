package stepdefinitions;

import com.google.common.base.Equivalence;
import com.pages.LoginPage;
import com.pages.LoginPage_otp;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.nashorn.internal.objects.NativeString;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
 import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LoginPageOTPsteps {

    private LoginPage_otp loginpageOtp = new LoginPage_otp(DriverFactory.getDriver());



    @Given("user is on login page")
    public void user_is_on_login_page() {

        System.out.println("In Login Page ");
        DriverFactory.getDriver().get("https://savecash.qafirmportal.com/login");
    }


    @When("user enter username {string}")
    public void user_enter_username(String Uname) {

        loginpageOtp.enterUserName(Uname);


    }

    @When("user enter password as {string}")
    public void user_enter_password_as(String Pwd) {

        loginpageOtp.enterPassword(Pwd);
    }

    @When("user clicks on singin Button")
    public void user_clicks_on_singin_button() {

        loginpageOtp.clickONLogin();

    }

    @Then("Verify the tile of home page as {string}")
    public void verify_the_tile_of_home_page_as(String ExpectedTitle) {

        String ActualTile = loginpageOtp.getLoginPageTitle();
        Assert.assertEquals(ExpectedTitle.trim(), ActualTile.trim());

    }

    @Then("Verify that forgotpassword link is enabled")
    public void verify_that_forgotpassword_link_is_enabled() {

        System.out.println("........forgotpassword ;ink verifications starts ");

        Assert.assertTrue(loginpageOtp.isforgetPswLinkExist());

        System.out.println("......Forget password verification sucessfully done ...");
    }



    @Then("Verify error message {string}")
    public void verify_error_message(String expected) {

                System.out.println(".....................Verification of alert starts ..........................");



    }


//
//            @Then("Click Invoice Tab")
//            public void Click Invoice Tab() {
        }
