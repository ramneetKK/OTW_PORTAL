package stepdefinitions;

import com.pages.HomePage;
import com.pages.HomePage_otp;
import com.pages.LoginPage_otp;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePageOTPsteps {

    private LoginPage_otp loginpageOtp = new LoginPage_otp(DriverFactory.getDriver());
    private HomePage_otp hp_otp;



    @Given("user in on login page by login method")
    public void user_in_on_login_page_by_login_method() throws InterruptedException {

        System.out.println("...login Steps starts ........................");

        hp_otp = (HomePage_otp) loginpageOtp.LoginInApplication("rkaur@abacusnext.com", "QAtest1@");

        Thread.sleep(10000);
    }

    @When("user clicks on invoice tab")
    public void user_clicks_on_invoice_tab() throws InterruptedException {
        hp_otp.clickonInvoiceTab();

        Thread.sleep(10000);
    }


    @When("user clicks on makePayment button")
    public void user_clicks_on_make_payment_button() throws InterruptedException {
        System.out.println("user clicks onmakepaymnet button");
        hp_otp.user_clicks_on_make_payment_button();


        Thread.sleep(10000);

    }

    @Then("I click on addCart button")
    public void user_clicks_on_addcard_button() throws InterruptedException {
        System.out.println("user clicks on addcardbtn");
        hp_otp.user_clicks_on_addcard_button();


    }
//
//    @Then("user scroll down till add payment detail page displayed")
//    public void Scroll_Down() throws InterruptedException {
//        System.out.println("Scroll down");
//              hp_otp.Scroll();
//
//        // User of java script executor interface to handle scroll bar .....
//
//        System.out.println("done scrolling");
//
//
//    }


    @Then("user add card details")
    public void user_add_card_details() throws InterruptedException {
//        System.out.println("IN add card detail step ...");
        hp_otp.user_enters_addcard_detail();
    }

    @Then("select Payment Method")
    public void select_payment_method() throws InterruptedException {

//        hp_otp.Select_Payment_method();
    }

    @Then("Pays with card")
    public void pays_with_card() throws InterruptedException {
        hp_otp.pays_with_card();

    }

//@And("delete payment")
//public void delete_payment() {
//        hp_otp.delete_payment();

    @When("user clicks on delete")
    public void user_clicks_on_delete() {


    }
//   @And("Delete")
//    public void delete() {
//        hp_otp.delete();
//
//    }


    @Then("verify the Payment Successful message")
    public  void verify_sucessful_message()
    {
        hp_otp.verify_sucessful_message();
    }}

