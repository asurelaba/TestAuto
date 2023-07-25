package com.solvd.carina.orangehrm.pages;

import com.solvd.carina.orangehrm.components.EmployeeTimeSheetRecord;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class EmployeeTimeSheetsPage extends AbstractPage {

    @FindBy(xpath = "//h6[text()='Timesheets']")
    private ExtendedWebElement title;

    @FindBy(xpath = "//div[@class='oxd-table-card']")
    private List<EmployeeTimeSheetRecord> employeeTimeSheetRecords;

    @FindBy(xpath = "//div[@class='orangehrm-paper-container']//span")
    private ExtendedWebElement recordsFoundText;

    protected EmployeeTimeSheetsPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(title);
    }

    public int getNumberOfRecordsFoundText() {
        recordsFoundText.isElementPresent();
        String num = StringUtils.substringBetween(recordsFoundText.getText(), "(", ")");
        return Integer.parseInt(num.trim());
    }

        public List<EmployeeTimeSheetRecord> getEmployeeTimeSheetRecords() {
        recordsFoundText.isElementPresent();
        return employeeTimeSheetRecords;
    }
}
