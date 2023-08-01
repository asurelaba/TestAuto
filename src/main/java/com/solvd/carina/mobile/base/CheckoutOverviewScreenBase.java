package com.solvd.carina.mobile.base;

import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CheckoutOverviewScreenBase extends MobileAbstractPage {

    public CheckoutOverviewScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract CheckoutCompleteScreenBase clickFinishButton();
}
