package by.stormnet.web.pages;

public class OnlinerTechNewsPage extends AbstractPage {
    private String labelNews = "//a[@class = 'news-tiles__stub']";
    private String newsIsOpened = "//div[@class = 'news-header__image']";

    public OnlinerTechNewsPage getOnlinerTechNewsPage() {
        OnlinerTechNewsPage onlinerTechNewsPage = new OnlinerTechNewsPage();
        waitForElementClickable(getElementBy(labelNews));
        System.out.println("Tech news page is opened");
        return onlinerTechNewsPage;
    }

    public void openNewsPage(){
        getElement(labelNews).click();
    }
    public boolean newsIsOpened() {
        waitForElementVisible(getElementBy(newsIsOpened));
        return getElement(newsIsOpened).isDisplayed();
    }

}