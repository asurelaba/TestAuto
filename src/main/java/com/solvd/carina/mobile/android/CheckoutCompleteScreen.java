package com.solvd.carina.mobile.android;

import com.solvd.carina.mobile.base.CheckoutCompleteScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CheckoutCompleteScreenBase.class)
public class CheckoutCompleteScreen extends CheckoutCompleteScreenBase {

    @FindBy(xpath = "//android.widget.TextView[@text=\"CHECKOUT: COMPLETE!\"]")
    private ExtendedWebElement completeTitle;

    @ExtendedFindBy(accessibilityId = "test-BACK HOME")
    private ExtendedWebElement backHomeButton;

    public CheckoutCompleteScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return completeTitle.isElementPresent();
    }

    @Override
    public ProductScreenBase clickBackHomeButton() {
        backHomeButton.click();
        return initPage(getDriver(), ProductScreenBase.class);
    }
}
