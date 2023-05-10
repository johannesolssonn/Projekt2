package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
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
    }
}
