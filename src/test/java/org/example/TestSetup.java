package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class TestSetup {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String baseUrl = "https://ecommerce-playground.lambdatest.io";

    @BeforeClass
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void initDriver() {

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        option.addArguments("--disable-sync"); // Inaktivera synkronisering med användarkonton
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofMillis(8000));
    }


    @AfterClass
    public void quitAfterClass (){
        driver.quit();
    }

    @AfterMethod
    public WebDriverWait getWait() {
        return wait;
    }

    public void tearDown(){
    }
}