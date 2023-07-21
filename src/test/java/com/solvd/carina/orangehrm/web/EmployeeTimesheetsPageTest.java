package com.solvd.carina.orangehrm.web;

import com.solvd.carina.orangehrm.pages.DashboardPage;
import com.solvd.carina.orangehrm.pages.EmployeeTimeSheetsPage;
import com.solvd.carina.utils.LoginUtils;
import com.zebrunner.carina.core.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTimesheetsPageTest extends AbstractTest {

    LoginUtils loginUtils = new LoginUtils();

    @Test
    public void testEmployeeTimesheetsOnTimesheetsClick() {
        DashboardPage dashboardPage = loginUtils.loginStandardUser();
        EmployeeTimeSheetsPage employeeTimeSheetsPage = dashboardPage.clickTimeSheetsButton();
        Assert.assertTrue(employeeTimeSheetsPage.isPageOpened(),"Employee timesheets page is not opened");
    }
}
