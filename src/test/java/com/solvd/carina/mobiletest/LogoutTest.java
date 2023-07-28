package com.solvd.carina.mobiletest;

import com.solvd.carina.mobile.base.LoginScreenBase;
import com.solvd.carina.mobile.base.MenuScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends AbstractMobileTest {

    @Test
    public void testLogout() {
        ProductScreenBase productScreen = authUtils.loginStandardUser();
        MenuScreenBase menuScreen = productScreen.clickMenuIcon();
        Assert.assertTrue(menuScreen.isOpened(), "Menu screen not opened");
        LoginScreenBase loginScreen = menuScreen.clickLogoutText();
        Assert.assertTrue(loginScreen.isOpened(), "login screen not opened");
    }
}
