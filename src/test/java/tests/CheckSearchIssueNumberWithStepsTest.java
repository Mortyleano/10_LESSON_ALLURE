package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.WebSteps;

public class CheckSearchIssueNumberWithStepsTest extends TestBase {

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
    void checkingSearchIssueNumberWithStepsTest() {
        WebSteps webSteps = new WebSteps();
        webSteps.openMainPage();
        webSteps.searchingRepository(REPOSITORY);
        webSteps.clickLinkSearchResult(REPOSITORY);
        webSteps.openIssueTab();
        webSteps.checkNumberIssue(ISSUE_NUMBER);
    }
}