package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register {
    private WebDriver driver;

    private final static String baseurl = "https://ecommerce-playground.lambdatest.io/";

    @BeforeClass
    public void beforeClass(){
    }

    @BeforeMethod
    public void beforeMethod(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments();
        driver = new ChromeDriver(options);
    }
    @Test
    public void LogInTest() throws InterruptedException{
        driver.get(baseurl);
        driver.findElement(By.linkText("My account")).click();
        driver.findElement(By.linkText("Continue")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("Görgen");
        driver.findElement(By.id("input-lastname")).sendKeys("jansson");
        driver.findElement(By.id("input-email")).sendKeys("gargen.jansson@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("01010102021");
        driver.findElement(By.id("input-password")).sendKeys("görgen");
        driver.findElement(By.id("input-confirm")).sendKeys("jansson");
        driver.findElement(By.cssSelector("label[for='input-agree']")).click();
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
    }
    @AfterMethod
    public void quitTest(){
        driver.quit();
    }
}
