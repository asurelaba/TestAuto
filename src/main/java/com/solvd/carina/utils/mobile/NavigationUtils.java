package com.solvd.carina.utils.mobile;

import com.solvd.carina.mobile.base.CartScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;

import java.util.List;

public class NavigationUtils implements ICustomTypePageFactory {

    public CartScreenBase navigateToCartWithItems(ProductScreenBase productScreen, List<String> products) {
        navigateToProductScreenAfterItemsAddedToCart(productScreen, products);
        return productScreen.clickCartIcon();
    }

    public ProductScreenBase navigateToProductScreenAfterItemsAddedToCart(ProductScreenBase productScreen, List<String> products) {
        products.forEach(product -> productScreen.clickAddToCartButton(product));
        return productScreen;
    }
}
