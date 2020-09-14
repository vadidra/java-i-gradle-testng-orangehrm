package com.vadidra.learn.selenium.orangehrm;

import org.testng.annotations.*;

import org.openqa.selenium.WebDriver;
import com.vadidra.learn.selenium.orangehrm.pom.Browser;
import com.vadidra.learn.selenium.orangehrm.pom.LoginPage;


import static org.testng.Assert.*;


public class LoginPageTest {

    private static WebDriver driver;

    @BeforeClass
    static void setUp(){
        driver = Browser.getDriver("chrome");
    }

    @AfterClass
    static void tearDown(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Test
    public void login_With_Valid_Credentials(){
        LoginPage loginPage;
        try {
            // given
            loginPage = new LoginPage(driver);
            // when
            loginPage.navigateTo();
            loginPage.loginWithValidCredentials();
            // then
            String welcomeText = loginPage.getWelcomeText();
            assertTrue(welcomeText.equals("Welcome Linda"));
        }
        catch (Exception e) {
            fail("Exception " + e);
        }
    }

    @Test
    public void login_With_Invalid_Credentials(){
        LoginPage loginPage;
        try {
            // given
            loginPage = new LoginPage(driver);
            // when
            loginPage.navigateTo();
            loginPage.loginWithInvalidCredentials();
            // then
            // need to verify org.openqa.selenium.NoSuchElementException
            ThrowingRunnable runnable = () -> loginPage.getWelcomeText();
            assertThrows(runnable);
        }
        catch (Exception e) {
            fail("Exception " + e);
        }
    }

}
