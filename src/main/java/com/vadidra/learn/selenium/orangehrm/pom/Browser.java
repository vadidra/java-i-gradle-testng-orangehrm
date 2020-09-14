package com.vadidra.learn.selenium.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class Browser {

    public static WebDriver getDriver(String browser) {

        WebDriver driver = null;
        WebDriverWait wait = null;
        //String browser = System.getProperty("browser");

        switch (browser) {
            case "chrome":
                //System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                //System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser name");
        }

        driver.manage().window().maximize();
        return driver;
    }

}
