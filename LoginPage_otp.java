package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_otp {

    private WebDriver driver;

    private By username_otp = By.xpath("//input[@name=\"email\"]");

    private By password_otp = By.xpath("//input[@name=\"password\"]");

    private By loginBtn_otp = By.xpath("//button[contains(text(),'Login')]");

    private By forgetpasswordLink_otp = By.xpath("//a[contains(text(),'Forgot your password?')]");

   // private By Login_Error = By.xpath("//*[@id=toast-container]");
   private By Login_Error = By.xpath("/html/body/app-root/app-login/div");



    public LoginPage_otp(WebDriver driver) {

        this.driver = driver;
    }

    public String getLoginPageTitle() {

        return driver.getTitle();
    }


    public boolean isforgetPswLinkExist() {

        return driver.findElement(forgetpasswordLink_otp).isDisplayed();
    }


    public void enterUserName(String username1) {

        driver.findElement(username_otp).sendKeys(username1);
    }

    public void enterPassword(String pwd1) {

        driver.findElement(password_otp).sendKeys(pwd1);
    }

    public void clickONLogin() {

        driver.findElement(loginBtn_otp).click();
    }

    public String InValidPassworderrormessage() {


    return driver.switchTo().alert().getText();


    }




    public HomePage_otp LoginInApplication(String uname , String pwd){

        driver.findElement(username_otp).sendKeys(uname);
        driver.findElement(password_otp).sendKeys(pwd);
        driver.findElement(loginBtn_otp).click();
        return new HomePage_otp(driver);
//
    }

}



