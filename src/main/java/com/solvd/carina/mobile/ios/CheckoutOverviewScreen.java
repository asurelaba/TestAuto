package com.solvd.carina.mobile.ios;

import com.solvd.carina.mobile.base.CheckoutCompleteScreenBase;
import com.solvd.carina.mobile.base.CheckoutOverviewScreenBase;
import com.solvd.carina.mobile.constants.IosMessage;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutOverviewScreenBase.class)
public class CheckoutOverviewScreen extends CheckoutOverviewScreenBase {

    public CheckoutOverviewScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public CheckoutCompleteScreenBase clickFinishButton() {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }

    @Override
    public boolean isOpened() {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }
}
