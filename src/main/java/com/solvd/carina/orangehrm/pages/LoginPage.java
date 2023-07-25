package com.solvd.carina.orangehrm.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = ".//input[@name='username']")
    private ExtendedWebElement usernameField;

    @FindBy(xpath = ".//input[@type='password']")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = ".//button[@type='submit']")
    private ExtendedWebElement loginButton;

    @FindBy(xpath = ".//p[text()='Invalid credentials']")
    private ExtendedWebElement invalidCredentialsText;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(loginButton);
    }

    public void typeUsername(String username) {
        usernameField.type(username);
    }

    public void typePassword(String password) {
        passwordField.type(password);
    }

    public DashboardPage clickLoginButton() {
        loginButton.click();
        return new DashboardPage(driver);
    }

    public boolean isInvalidCredentialsTextPresent() {
        return invalidCredentialsText.isElementPresent();
    }
}
