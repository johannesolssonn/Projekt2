package org.example;

import io.qase.api.annotation.QaseTitle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Login extends TestSetup{
    @Test
    @QaseTitle("Login")
    public void LoginTest() throws InterruptedException{
        driver.get(baseUrl);

        WebElement selectMyAccount = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#widget-navbar-217834 > ul > li:nth-child(6) > a")));
        selectMyAccount.click();

        WebElement inputEmail = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input-email")));
        inputEmail.sendKeys("gargen.jansson@gmail.com");

        WebElement inputPassword = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input-password")));
        inputPassword.sendKeys("görgen");

        WebElement selectLogin = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Login']")));
        selectLogin.click();
    }
}
