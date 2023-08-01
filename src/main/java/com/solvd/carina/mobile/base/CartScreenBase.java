package com.solvd.carina.mobile.base;

import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CartScreenBase extends MobileAbstractPage {

    public CartScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickRemoveButton(String product);

    public abstract CheckoutInformationScreenBase clickCheckoutButton();

    public abstract boolean isProductPresent(String product);
}
