package com.solvd.carina.mobile.android;

import com.solvd.carina.mobile.base.LoginScreenBase;
import com.solvd.carina.mobile.base.MenuScreenBase;
import com.solvd.carina.mobile.base.WebViewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MenuScreenBase.class)
public class MenuScreen extends MenuScreenBase {

    @ExtendedFindBy(accessibilityId = "test-LOGOUT")
    private ExtendedWebElement logoutLink;

    @ExtendedFindBy(accessibilityId = "test-ABOUT")
    private ExtendedWebElement aboutLink;

    public MenuScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return logoutLink.isElementPresent();
    }

    @Override
    public LoginScreenBase clickLogoutLink() {
        logoutLink.click();
        return initPage(getDriver(), LoginScreenBase.class);
    }

    @Override
    public WebViewScreenBase clickAboutLink() {
        aboutLink.click();
        return initPage(getDriver(), WebViewScreenBase.class);
    }
}
