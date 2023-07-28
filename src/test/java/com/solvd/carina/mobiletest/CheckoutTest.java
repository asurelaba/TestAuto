package com.solvd.carina.mobiletest;

import com.solvd.carina.mobile.base.CheckoutCompleteScreenBase;
import com.solvd.carina.mobile.base.CheckoutOverviewScreenBase;
import com.solvd.carina.mobile.base.CheckoutInformationScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends AbstractMobileTest {

    @Test
    public void testCheckoutProcess() {
        CheckoutInformationScreenBase checkoutScreen = navigationUtils.navigateToCartWithItems().clickCheckoutButton();
        Assert.assertTrue(checkoutScreen.isOpened(), "Checkout Screen is not opened");
        checkoutScreen.typeFirstNameField("jane");
        checkoutScreen.typeLastNameField("doe");
        checkoutScreen.typeZipcodeField("12345");
        CheckoutOverviewScreenBase checkoutOverviewScreen = checkoutScreen.clickContinueButton();
        Assert.assertTrue(checkoutOverviewScreen.isOpened(), "Checkout Overview Screen is not opened");
        CheckoutCompleteScreenBase checkoutCompleteScreen = checkoutOverviewScreen.clickFinishButton();
        Assert.assertTrue(checkoutCompleteScreen.isOpened(), "Checkout Complete Screen is not opened");
        ProductScreenBase productScreen = checkoutCompleteScreen.clickBackHomeButton();
        Assert.assertTrue(productScreen.isOpened(), "Product screen is not opened");
    }
}
