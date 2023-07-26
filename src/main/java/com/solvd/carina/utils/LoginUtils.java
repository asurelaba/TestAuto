package com.solvd.carina.utils;

import com.solvd.carina.orangehrm.pages.DashboardPage;
import com.solvd.carina.orangehrm.pages.LoginPage;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;

public class LoginUtils implements ICustomTypePageFactory {

    public DashboardPage loginStandardUser() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.typeUsername(R.TESTDATA.get("standard.username"));
        loginPage.typePassword(R.TESTDATA.get("standard.password"));
        return loginPage.clickLoginButton();
    }
}
