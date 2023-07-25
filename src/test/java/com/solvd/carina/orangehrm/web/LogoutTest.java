package com.solvd.carina.orangehrm.web;

import com.solvd.carina.orangehrm.components.Header;
import com.solvd.carina.orangehrm.pages.DashboardPage;
import com.solvd.carina.orangehrm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends AbstractWebTest {

    @Test
    public void testLogout() {
        DashboardPage dashboardPage = login();
        dashboardPage.isPageOpened();
        Header header = dashboardPage.getHeader();
        header.clickUserDropdown();
        LoginPage loginPage = header.clickLogout();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page is not shown on Logout");
    }
}
