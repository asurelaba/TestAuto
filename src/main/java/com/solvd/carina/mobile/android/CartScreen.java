package com.solvd.carina.mobile.android;

import com.solvd.carina.mobile.base.CartScreenBase;
import com.solvd.carina.mobile.base.CheckoutInformationScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.ExtendedFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CartScreenBase.class)
public class CartScreen extends CartScreenBase {

    @FindBy(xpath = "//android.widget.TextView[@text=\"YOUR CART\"]")
    private ExtendedWebElement cartTitle;

    @ExtendedFindBy(accessibilityId = "test-CHECKOUT")
    private ExtendedWebElement checkoutButton;

//    @FindBy(xpath = "")
//    private List<ExtendedWebElement> products;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[@text=\"%s\"]")
    private ExtendedWebElement productTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[@text=\"%s\"]/../..//android.view.ViewGroup[@content-desc=\"test-REMOVE\"]")
    private ExtendedWebElement removeButton;

    public CartScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return cartTitle.isElementPresent();
    }

    @Override
    public void clickRemoveButton(String product) {
        removeButton = removeButton.format(product);
        swipe(removeButton,3);
        removeButton.click();
    }

    @Override
    public CheckoutInformationScreenBase clickCheckoutButton() {
        if(swipe(checkoutButton,5))
        {
            checkoutButton.click();
        }
        return initPage(getDriver(), CheckoutInformationScreenBase.class);
    }

    @Override
    public boolean isProductPresent(String product) {
        productTitle = productTitle.format(product);
        return swipe(productTitle);
    }
}
