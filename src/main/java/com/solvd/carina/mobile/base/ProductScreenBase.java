package com.solvd.carina.mobile.base;

import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProductScreenBase extends MobileAbstractPage {

    public ProductScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickAddToCartButton(String product);

    public abstract CartScreenBase clickCartIcon();

    public abstract void clickRemoveButton(String product);

    public abstract MenuScreenBase clickMenuIcon();

    public abstract boolean isRemoveButtonPresent(String product);
}
