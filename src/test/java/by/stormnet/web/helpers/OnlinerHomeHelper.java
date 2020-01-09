package by.stormnet.web.helpers;

import by.stormnet.web.pages.OnlinerHomePage;

public class OnlinerHomeHelper extends AbsractHelper {
    OnlinerHomePage onlinerHomePage = new OnlinerHomePage();

    public void openOnlinerHomePageAndOpenNews(){
        System.out.println("Navigate to onliner home page ...");
        onlinerHomePage.navigateToOnlinerHomePage();
        onlinerHomePage.openTechnologyNewsPage();
        return;
    }
}
