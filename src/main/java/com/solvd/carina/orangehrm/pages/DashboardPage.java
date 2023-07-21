package com.solvd.carina.orangehrm.pages;

import com.solvd.carina.orangehrm.components.Header;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private ExtendedWebElement title;

    @FindBy(xpath = "//button[@title='Timesheets']")
    private ExtendedWebElement timeSheetsButton;

    protected DashboardPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(title);
    }

    public EmployeeTimeSheetsPage clickTimeSheetsButton() {
        timeSheetsButton.click();
        pause(3);
        return new EmployeeTimeSheetsPage(driver);
    }
}
