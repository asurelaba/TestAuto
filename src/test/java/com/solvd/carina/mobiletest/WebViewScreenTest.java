package com.solvd.carina.mobiletest;

import com.solvd.carina.mobile.base.MenuScreenBase;
import com.solvd.carina.mobile.base.WebViewScreenBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebViewScreenTest extends AbstractMobileTest{

    @Test
    public void testUrlOnClickAbout() {
        MenuScreenBase menuScreen = authUtils.loginStandardUser().clickMenuIcon();
        WebViewScreenBase webViewScreen = menuScreen.clickAboutText();
        Assert.assertTrue(webViewScreen.isOpened(),"Webview screen is not opened");
        Assert.assertTrue(webViewScreen.isUrlEqual("saucelabs.com"), "Url does not match");
    }
}
