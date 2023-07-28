package com.solvd.carina.mobile.android;

import com.solvd.carina.mobile.base.CartScreenBase;
import com.solvd.carina.mobile.base.LoginScreenBase;
import com.solvd.carina.mobile.base.MenuScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.locator.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductScreenBase.class)
public class ProductScreen extends ProductScreenBase {

    @FindBy(xpath = "//android.widget.TextView[@text='PRODUCTS']")
    private ExtendedWebElement productScreenTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement menuIcon;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement cartIcon;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Item']//android.widget.TextView[@text='%s']")
    private ExtendedWebElement productTitle;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Item']//android.widget.TextView[@text='%s']/../android.view.ViewGroup[@content-desc=\"test-REMOVE\"]")
    private ExtendedWebElement removeButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Item']//android.widget.TextView[@text='%s']/../android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]")
    private ExtendedWebElement addtocart;

    public ProductScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOpened() {
        return productScreenTitle.isElementPresent();
    }

    @Override
    public void clickAddToCartButton(String product) {
        addtocart = addtocart.format(product);
        addtocart.click();
    }

    @Override
    public CartScreenBase clickCartIcon() {
        cartIcon.click();
        return initPage(getDriver(), CartScreenBase.class);
    }

    @Override
    public void clickRemoveButton(String product) {
        removeButton = removeButton.format(product);
        swipe(removeButton, 3);
        removeButton.click();
    }

    @Override
    public MenuScreenBase clickMenuIcon() {
        menuIcon.click();
        return initPage(getDriver(), MenuScreenBase.class);
    }

    @Override
    public boolean isRemoveButtonPresent(String product) {
        removeButton = removeButton.format(product);
        return swipe(removeButton);
    }
}
