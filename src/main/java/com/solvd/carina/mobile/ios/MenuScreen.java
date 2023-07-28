package com.solvd.carina.mobile.ios;

import com.solvd.carina.mobile.base.CheckoutOverviewScreenBase;
import com.solvd.carina.mobile.base.LoginScreenBase;
import com.solvd.carina.mobile.base.MenuScreenBase;
import com.solvd.carina.mobile.base.WebViewScreenBase;
import com.solvd.carina.mobile.constants.IosMessage;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MenuScreenBase.class)
public class MenuScreen extends MenuScreenBase {

    public MenuScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }

    @Override
    public LoginScreenBase clickLogoutText() {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }

    @Override
    public WebViewScreenBase clickAboutText() {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }
}
