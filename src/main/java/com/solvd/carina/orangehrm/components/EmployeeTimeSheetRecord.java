package com.solvd.carina.orangehrm.components;

import com.solvd.carina.orangehrm.pages.TimesheetForEmployeePage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class EmployeeTimeSheetRecord extends AbstractUIObject {

    @FindBy(xpath = "./div[@role='row']/*[1]/div[text()]")
    private ExtendedWebElement employeeName;

    @FindBy(xpath = ".//button")
    private ExtendedWebElement viewButton;

    public EmployeeTimeSheetRecord(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public TimesheetForEmployeePage clickViewButton() {
        viewButton.isElementPresent();
        viewButton.click();
        return new TimesheetForEmployeePage(driver,"Test collings");
    }

    public String getEmployeeName() {
        return employeeName.getText();
    }
}
