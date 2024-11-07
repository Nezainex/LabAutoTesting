package org.example.tests;

import org.example.steps.ResultsSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import io.qameta.allure.Allure;

import static com.codeborne.selenide.Selenide.open;

public class ResultsTests extends BaseTest {

    ResultsSteps resultsSteps = new ResultsSteps();

    @BeforeEach
    public void setUp() {
        Allure.step("Открываем страницу с результатами", () -> open("https://www.invitro.ru/moscow/radiology/"));
    }

    @DisplayName("Проверка заголовка страницы с результатами")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testResultsPageHeader(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " проверки заголовка страницы с результатами", () -> {
            resultsSteps.navigateToResultsPage("Results");
            resultsSteps.verifyResultsPageHeader("Введите индивидуальный номер заказа, чтобы посмотреть результаты анализов");
        });
    }

    @DisplayName("Проверка валидации для пустых полей")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testEmptyFieldsValidation(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " проверки валидации для пустых полей", () -> {
            resultsSteps.navigateToResultsPage("Results");
            Allure.step("Нажимаем на кнопку 'Найти результаты'", () -> resultsSteps.clickButton("Find Results"));
            Allure.step("Проверяем выделение поля 'Код ИНЗ'", () -> resultsSteps.verifyFieldHighlighted("Код ИНЗ"));
            Allure.step("Проверяем выделение поля 'Дата рождения'", () -> resultsSteps.verifyFieldHighlighted("Дата рождения"));
            Allure.step("Проверяем выделение поля 'Фамилия'", () -> resultsSteps.verifyFieldHighlighted("Фамилия"));
            Allure.step("Проверяем сообщение об ошибке", () -> resultsSteps.verifyErrorMessage("Поля Код ИНЗДата рожденияФамилия обязательны для заполнения"));
        });
    }

    @DisplayName("Проверка заполненных полей")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testFilledFieldsValidation(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " проверки заполненных полей", () -> {
            resultsSteps.navigateToResultsPage("Results");
            Allure.step("Вводим данные заказа: код, дату рождения и фамилию", () -> resultsSteps.enterOrderDetails("231231231", "11.12.2000", "тест"));
            Allure.step("Нажимаем на кнопку 'Найти результаты'", () -> resultsSteps.clickButton("Find Results"));
            Allure.step("Проверяем, что поля заполнены корректно", () -> resultsSteps.verifyFieldsAreFilled());
        });
    }
}
