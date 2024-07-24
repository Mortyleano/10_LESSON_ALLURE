package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    @Step("Подготавливаем настройки перед запуском теста")
    @BeforeEach
    public void settingsTest() {
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Step("Закрываем браузер после завершения теста")
    @AfterEach
    public void settingsAfterTest() {
        closeWebDriver();
    }
}