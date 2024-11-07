package org.example.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import org.example.pages.ResultsPage;
import org.junit.jupiter.api.Assertions;

public class ResultsSteps {

    ResultsPage resultsPage = new ResultsPage();

    @When("I navigate to the {string} page")
    public void navigateToResultsPage(String page) {
        Allure.step("Переход на страницу " + page, resultsPage::clickGetResults);
    }

    @Then("the page header should be {string}")
    public void verifyResultsPageHeader(String expectedHeader) {
        Allure.step("Проверка заголовка страницы с результатами", () -> {
            String actualHeader = resultsPage.getHeaderText();
            Assertions.assertEquals(expectedHeader, actualHeader, "Заголовок страницы не совпадает с ожидаемым.");
        });
    }

    @When("I click the {string} button")
    public void clickButton(String button) {
        Allure.step("Нажатие на кнопку " + button, resultsPage::clickFindResults);
    }

    @Then("the {string} field should be highlighted")
    public void verifyFieldHighlighted(String fieldName) {
        Allure.step("Проверка, что поле " + fieldName + " выделено", () ->
                Assertions.assertTrue(resultsPage.isFieldHighlighted(fieldName), "Поле " + fieldName + " не выделено."));
    }

    @Then("I should see the message {string}")
    public void verifyErrorMessage(String expectedMessage) {
        Allure.step("Проверка сообщения об ошибке", () -> {
            String actualMessage = resultsPage.getErrorMessage();
            Assertions.assertEquals(expectedMessage, actualMessage, "Сообщение об ошибке не совпадает с ожидаемым.");
        });
    }

    @When("I enter order details {string} {string} {string}")
    public void enterOrderDetails(String inzCode, String birthDate, String lastName) {
        Allure.step("Ввод данных заказа: код ИНЗ, дата рождения, фамилия",
                () -> resultsPage.enterOrderDetails(inzCode, birthDate, lastName));
    }

    @Then("I verify that the fields are filled correctly")
    public void verifyFieldsAreFilled() {
        Allure.step("Проверка, что поля заполнены корректно", () -> {
            String expectedOrderCode = "231231231";
            String expectedBirthDate = "11.12.2000";
            String expectedLastName = "тест";

            // Получение и проверка кода заказа
            String actualOrderCode = resultsPage.getOrderCodeFieldValue();
            Assertions.assertEquals(expectedOrderCode, actualOrderCode, "Код заказа не совпадает с ожидаемым значением.");

            // Получение и проверка даты рождения
            String actualBirthDate = resultsPage.getBirthDateFieldValue();
            Assertions.assertEquals(expectedBirthDate, actualBirthDate, "Дата рождения не совпадает с ожидаемым значением.");

            // Получение и проверка фамилии
            String actualLastName = resultsPage.getLastNameFieldValue();
            Assertions.assertEquals(expectedLastName, actualLastName, "Фамилия не совпадает с ожидаемым значением.");
        });
    }
}
