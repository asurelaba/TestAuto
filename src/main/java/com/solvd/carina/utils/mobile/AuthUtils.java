package com.solvd.carina.utils.mobile;

import com.solvd.carina.mobile.base.LoginScreenBase;
import com.solvd.carina.mobile.base.ProductScreenBase;
import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;

public class AuthUtils implements ICustomTypePageFactory {

    public ProductScreenBase loginStandardUser() {
        LoginScreenBase loginScreen = initPage(getDriver(), LoginScreenBase.class);
        loginScreen.typeUsername(R.TESTDATA.get("mobile.username"));
        loginScreen.typePassword(R.TESTDATA.get("mobile.password"));
        loginScreen.isOpened();
        return loginScreen.clickLoginButton();
    }

    public ProductScreenBase loginUser(String username, String password) {
        LoginScreenBase loginScreen = initPage(getDriver(), LoginScreenBase.class);
        loginScreen.typeUsername(username);
        loginScreen.typePassword(password);
        return loginScreen.clickLoginButton();
    }
}
