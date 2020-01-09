package by.stormnet.web;

import by.stormnet.automation.core.utils.IOUtils;
import by.stormnet.web.helpers.LoginHelper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private LoginHelper loginHelper = new LoginHelper();
    private String username;
    private String password;

    @BeforeClass
    public void setUp(){
        username = IOUtils.loadGenericProperties("username", "configuration");
        password = IOUtils.loadGenericProperties("password", "configuration");
        loginHelper.openLoginPage();
    }

    @Test
    public void loginTest(){
        loginHelper.login(username,password);
        Assert.assertTrue(loginHelper.checkPageWithEmailsOpened(), "User is not logged in successfully!");
    }

    @AfterClass
    public void tearDown(){
        loginHelper.quite();
    }
}
