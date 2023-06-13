package org.example;

import io.qase.api.annotation.QaseTitle;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Register extends TestSetup{

    @Test
    @QaseTitle("Register")
    public void Register() throws InterruptedException{

        driver.get(baseUrl);
        driver.findElement(By.linkText("My account")).click();
        driver.findElement(By.linkText("Continue")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("Görgen");
        driver.findElement(By.id("input-lastname")).sendKeys("jansson");
        driver.findElement(By.id("input-email")).sendKeys("gargen.jansson@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("01010102021");
        driver.findElement(By.id("input-password")).sendKeys("görgen");
        driver.findElement(By.id("input-confirm")).sendKeys("görgen");
        driver.findElement(By.cssSelector("label[for='input-agree']")).click();
        driver.findElement(By.cssSelector("input[value='Continue']")).click();


    }
}
