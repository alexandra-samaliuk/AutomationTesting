package by.stormnet.web.pages;

public class OnlinerHomePage extends AbstractPage {
    private static String technologyNews = "//h2//a[@href = 'https://tech.onliner.by']";

    public static OnlinerHomePage getOnlinerHomePage() {
        OnlinerHomePage onlinerHomePage = new OnlinerHomePage();
        waitForElementClickable(getElementBy(technologyNews));
        System.out.println("Onliner Home page is opened");
        return onlinerHomePage;
    }

    public OnlinerHomePage navigateToOnlinerHomePage(){
        openUrl(onlinerUrl);
        return getOnlinerHomePage();
    }

    public void openTechnologyNewsPage(){
        getElement(technologyNews).click();
    }
}
