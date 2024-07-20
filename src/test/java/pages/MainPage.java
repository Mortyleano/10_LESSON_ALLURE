package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private static final SelenideElement SEARCH_INPUT = $("qbsearch-input[class='search-input']");
    private static final SelenideElement SET_REQUEST = $("#query-builder-test");

    public void openMainPage() {
        open("https://github.com/");
    }

    public void searchingRepository(String repository) {
        SEARCH_INPUT.click();
        SET_REQUEST.sendKeys(repository);
        SET_REQUEST.submit();
    }
}