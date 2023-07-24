package com.solvd.carina.orangehrm.web;

import com.solvd.carina.orangehrm.components.EmployeeTimeSheetRecord;
import com.solvd.carina.orangehrm.pages.EmployeeTimeSheetsPage;
import com.solvd.carina.orangehrm.pages.LoginPage;
import com.solvd.carina.orangehrm.pages.TimesheetForEmployeePage;
import com.solvd.carina.utils.NavigationUtils;
import com.zebrunner.carina.core.AbstractTest;
import net.sf.saxon.functions.hof.RandomNumberGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.formula.functions.Na;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class TimeSheetForEmployeeTest extends AbstractTest {

    private static final Logger LOGGER = LogManager.getLogger(TimeSheetForEmployeeTest.class);

    private NavigationUtils navigationUtils = new NavigationUtils();

    @Test
    public void testTimesheetForEmployee() {
        EmployeeTimeSheetsPage employeeTimeSheetsPage = navigationUtils.navigateToEmployeeTimeSheetsPage();
        List<EmployeeTimeSheetRecord> records = employeeTimeSheetsPage.getEmployeeTimeSheetRecords();
        EmployeeTimeSheetRecord randomRecord = records.get(new Random().nextInt(0, records.size()-1));
        TimesheetForEmployeePage timesheetForEmployeePage = randomRecord.clickViewButton();
        Assert.assertTrue(timesheetForEmployeePage.isPageOpened(),"Timesheet for employee is not opened");
    }
}
