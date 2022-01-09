package ru_citilink.tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static io.qameta.allure.Allure.step;

@Owner("Евгения Щенникова")
public class CitilinkTests extends TestBase {

    @Test
    @DisplayName("Проверка текста заголовка на главной странице")
    @Severity(SeverityLevel.CRITICAL)
    void titleTextTest() {

        step("Заголовок страницы имеет текст " +
                "'Бытовая техника и электроника в интернет-магазине Ситилинк - Москва'", () -> {
            String expectedTitle = "Бытовая техника и электроника в интернет-магазине Ситилинк - Москва";
            String actualTitle = title();
            Assertions.assertEquals(expectedTitle, actualTitle);
        });

    }

    @Disabled
    @Test
    @DisplayName("Проверка логотипа")
    @Severity(SeverityLevel.CRITICAL)
    void checkLogoTest() {

        step("Проверить наличие логотипа на главной странице", () ->
                $(".Logo__link").shouldBe(visible));

        step("Проверить цвет и размеры логотипа на главной странице", () -> {
            $(".Logo__svg").shouldHave(attributeMatching("fill", "#ff5200"));
            $(".Logo__svg").shouldHave(attributeMatching("width", "195"));
            $(".Logo__svg").shouldHave(attributeMatching("height", "40"));
        });

    }

    @Test
    @DisplayName("Проверка функции поиска на сайте")
    @Severity(SeverityLevel.BLOCKER)
    void searchTest() {

        step("Ввести в поле для поиска запрос", () ->
                $(".MainHeader__search").$("[type='search']").setValue("Galaxy A02").pressEnter());

        step("Проверка результатов поиска", () -> {

            $$(".ProductCardVertical_separated").shouldHave(sizeGreaterThan(0));
            $("[data-product-id='1474963']").shouldHave(text("Galaxy A02"));

        });
    }

    @Test
    @DisplayName("Открыть раздел 'Смартфоны и гаджеты'")
    @Severity(SeverityLevel.CRITICAL)
    void goToSectionTest() {

        step("Выбрать в Каталоге товаров раздел 'Смартфоны и гаджеты'", () -> {
            $("[data-label='Каталог товаров']").click();
            $("[data-category-id='207']").click();
        });

        step("Проверка перехода в раздел 'Смартфоны и гаджеты'", () ->
                $(".Category__title-container").shouldHave(text("Смартфоны и гаджеты")));

    }

    @Test
    @DisplayName("Проверка наличия адреса магазина")
    @Severity(SeverityLevel.NORMAL)
    void checkAddressMarketTest() {

        step("Открыть раздел 'Магазины'", () -> {
            $x("//*[contains(text(),'Магазины')]").click();
            $(byText("Все магазины России")).click();
        });

        step("Проверить, что в списке есть Магазин ТЦ 'Азовский'", () -> {
            $("#map-search").setValue("Азовский").pressEnter();
            $(".StoreGroupItem__wrapper-title")
                    .shouldHave(text("Магазин ТЦ \"Азовский\" (метро Севастопольская)"));
        });
    }

    @Test
    @DisplayName("При клике на логотип происходит переход на главную страницу сайта")
    @Severity(SeverityLevel.CRITICAL)
    void returnToMainPageTest() {

        step("Перейти в раздел Форум", () -> {
            $(".FooterMenu__menu").scrollTo();
            $x("//footer//a[@rel='nofollow'][contains(text(),'Форум')]").click();
        });

        step("Вернуться на главную страницу при клике на логотип", () ->
                $(".Logo__link").click());

        step("Проверить, что открылась главная страница", () ->
                webdriver().shouldHave(url("https://www.citilink.ru")));

    }

    @Test
    @DisplayName("Проверка открытия формы обратной связи")
    @Severity(SeverityLevel.CRITICAL)
    void questionFormTest() {

        step("Нажать на кнопку 'Обратная связь'", () ->
                $(byText("Обратная связь")).click());
        step("Проверка открытия модального окна 'Обратная связь'", () ->
                $(".MainMenu__feedback-popup__html")
                        .$(".FeedbackInPopupView__header").shouldHave(text("Обратная связь")));

    }
}
