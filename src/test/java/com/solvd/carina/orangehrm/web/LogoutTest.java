package com.solvd.carina.orangehrm.web;

import com.solvd.carina.orangehrm.components.Header;
import com.solvd.carina.orangehrm.pages.DashboardPage;
import com.solvd.carina.orangehrm.pages.LoginPage;
import com.solvd.carina.utils.LoginUtils;
import com.solvd.carina.utils.NavigationUtils;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends AbstractTest {

    @Test
    public void testLogout() {
        LoginUtils loginUtils = new LoginUtils();
        DashboardPage dashboardPage = loginUtils.loginStandardUser();
        dashboardPage.isPageOpened();
        Header header = dashboardPage.getHeader();
        header.clickUserDropdown();
        LoginPage loginPage = header.clickLogout();
        Assert.assertTrue(loginPage.isPageOpened(),"Login page is not shown on Logout");
    }
}
