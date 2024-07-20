package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.Repository;
import pages.SearchResults;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class CheckSearchIssueNumberWithLambdaTest extends TestBase {

    public static final String REPOSITORY = "selenide/selenide";
    public static final int ISSUE_NUMBER = 2780;

    @Test
    @Tag("repository")
    @Tag("smoke")
    @Feature("Issue в репозитории")
    @Story("Поиск номера issue в репозитории")
    @Owner("Aleksandrov Aleksandr")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Поиск репозитория и номера issue в нем")
    void checkingSearchIssueNumberWithLambdaTest() {
        step("Открываем главную страницу Github.com",
                () -> new MainPage().openMainPage());
        step("Ищем репозиторий с наименованием " + REPOSITORY,
                () -> new MainPage().searchingRepository(REPOSITORY));
        step("Кликаем по ссылке с репозиторием " + REPOSITORY,
                () -> new SearchResults().clickLinkSearchResult(REPOSITORY));
        step("Открываем таб Issues",
                () -> new Repository().openIssueTab());
        step("Проверяем наличие Issue с номером " + ISSUE_NUMBER,
                () -> new Repository().checkNumberIssue(ISSUE_NUMBER));
    }
}