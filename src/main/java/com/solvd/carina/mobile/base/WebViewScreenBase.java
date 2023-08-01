package com.solvd.carina.mobile.base;

import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WebViewScreenBase extends MobileAbstractPage {

    public WebViewScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isUrlEqual(String url);
}
