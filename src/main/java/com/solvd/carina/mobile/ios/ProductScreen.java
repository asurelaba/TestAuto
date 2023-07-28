package com.solvd.carina.mobile.android;

import com.solvd.carina.mobile.base.ProductScreenBase;
import org.openqa.selenium.WebDriver;

public class ProductScreen extends ProductScreenBase {
    public ProductScreen(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickAddToCart() {

    }

    @Override
    public void clickCart() {

    }

    @Override
    public boolean isOpened() {
        return false;
    }
}
