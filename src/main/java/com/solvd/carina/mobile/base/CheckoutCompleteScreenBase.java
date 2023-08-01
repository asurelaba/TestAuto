package com.solvd.carina.mobile.base;

import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CheckoutCompleteScreenBase extends MobileAbstractPage {

    public CheckoutCompleteScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract ProductScreenBase clickBackHomeButton();

}
