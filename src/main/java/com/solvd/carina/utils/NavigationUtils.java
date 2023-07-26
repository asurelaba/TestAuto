package com.solvd.carina.utils;

import com.solvd.carina.orangehrm.pages.DashboardPage;
import com.solvd.carina.orangehrm.pages.EmployeeTimeSheetsPage;
import com.solvd.carina.orangehrm.pages.LoginPage;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;

public class NavigationUtils implements ICustomTypePageFactory {

    public EmployeeTimeSheetsPage navigateToEmployeeTimeSheetsPage() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();
        loginPage.typeUsername(R.TESTDATA.get("standard.username"));
        loginPage.typePassword(R.TESTDATA.get("standard.password"));
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        return dashboardPage.clickTimeSheetsButton();
    }
}
