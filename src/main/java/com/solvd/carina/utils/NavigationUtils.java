package com.solvd.carina.utils;

import com.solvd.carina.orangehrm.pages.DashboardPage;
import com.solvd.carina.orangehrm.pages.EmployeeTimeSheetsPage;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;

public class NavigationUtils implements ICustomTypePageFactory {

    public EmployeeTimeSheetsPage navigateToEmployeeTimeSheetsPage() {
        LoginUtils loginUtils = new LoginUtils();
        return loginUtils.loginStandardUser().clickTimeSheetsButton();
    }
}
