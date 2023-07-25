package com.solvd.carina.orangehrm.components;

import com.solvd.carina.orangehrm.pages.LoginPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {

    @FindBy(xpath = ".//li[@class='oxd-userdropdown-tab']")
    private ExtendedWebElement userDropdown;

    @FindBy(xpath = " .//ul[@class='oxd-dropdown-menu']//a[text()='Logout']")
    private ExtendedWebElement logoutLink;

    @FindBy(xpath = ".//p[@class='oxd-userdropdown-name']")
    private ExtendedWebElement userName;

    protected Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public LoginPage clickLogout() {
        logoutLink.isElementPresent();
        logoutLink.click();
        return new LoginPage(driver);
    }

    public void clickUserDropdown() {
        userDropdown.click();
    }
}
