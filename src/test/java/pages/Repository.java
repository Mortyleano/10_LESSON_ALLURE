package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class Repository {

    private static final SelenideElement ISSUE_TAB = $("#issues-tab");

    public void openIssueTab() {
        ISSUE_TAB.click();
    }

    public void checkNumberIssue(int issueNumber) {
        $(withText("#" + issueNumber)).should(exist);
    }
}