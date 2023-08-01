package com.solvd.carina.mobiletest;

import com.solvd.carina.mobile.base.CartScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.solvd.carina.mobiletest.dataprovider.DataProviderForTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CartTest extends AbstractMobileTest implements DataProviderForTest {

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

    @Test(dataProvider = "ProductNames")
    public void testRemoveFromCartFromProductScreen(String... productNames) {
        ProductScreenBase productScreen = navigationUtils.navigateToProductScreenAfterItemsAddedToCart(Arrays.asList(productNames));
        String product = R.TESTDATA.get("mobile.product");
        productScreen.clickRemoveButton(product);
        CartScreenBase cartScreen = productScreen.clickCartIcon();
        Assert.assertFalse(cartScreen.isProductPresent(product), "Failed to remove item in cart on Remove button from Product Screen");
    }

    @Test(dataProvider = "ProductNames")
    public void testRemoveFromCartFromCartScreen(String... productNames) {
        CartScreenBase cartScreen = navigationUtils.navigateToCartWithItems(Arrays.asList(productNames));
        String product = R.TESTDATA.get("mobile.product");
        cartScreen.clickRemoveButton(product);
        Assert.assertFalse(cartScreen.isProductPresent(product), "Failed to remove item in cart on Remove button in Cart Screen");
    }
}
