package com.solvd.carina.orangehrm.web;

import com.solvd.carina.orangehrm.components.EmployeeTimeSheetRecord;
import com.solvd.carina.orangehrm.pages.DashboardPage;
import com.solvd.carina.orangehrm.pages.EmployeeTimeSheetsPage;
import com.solvd.carina.orangehrm.pages.LoginPage;
import com.solvd.carina.utils.LoginUtils;
import com.zebrunner.carina.core.AbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class EmployeeTimesheetsPageTest extends AbstractTest {

    private static final Logger LOGGER = LogManager.getLogger(EmployeeTimesheetsPageTest.class);

    LoginUtils loginUtils = new LoginUtils();

    @Test
    public void testEmployeeTimesheetsOnTimesheetsClick() {
        DashboardPage dashboardPage = loginUtils.loginStandardUser();
        EmployeeTimeSheetsPage employeeTimeSheetsPage = dashboardPage.clickTimeSheetsButton();
        Assert.assertTrue(employeeTimeSheetsPage.isPageOpened(), "Employee timesheets page is not opened");
        LOGGER.info("no. of records"  );
        List<EmployeeTimeSheetRecord> recordList = employeeTimeSheetsPage.getEmployeeTimeSheetRecords();
        recordList.forEach((record) -> LOGGER.info(record.getEmployeeName()));
    }
}
