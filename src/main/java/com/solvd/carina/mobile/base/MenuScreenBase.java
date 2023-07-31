package com.solvd.carina.mobile.base;

import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MenuScreenBase extends MobileAbstractPage {

    public MenuScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginScreenBase clickLogoutLink();

    public abstract WebViewScreenBase clickAboutLink();
}
