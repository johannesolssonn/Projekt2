package org.example;

import io.qase.api.annotation.QaseTitle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Buy extends TestSetup {


    @Test
    @QaseTitle("Buy Sony VAIO")
    public void buy() throws InterruptedException {

        driver.get(baseUrl);

        WebElement selectMyAccount = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#widget-navbar-217834 > ul > li:nth-child(6) > a")));
        selectMyAccount.click();

        WebElement inputEmail = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input-email")));
        inputEmail.sendKeys("gargen.jansson@gmail.com");

        WebElement inputPassword = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input-password")));
        inputPassword.sendKeys("görgen");

        WebElement selectLogin = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Login']")));
        selectLogin.click();

        WebElement searchForProduct = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='entry_217822'] input[placeholder='Search For Products']")));
        searchForProduct.sendKeys("Sony VAIO");

        WebElement selectSonyVAIO = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("h4[class='title'] a")));
        selectSonyVAIO.click();

        WebElement selectBuyNow = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[title='Buy now']")));
        selectBuyNow.click();

        WebElement termsAndConditions = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label[for='input-agree']")));
        termsAndConditions.click();

        WebElement selectContinue = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#button-save")));
        selectContinue.click();

        WebElement selectConfirmOrder = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#button-confirm")));
        selectConfirmOrder.click();


    }

}