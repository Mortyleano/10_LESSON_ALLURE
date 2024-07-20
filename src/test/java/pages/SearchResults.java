package pages;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

public class SearchResults {

    public void clickLinkSearchResult(String repository) {
        $(linkText(repository)).click();
    }
}