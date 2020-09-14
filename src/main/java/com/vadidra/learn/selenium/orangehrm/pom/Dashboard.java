package com.vadidra.learn.selenium.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard extends BasePage{


    public Dashboard(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() throws Exception {
        return false;
    }
}
