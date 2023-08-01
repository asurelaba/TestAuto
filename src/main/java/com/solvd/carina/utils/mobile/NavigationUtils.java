package com.solvd.carina.utils.mobile;

import com.solvd.carina.mobile.base.CartScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;

import java.util.List;

public class NavigationUtils implements ICustomTypePageFactory {

    public CartScreenBase navigateToCartWithItems(List<String> products) {
        return navigateToProductScreenAfterItemsAddedToCart(products)
                .clickCartIcon();
    }

    public ProductScreenBase navigateToProductScreenAfterItemsAddedToCart(List<String> products) {
        ProductScreenBase productScreen = new AuthUtils().loginStandardUser();
        products.forEach(product -> productScreen.clickAddToCartButton(product));
        return productScreen;
    }
}
