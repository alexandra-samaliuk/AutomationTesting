package by.stormnet.web;


import by.stormnet.web.helpers.OnlinerHomeHelper;
import by.stormnet.web.helpers.OnlinerTechNewsHelper;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class OnlinerTest {
    private OnlinerHomeHelper onlinerHomeHelper = new OnlinerHomeHelper();
    private OnlinerTechNewsHelper onlinerTechNewsHelper = new OnlinerTechNewsHelper();

    @Test
    public void onlinerTest(){
        onlinerHomeHelper.openOnlinerHomePageAndOpenNews();
        Assert.assertTrue(onlinerTechNewsHelper.openAnyNewsAndCheck(), "news is not opened!");
    }

    @AfterClass
    public void tearDown(){onlinerHomeHelper.quite();
    }
}
