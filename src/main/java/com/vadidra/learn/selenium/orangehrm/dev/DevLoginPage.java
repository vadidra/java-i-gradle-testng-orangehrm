package com.vadidra.learn.selenium.orangehrm.dev;

import com.vadidra.learn.selenium.orangehrm.pom.Browser;
import com.vadidra.learn.selenium.orangehrm.pom.LoginPage;
import org.openqa.selenium.WebDriver;


public class DevLoginPage {

    public static void testLoginPagePom(){

        WebDriver driver = null;
        LoginPage loginPage;

        try {

            //driver = Browser.getDriver("chrome");
            driver = Browser.getDriver("firefox");

            loginPage = new LoginPage(driver);
            loginPage.navigateTo();
            loginPage.loginWithValidCredentials();

            if (loginPage.isAt()) {
                System.out.println("Logged in");
            }


        }
        catch (Exception e) {
            System.out.println("Exception " + e);
        }
        finally{
            if (driver !=null) {
                driver.quit();
                driver = null;
            }
        }

    }

    public static void main(String[] args){
        testLoginPagePom();
        System.exit(0);
    }

}
