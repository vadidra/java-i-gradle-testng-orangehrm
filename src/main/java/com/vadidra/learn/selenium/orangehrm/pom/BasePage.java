package com.vadidra.learn.selenium.orangehrm.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public abstract class BasePage {

    public static final String BASE_URL = "https://opensource-demo.orangehrmlive.com/";

    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    abstract public boolean isAt() throws Exception;

    public String getTitle(){
        return this.driver.getTitle();
    }

    public String getWelcomeText() throws Exception{
        return driver.findElement(By.id("welcome")).getText();
    }

}
