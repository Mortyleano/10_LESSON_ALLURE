package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    private static final SelenideElement SEARCH_INPUT = $("qbsearch-input[class='search-input']");
    private static final SelenideElement SET_REQUEST = $("#query-builder-test");
    private static final SelenideElement ISSUE_TAB = $("#issues-tab");

    @Step("Открываем главную страницу Github.com")
    public void openMainPage() {
        open("https://github.com/");
    }

    @Step("Ищем репозиторий с наименованием {repository}")
    public void searchingRepository(String repository) {
        SEARCH_INPUT.click();
        SET_REQUEST.sendKeys(repository);
        SET_REQUEST.submit();
    }

    @Step("Открываем таб Issues")
    public void openIssueTab() {
        ISSUE_TAB.click();
    }

    @Step("Проверяем наличие Issue с номером {issueNumber}")
    public void checkNumberIssue(int issueNumber) {
        $(withText("#" + issueNumber)).should(exist);
    }

    @Step("Кликаем по ссылке с репозиторием {repository}")
    public void clickLinkSearchResult(String repository) {
        $(linkText(repository)).click();
    }
}