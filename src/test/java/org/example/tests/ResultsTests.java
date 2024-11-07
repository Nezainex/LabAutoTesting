package org.example.tests;

import org.example.steps.ResultsSteps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.example.utils.RetryTestExtension;
import io.qameta.allure.Allure;

import static com.codeborne.selenide.Selenide.open;

@ExtendWith(RetryTestExtension.class)
public class ResultsTests extends BaseTest {

    ResultsSteps resultsSteps = new ResultsSteps();

    @BeforeEach
    public void setUp() {
        Allure.step("Открываем страницу с результатами", () -> open("https://www.invitro.ru/moscow/radiology/"));
    }

    @Test
    public void testResultsPageHeader() {
        Allure.step("Проверка заголовка страницы с результатами", () -> {
            resultsSteps.navigateToResultsPage("Results");
            resultsSteps.verifyResultsPageHeader("Введите индивидуальный номер заказа, чтобы посмотреть результаты анализов");
        });
    }

    @Test
    public void testEmptyFieldsValidation() {
        Allure.step("Проверка валидации для пустых полей", () -> {
            resultsSteps.navigateToResultsPage("Results");
            Allure.step("Нажимаем на кнопку 'Найти результаты'", () -> resultsSteps.clickButton("Find Results"));
            Allure.step("Проверяем выделение поля 'Код ИНЗ'", () -> resultsSteps.verifyFieldHighlighted("Код ИНЗ"));
            Allure.step("Проверяем выделение поля 'Дата рождения'", () -> resultsSteps.verifyFieldHighlighted("Дата рождения"));
            Allure.step("Проверяем выделение поля 'Фамилия'", () -> resultsSteps.verifyFieldHighlighted("Фамилия"));
            Allure.step("Проверяем сообщение об ошибке", () -> resultsSteps.verifyErrorMessage("Поля Код ИНЗДата рожденияФамилия обязательны для заполнения"));
        });
    }

    @Test
    public void testFilledFieldsValidation() {
        Allure.step("Проверка заполненных полей", () -> {
            resultsSteps.navigateToResultsPage("Results");
            Allure.step("Вводим данные заказа: код, дату рождения и фамилию", () -> resultsSteps.enterOrderDetails("231231231", "11.12.2000", "тест"));
            Allure.step("Нажимаем на кнопку 'Найти результаты'", () -> resultsSteps.clickButton("Find Results"));
            Allure.step("Проверяем, что поля заполнены корректно", () -> resultsSteps.verifyFieldsAreFilled());
        });
    }
}
