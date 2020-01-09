package by.stormnet.web;

import by.stormnet.automation.core.utils.IOUtils;
import by.stormnet.web.helpers.LamodaHomeHelper;
import by.stormnet.web.helpers.LoginHelper;
import by.stormnet.web.helpers.OnlinerHomeHelper;
import by.stormnet.web.helpers.OnlinerTechNewsHelper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CommonTests {
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
    private OnlinerHomeHelper onlinerHomeHelper = new OnlinerHomeHelper();
    private OnlinerTechNewsHelper onlinerTechNewsHelper = new OnlinerTechNewsHelper();

    @Test
    public void onlinerTest(){
        onlinerHomeHelper.openOnlinerHomePageAndOpenNews();
        Assert.assertTrue(onlinerTechNewsHelper.openAnyNewsAndCheck(), "news is not opened!");
    }

    private LamodaHomeHelper lamodaHomeHelper = new LamodaHomeHelper();
    @Test
    public void paginationTest() {
        lamodaHomeHelper.openLamodaHomeHelper();
        lamodaHomeHelper.searchAndCheckResult("nike");
        boolean page = lamodaHomeHelper.openPageAndCheck("2");
        boolean pageNext = lamodaHomeHelper.openNextPageAndCheck();
        boolean pageBack = lamodaHomeHelper.openPrevPageAndCheck();

        Assert.assertTrue(page && pageBack && pageNext);
    }

    @AfterClass
    public void tearDown(){
        loginHelper.quite();
        lamodaHomeHelper.quite();
        onlinerHomeHelper.quite();
    }
}
