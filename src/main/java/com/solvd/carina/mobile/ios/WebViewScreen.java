package com.solvd.carina.mobile.ios;

import com.solvd.carina.mobile.base.MenuScreenBase;
import com.solvd.carina.mobile.base.WebViewScreenBase;
import com.solvd.carina.mobile.constants.IosMessage;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WebViewScreenBase.class)
public class WebViewScreen extends WebViewScreenBase {

    public WebViewScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }

    @Override
    public boolean isUrlEqual(String url) {
        throw new UnsupportedOperationException(IosMessage.NOT_IMPLEMENTED.getMessage());
    }
}
