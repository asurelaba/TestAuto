package com.solvd.carina.orangehrm.web;

import com.solvd.carina.utils.LoginUtils;
import com.solvd.carina.utils.NavigationUtils;
import com.zebrunner.carina.core.IAbstractTest;

public class AbstractWebTest implements IAbstractTest {

    protected LoginUtils loginUtils = new LoginUtils();

    protected NavigationUtils navigationUtils = new NavigationUtils();
}
