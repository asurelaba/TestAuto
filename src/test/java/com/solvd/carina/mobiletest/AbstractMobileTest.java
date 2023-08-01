package com.solvd.carina.mobiletest;

import com.solvd.carina.utils.mobile.AuthUtils;
import com.solvd.carina.utils.mobile.NavigationUtils;
import com.zebrunner.carina.core.AbstractTest;

public class AbstractMobileTest extends AbstractTest {

    protected AuthUtils authUtils = new AuthUtils();

    protected NavigationUtils navigationUtils = new NavigationUtils();
}
