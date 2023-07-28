package com.solvd.carina.mobile.android;

import com.solvd.carina.mobile.base.WebViewScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebViewScreenBase.class)
public class WebViewScreen extends WebViewScreenBase {

    @FindBy(id = "com.android.chrome:id/url_bar")
    private ExtendedWebElement urlBar;

    public WebViewScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return urlBar.isElementPresent();
    }

    public boolean isUrlEqual(String url) {
        return url.equals(urlBar.getText());
    }
}
