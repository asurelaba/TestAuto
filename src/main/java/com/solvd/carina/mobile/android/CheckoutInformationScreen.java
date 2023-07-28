package com.solvd.carina.mobile.android;

import com.solvd.carina.mobile.base.CheckoutInformationScreenBase;
import com.solvd.carina.mobile.base.CheckoutOverviewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CheckoutInformationScreenBase.class)
public class CheckoutInformationScreen extends CheckoutInformationScreenBase {

    @FindBy(xpath = "//android.widget.TextView[@text=\"CHECKOUT: INFORMATION\"]")
    private ExtendedWebElement informationTitle;

    @ExtendedFindBy(accessibilityId = "test-First Name")
    private ExtendedWebElement firstNameField;

    @ExtendedFindBy(accessibilityId = "test-Last Name")
    private ExtendedWebElement lastNameField;

    @ExtendedFindBy(accessibilityId = "test-Zip/Postal Code")
    private ExtendedWebElement zipcodeField;

    @ExtendedFindBy(accessibilityId = "test-CONTINUE")
    private ExtendedWebElement continueButton;

    public CheckoutInformationScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return informationTitle.isElementPresent();
    }

    @Override
    public void typeFirstNameField(String firstname) {
        firstNameField.type(firstname);
    }

    @Override
    public void typeLastNameField(String lastname) {
        lastNameField.type(lastname);
    }

    @Override
    public void typeZipcodeField(String zipcode) {
        zipcodeField.type(zipcode);
    }

    @Override
    public CheckoutOverviewScreenBase clickContinueButton() {
        continueButton.click();
        return initPage(getDriver(), CheckoutOverviewScreenBase.class);
    }
}
