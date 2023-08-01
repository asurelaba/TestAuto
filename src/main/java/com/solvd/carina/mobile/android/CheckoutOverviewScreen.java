package com.solvd.carina.mobile.android;

import com.solvd.carina.mobile.base.CheckoutCompleteScreenBase;
import com.solvd.carina.mobile.base.CheckoutOverviewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CheckoutOverviewScreenBase.class)
public class CheckoutOverviewScreen extends CheckoutOverviewScreenBase {

    @FindBy(xpath = "//android.widget.TextView[@text=\"CHECKOUT: OVERVIEW\"]")
    private ExtendedWebElement overviewTitle;

    @ExtendedFindBy(accessibilityId = "test-FINISH")
    private ExtendedWebElement finishButton;

    public CheckoutOverviewScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return overviewTitle.isElementPresent();
    }

    @Override
    public CheckoutCompleteScreenBase clickFinishButton() {
        swipe(finishButton, 5);
        finishButton.click();
        return initPage(getDriver(), CheckoutCompleteScreenBase.class);
    }
}
