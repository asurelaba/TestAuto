package com.solvd.carina.orangehrm.pages;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {

    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class);

    protected LoginPage(WebDriver driver) {
        super(driver);
    }
}
