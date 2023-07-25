package com.solvd.carina.orangehrm.web;

import com.solvd.carina.orangehrm.pages.DashboardPage;
import com.solvd.carina.orangehrm.pages.LoginPage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends AbstractWebTest {

    @Test
    @MethodOwner(owner = "asure")
    public void testLogin() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.typeUsername(R.TESTDATA.get("standard.username"));
        loginPage.typePassword(R.TESTDATA.get("standard.password"));
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        Assert.assertTrue(dashboardPage.isPageOpened(), "Dashboard page is not opened");
    }

    @Test
    @MethodOwner(owner = "asure")
    public void testInvalidCredentials() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not opened");
        loginPage.typeUsername(R.TESTDATA.get("standard.username"));
        loginPage.typePassword(RandomStringUtils.randomAlphabetic(8));
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isInvalidCredentialsTextPresent(), "Invalid credentials text not present");
    }
}
