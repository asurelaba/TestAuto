package com.solvd.carina.mobile.android;

import com.solvd.carina.mobile.base.LoginScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginScreenBase.class)
public class LoginScreen extends LoginScreenBase {

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private ExtendedWebElement userNameField;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private ExtendedWebElement passwordField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private ExtendedWebElement loginButton;

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return loginButton.isElementPresent(5);
    }

    @Override
    public void typeUsername(String username) {
        userNameField.type(username);
    }

    @Override
    public void typePassword(String password) {
        passwordField.type(password);
    }

    @Override
    public ProductScreenBase clickLoginButton() {
        loginButton.click();
        return initPage(getDriver(), ProductScreenBase.class);
    }
}
