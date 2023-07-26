package com.solvd.carina.orangehrm.web;

import com.solvd.carina.orangehrm.components.EmployeeTimeSheetRecord;
import com.solvd.carina.orangehrm.pages.EmployeeTimeSheetsPage;
import com.solvd.carina.orangehrm.pages.TimesheetForEmployeePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class TimeSheetForEmployeeTest extends AbstractWebTest {

    private static final Logger LOGGER = LogManager.getLogger(TimeSheetForEmployeeTest.class);

    @Test
    public void testTimesheetForEmployee() {
        EmployeeTimeSheetsPage employeeTimeSheetsPage = navigationUtils.navigateToEmployeeTimeSheetsPage();
        Assert.assertTrue(employeeTimeSheetsPage.isPageOpened(), "TimesheetsPage is not opened");
        List<EmployeeTimeSheetRecord> records = employeeTimeSheetsPage.getEmployeeTimeSheetRecords();
        EmployeeTimeSheetRecord randomRecord = records.get(0);
        String employeeName = randomRecord.getEmployeeName();
        TimesheetForEmployeePage timesheetForEmployeePage = randomRecord.clickViewButton();
        Assert.assertTrue(timesheetForEmployeePage.isPageOpened(), "Timesheet for employee is not opened");
        Assert.assertTrue(timesheetForEmployeePage.isTimesheetForEmployeePresent(employeeName), "Employee name does not match with the chosen record");
    }
}
