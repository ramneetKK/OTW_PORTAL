package com.pages;

import com.qa.factory.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class HomePage_otp {

    private WebDriver driver;

    private By invoicetabBtn = By.xpath("//a[contains(text(),'Invoices')]");
    private By makepayBtn = By.xpath(" //button[contains(text(),\"Make Payment\")] ");
    private By Makepaymnetpage = By.xpath("//h4[contains(text(),'Make a Payment')] ");
    private By AddcardBtn = By.xpath("//button[contains(text(),\"Add Card\")]");
    private By addname = By.xpath("//input[@id='name']");
    private By addcardnum = By.xpath("//input[@id='payment_number']");
    private By addexp = By.xpath("//input[@id='expiration']");
    private By addemail = By.xpath("//input[@id='email']");
    private By scountry = By.xpath("//*[@id=\"country\"]");
    private By scountry1 = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]");
    private By addcity = By.xpath("//input[@id='city']");
    private By addaddress = By.xpath("//input[@id='address']");
    private By addaddress2 = By.xpath("//input[@id='address2']");
    private By addpostal = By.xpath("//input[@id='postalCode']");
    private By addprov = By.xpath("//*[@id=\"state\"]");
    private By addprov1 = By.xpath("//div[@id='menu-']/div[3]/ul/li[6]");
    private By save = By.xpath("//span[contains(.,'SAVE')]");
    private By next = By.xpath("//button[contains(.,'NEXT')]");
    private By pay = By.xpath("//button[contains(.,'PAY')]");
    private By Scroll = By.xpath("//*[@id=\\\"paymentModal\\\"]/div/div/div[2]/div[2]/div/div[2]/div[3]/div[1]");
    private By paymentmethod = By.xpath("//button[contains(.,'NEXT')]");
    private By Sucessmessage = By.xpath("//button[contains(.,'PAY')]");


    //Constructor ...................

    public HomePage_otp(WebDriver driver) {

        this.driver = driver;
    }

    public void clickonInvoiceTab() {


        driver.findElement(invoicetabBtn).click();
    }

    public void user_clicks_on_make_payment_button() throws InterruptedException {
        List<WebElement> paymentButtonList = driver.findElements(makepayBtn);
        WebElement el = paymentButtonList.get(1);
        el.click();
        Thread.sleep(5000);
        List<WebElement> checkBoxList = driver.findElements(By.xpath("//label[@class=\"custom-control-label\"]"));
        int n = checkBoxList.size();
        WebElement ele2 = checkBoxList.get(n - 1);
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"check_331\"]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", ele2);
    }


//
//    public void Select_Payment_method() throws InterruptedException {
//        Thread.sleep(5000);
//        List<WebElement> checkBoxList =driver.findElements(By.xpath("//label[@class=\"custom-control-label\"]"));
//        int n  =checkBoxList.size();
//        WebElement ele2 = checkBoxList.get(n-1);
//        WebElement ele= driver.findElement(By.xpath("//*[@id=\"check_331\"]"));
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("arguments[0].click()", ele2);
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//button[contains(.,'NEXT')]")).click();}
//

//    public String user_verify_makepayment_page() {
//        return driver.findElement(Makepaymnetpage).getText();
//
//    }


    public void user_clicks_on_addcard_button() throws InterruptedException {
//             driver.findElement(AddcardBtn).click();
//        Thread.sleep(5000);
        driver.findElement(By.xpath(" //button[contains(text(),\"Add Card\")]")).click();
        Thread.sleep(50000);
        driver.switchTo().frame("apx2-card-frame");

        //payFields-iframe-name
        driver.switchTo().frame("payFields-iframe-name");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ramneet kkk");


        Thread.sleep(5000);

        // Handling scroll bar ......

//        WebElement  element1=driver.findElement(By.xpath("//*[@id=\"paymentModal\"]/div/div/div[2]/div[2]/div/div[2]/div[3]/div[1]"));
//
//        // User of java script executor interface to handle scroll bar .....
//
//        JavascriptExecutor je = (JavascriptExecutor) driver;
//        je.executeScript("arguments[0].scrollIntoView(true);",element1);
//
//        System.out.println("done ");
//        Thread.sleep(10000);


        driver.switchTo().defaultContent();
        driver.switchTo().frame("apx2-card-frame");
        driver.switchTo().frame("payFields-iframe-number");

        driver.findElement(By.xpath("//input[@id='payment_number']")).sendKeys("5454545454545454");
        Thread.sleep(5000);


        driver.switchTo().defaultContent();
        driver.switchTo().frame("apx2-card-frame");
        driver.switchTo().frame("payFields-iframe-expiration");

        driver.findElement(By.xpath("//input[@id='expiration']")).sendKeys("1123");
        Thread.sleep(5000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("apx2-card-frame");
        driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("a@a.com");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Toronto");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("15 bay street");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("ROAD");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Toronto");
        driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("L6T 1W5");
        driver.findElement(By.xpath("//*[@id=\"state\"]")).click();
        driver.findElement(By.xpath("//div[@id='menu-']/div[3]/ul/li[6]")).click();
        driver.findElement(By.xpath("//span[contains(.,'SAVE')]")).click();
        Thread.sleep(5000);

        List<WebElement> checkBoxList =driver.findElements(By.xpath("//label[@class=\"custom-control-label\"]"));

        int n  =checkBoxList.size();
        WebElement ele2 = checkBoxList.get(n-1);
        WebElement ele= driver.findElement(By.xpath("//*[@id=\"check_331\"]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", ele2);

        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(.,'NEXT')]")).click();

        driver.findElement(By.xpath("//button[contains(.,'PAY')]")).click();
        Thread.sleep(5000);
        String actualmessage= driver.findElement(By.xpath("//*[@id=\"paymentModal\"]/div/div/div[3]/div[2]/div")).getText();
        String ExpectedMessage ="Thank you for your payment!";
        Assert.assertEquals(actualmessage.toLowerCase().trim(),ExpectedMessage.toLowerCase().trim());



    }


    public void user_enters_addcard_detail() throws InterruptedException {
        Thread.sleep(15000);
        driver.switchTo().frame("apx2-card-frame");
              driver.switchTo().frame("payFields-iframe-name");
        Thread.sleep(5000);
        driver.findElement(addname).sendKeys("ramneet kaur");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        driver.switchTo().frame("apx2-card-frame");
        driver.switchTo().frame("payFields-iframe-number");
        driver.findElement(addcardnum).sendKeys("424242424242424242");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("apx2-card-frame");
        driver.findElement(scountry).click();
        driver.findElement(scountry1).click();
        driver.findElement(addemail).sendKeys("a@a.com");
        driver.findElement(addcity).sendKeys("Toronto");
        driver.findElement(addaddress).sendKeys("15 bay street");
        driver.findElement(addaddress2).sendKeys("ROAD");
        driver.findElement(addpostal).sendKeys("L6T 1W5");
        driver.findElement(addprov).click();
        driver.findElement(addprov1).click();
        driver.findElement(save).click();


    }
//
//    public void Select_Payment_method() throws InterruptedException {
//        Thread.sleep(5000);
//        List<WebElement> checkBoxList =driver.findElements(By.xpath("//label[@class=\"custom-control-label\"]"));
//        int n  =checkBoxList.size();
//        WebElement ele2 = checkBoxList.get(n-1);
//        WebElement ele= driver.findElement(By.xpath("//*[@id=\"check_331\"]"));
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("arguments[0].click()", ele2);
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//button[contains(.,'NEXT')]")).click();




    public void pays_with_card() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(pay).click();
    }



    public void verify_sucessful_message() {
        String actualmessage = driver.findElement(By.xpath("//*[@id=\"paymentModal\"]/div/div/div[3]/div[2]/div")).getText();
        String ExpectedMessage = "Thank you for your payment!";
        Assert.assertEquals(actualmessage.toLowerCase().trim(), ExpectedMessage.toLowerCase().trim());

    }

    public void clickondelete() {


        driver.findElement(invoicetabBtn).click();
    }


//
//    public void delete()  {
//        List<WebElement> checkBoxList1 =driver.findElements(By.xpath("//label[@class=\"text-center\"]"));
//        int p  =checkBoxList1.size();
//        WebElement elem2 = checkBoxList1.get(p-1);
//        WebElement elem= driver.findElement(By.xpath("//*[@id=\"check_331\"]"));
//        JavascriptExecutor jsee = (JavascriptExecutor)driver;
//        jsee.executeScript("arguments[0].click()", elem2);
//        driver.findElement(By.xpath("//tbody/tr[1]/td[6]")).click();}
////
//
//
//        String actualmessage1 = driver.findElement(By.xpath("//p[contains(text(),'Are you sure you want to delete the payment method')]")).getText();
//
//        // xyz 1234  //xyz
//
//        String updateactualmessage = actualmessage1.replaceAll("[0-9]","").trim();
//        String ExpectedMessage1 = "Are you sure you want to delete the payment method ending in ?";
//        Assert.assertEquals(updateactualmessage.toLowerCase().trim(), ExpectedMessage1.toLowerCase().trim());
//        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

}


