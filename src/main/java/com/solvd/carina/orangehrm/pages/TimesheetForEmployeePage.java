package com.solvd.carina.orangehrm.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TimesheetForEmployeePage extends AbstractPage {

    @FindBy(xpath = "//div//h6[text()='Timesheet for %s']")
    private ExtendedWebElement timesheetHeaderText;

    @FindBy(xpath = "//div//p[text()='Timesheet Period']")
    private ExtendedWebElement timesheetPeriodText;

    public TimesheetForEmployeePage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(timesheetPeriodText);
    }

    public boolean isTimesheetForEmployeePresent(String employeeName) {
        timesheetHeaderText.format(employeeName);
        return timesheetHeaderText.isElementPresent();
    }
}
