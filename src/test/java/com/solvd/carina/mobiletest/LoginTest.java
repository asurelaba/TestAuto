package com.solvd.carina.mobiletest;

import com.solvd.carina.mobile.base.LoginScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends AbstractMobileTest {

    @Test
    public void testLoginWithValidCredentials() {
        String username = "standard_user";
        String password = "secret_sauce";
        LoginScreenBase loginScreen = initPage(getDriver(), LoginScreenBase.class);
        Assert.assertTrue(loginScreen.isOpened(),"login screen is not opened");
        loginScreen.typeUsername(username);
        loginScreen.typePassword(password);
        ProductScreenBase productScreen = loginScreen.clickLoginButton();
        Assert.assertTrue(productScreen.isOpened(),"Product screen is opened");
    }
}
