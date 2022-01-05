package ru_citilink.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru_citilink.attach.Attach;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {

    @BeforeAll
    static void setup() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        WebDriverProvider.webConfiguration();

    }

    @BeforeEach
    void openMainPage() {

        step("Открыть главную страницу сайта www.citilink.ru", () ->
                open("https://www.citilink.ru"));
    }

    @AfterEach
    public void tearDown() {

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }

}
