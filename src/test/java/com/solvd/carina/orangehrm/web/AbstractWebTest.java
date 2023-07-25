package com.solvd.carina.orangehrm.web;

import com.solvd.carina.orangehrm.pages.DashboardPage;
import com.solvd.carina.orangehrm.pages.EmployeeTimeSheetsPage;
import com.solvd.carina.utils.LoginUtils;
import com.solvd.carina.utils.NavigationUtils;
import com.zebrunner.carina.core.IAbstractTest;

public class AbstractWebTest implements IAbstractTest {

    public DashboardPage login() {
        return new LoginUtils().loginStandardUser();
    }

    public EmployeeTimeSheetsPage navigateToTimeSheets() {
        return new NavigationUtils().navigateToEmployeeTimeSheetsPage();
    }
}
