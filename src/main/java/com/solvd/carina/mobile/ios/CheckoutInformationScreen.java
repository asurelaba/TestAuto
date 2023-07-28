package com.solvd.carina.mobile.ios;

import com.solvd.carina.mobile.base.CartScreenBase;
import com.solvd.carina.mobile.base.CheckoutInformationScreenBase;
import com.solvd.carina.mobile.base.CheckoutOverviewScreenBase;
import com.solvd.carina.mobile.constants.IosMessage;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CheckoutInformationScreenBase.class)
public class CheckoutInformationScreen extends CheckoutInformationScreenBase {

    public CheckoutInformationScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeFirstNameField(String firstname) {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }

    @Override
    public void typeLastNameField(String lastname) {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }

    @Override
    public void typeZipcodeField(String zipcode) {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }

    @Override
    public CheckoutOverviewScreenBase clickContinueButton() {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }

    @Override
    public boolean isOpened() {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }
}
