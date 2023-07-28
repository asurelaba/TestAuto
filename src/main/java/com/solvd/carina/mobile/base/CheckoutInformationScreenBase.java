package com.solvd.carina.mobile.base;

import com.zebrunner.carina.webdriver.gui.mobile.devices.MobileAbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CheckoutInformationScreenBase extends MobileAbstractPage {

    public CheckoutInformationScreenBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeFirstNameField(String firstname);

    public abstract void typeLastNameField(String lastname);

    public abstract void typeZipcodeField(String zipcode);

    public abstract CheckoutOverviewScreenBase clickContinueButton();

}
