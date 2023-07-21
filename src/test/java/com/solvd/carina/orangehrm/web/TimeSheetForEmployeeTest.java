package com.solvd.carina.orangehrm.web;

import com.solvd.carina.orangehrm.components.EmployeeTimeSheetRecord;
import com.solvd.carina.orangehrm.pages.EmployeeTimeSheetsPage;
import com.solvd.carina.orangehrm.pages.LoginPage;
import com.solvd.carina.utils.NavigationUtils;
import com.zebrunner.carina.core.AbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.formula.functions.Na;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TimeSheetForEmployeeTest extends AbstractTest {

    private static final Logger LOGGER = LogManager.getLogger(TimeSheetForEmployeeTest.class);

    private NavigationUtils navigationUtils = new NavigationUtils();

    @Test
    public void testTimesheetForEmployee() {
        EmployeeTimeSheetsPage employeeTimeSheetsPage = navigationUtils.navigateToEmployeeTimeSheetsPage();
        List<EmployeeTimeSheetRecord> records = employeeTimeSheetsPage.getEmployeeTimeSheetRecords();
        LOGGER.info(records);
        Assert.assertTrue(records.get(0).clickViewButton().isPageOpened(),"Timesheet for employee is not opened");
    }
}
