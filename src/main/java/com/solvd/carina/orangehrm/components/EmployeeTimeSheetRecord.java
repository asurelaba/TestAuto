package com.solvd.carina.orangehrm.components;

import com.solvd.carina.orangehrm.pages.TimesheetForEmployeePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class EmployeeTimeSheetRecord extends AbstractUIObject {

    @FindBy(xpath = ".//button[text()=' View ']")
    private ExtendedWebElement viewButton;

    protected EmployeeTimeSheetRecord(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public TimesheetForEmployeePage clickViewButton() {
        viewButton.click();
        return new TimesheetForEmployeePage(driver,"Test collings");
    }
}
