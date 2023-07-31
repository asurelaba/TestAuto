package com.solvd.carina.mobiletest.dataprovider;

import org.testng.annotations.DataProvider;

public interface DataProviderForTest {

    @DataProvider(name = "ProductNames")
    default Object[][] dataProvider() {
        return new Object[][]{{"Sauce Labs Backpack", "Sauce Labs Bike Light"}};
    }
}
