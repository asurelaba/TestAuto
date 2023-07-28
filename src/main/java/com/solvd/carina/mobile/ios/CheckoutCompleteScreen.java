package com.solvd.carina.mobile.ios;

import com.solvd.carina.mobile.base.CartScreenBase;
import com.solvd.carina.mobile.base.CheckoutCompleteScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.solvd.carina.mobile.constants.IosMessage;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutCompleteScreenBase.class)
public class CheckoutCompleteScreen extends CheckoutCompleteScreenBase {

    public CheckoutCompleteScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public ProductScreenBase clickBackHomeButton() {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }

    @Override
    public boolean isOpened() {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }
}
