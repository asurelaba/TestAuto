package com.solvd.carina.orangehrm.web;

import com.solvd.carina.orangehrm.components.EmployeeTimeSheetRecord;
import com.solvd.carina.orangehrm.pages.DashboardPage;
import com.solvd.carina.orangehrm.pages.EmployeeTimeSheetsPage;
import com.solvd.carina.utils.LoginUtils;
import com.zebrunner.carina.core.AbstractTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.util.List;

public class EmployeeTimesheetsPageTest extends AbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    LoginUtils loginUtils = new LoginUtils();

    @Test
    public void testEmployeeTimesheetsOnTimesheetsClick() {
        DashboardPage dashboardPage = loginUtils.loginStandardUser();
        EmployeeTimeSheetsPage employeeTimeSheetsPage = dashboardPage.clickTimeSheetsButton();
        Assert.assertTrue(employeeTimeSheetsPage.isPageOpened(), "Employee timesheets page is not opened");
        List<EmployeeTimeSheetRecord> recordList = employeeTimeSheetsPage.getEmployeeTimeSheetRecords();
        Assert.assertEquals(employeeTimeSheetsPage.getNumberOfRecordsFoundText(),recordList.size(),"Number of records does not match the records in the table");
    }
}
