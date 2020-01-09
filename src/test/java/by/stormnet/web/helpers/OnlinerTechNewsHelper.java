package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerTechNewsPage;

public class OnlinerTechNewsHelper extends AbsractHelper {
    OnlinerTechNewsPage onlinerTechNewsPage = new OnlinerTechNewsPage();

    public boolean openAnyNewsAndCheck(){
        System.out.println("Navigate to any news ...");
        onlinerTechNewsPage.getOnlinerTechNewsPage().openNewsPage();
        return onlinerTechNewsPage.newsIsOpened();
    }
}