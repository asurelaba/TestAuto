package com.solvd.carina.mobiletest;

import com.solvd.carina.mobile.base.*;
import com.solvd.carina.mobiletest.dataprovider.DataProviderForTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

public class CheckoutTest extends AbstractMobileTest implements DataProviderForTest {

    @Test(dataProvider = "ProductNames")
    public void testCheckoutProcess(String... productNames) {
        CartScreenBase cartScreen = navigationUtils.navigateToCartWithItems(authUtils.loginStandardUser(), Arrays.asList(productNames));
        CheckoutInformationScreenBase checkoutScreen = cartScreen.clickCheckoutButton();
        Assert.assertTrue(checkoutScreen.isOpened(), "Checkout Screen is not opened");
        checkoutScreen.typeFirstNameField(R.TESTDATA.get("mobile.firstname"));
        checkoutScreen.typeLastNameField(R.TESTDATA.get("mobile.lastname"));
        checkoutScreen.typeZipcodeField(R.TESTDATA.get("mobile.zipcode"));
        CheckoutOverviewScreenBase checkoutOverviewScreen = checkoutScreen.clickContinueButton();
        Assert.assertTrue(checkoutOverviewScreen.isOpened(), "Checkout Overview Screen is not opened");
        CheckoutCompleteScreenBase checkoutCompleteScreen = checkoutOverviewScreen.clickFinishButton();
        Assert.assertTrue(checkoutCompleteScreen.isOpened(), "Checkout Complete Screen is not opened");
        ProductScreenBase productScreen = checkoutCompleteScreen.clickBackHomeButton();
        Assert.assertTrue(productScreen.isOpened(), "Product screen is not opened");
    }
}
