package com.solvd.carina.mobiletest;

import com.solvd.carina.mobile.base.CartScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends AbstractMobileTest {

    @Test
    public void testAddToCart() {
        ProductScreenBase productScreen = authUtils.loginStandardUser();
        String product = R.TESTDATA.get("mobile.product");
        productScreen.clickAddToCartButton(product);
        Assert.assertTrue(productScreen.isRemoveButtonPresent(product), "Remove button is not shown after Add to cart is clicked");
        CartScreenBase cartScreen = productScreen.clickCartIcon();
        Assert.assertTrue(cartScreen.isOpened(), "cart screen is not opened");
        Assert.assertTrue(cartScreen.isProductPresent(product), product + " is not added to the cart");
    }

    @Test
    public void testRemoveFromCartFromProductScreen() {
        ProductScreenBase productScreen = navigationUtils.navigateToProductScreenAfterItemsAddedToCart();
        String product = R.TESTDATA.get("mobile.product");
        productScreen.clickRemoveButton(product);
        CartScreenBase cartScreen = productScreen.clickCartIcon();
        Assert.assertFalse(cartScreen.isProductPresent(product), "Failed to remove item in cart on Remove button from Product Screen");
    }

    @Test
    public void testRemoveFromCartFromCartScreen() {
        CartScreenBase cartScreen = navigationUtils.navigateToCartWithItems();
        String product = R.TESTDATA.get("mobile.product");
        cartScreen.clickRemoveButton(product);
        Assert.assertFalse(cartScreen.isProductPresent(product), "Failed to remove item in cart on Remove button in Cart Screen");
    }
}
