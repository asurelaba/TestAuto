package com.solvd.carina.orangehrm.pages;

import com.solvd.carina.orangehrm.components.EmployeeTimeSheetRecord;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EmployeeTimeSheetsPage extends AbstractPage {

    @FindBy(xpath = "//h6[text()='Timesheets']")
    private ExtendedWebElement title;

    @FindBy(xpath = "//div[@class='oxd-table-card']")
    private List<EmployeeTimeSheetRecord> employeeTimeSheetRecords;

    @FindBy(xpath = "//span[contains(text(),'Records Found')]")
    private ExtendedWebElement recordsFoundText;

    protected EmployeeTimeSheetsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(title);
    }

    public int getNumberOfRecordsFound() {
        return employeeTimeSheetRecords.size();
    }

    public List<EmployeeTimeSheetRecord> getEmployeeTimeSheetRecords() {
        return employeeTimeSheetRecords;
    }
}
