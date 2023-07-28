package com.solvd.carina.utils.mobile;

import com.solvd.carina.mobile.base.CartScreenBase;
import com.solvd.carina.mobile.base.LoginScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import org.testng.Assert;

public class NavigationUtils implements ICustomTypePageFactory {

    private ProductScreenBase login() {
        LoginScreenBase loginScreen = initPage(getDriver(), LoginScreenBase.class);
        loginScreen.typeUsername(R.TESTDATA.get("mobile.username"));
        loginScreen.typePassword(R.TESTDATA.get("mobile.password"));
        loginScreen.isOpened();
        return loginScreen.clickLoginButton();
    }

    public CartScreenBase navigateToCartWithItems() {
        return navigateToProductScreenAfterItemsAddedToCart().clickCartIcon();
    }

    public ProductScreenBase navigateToProductScreenAfterItemsAddedToCart() {
        ProductScreenBase productScreen = login();
        String product = "Sauce Labs Backpack";
        productScreen.clickAddToCartButton(product);
        return productScreen;
    }
}
