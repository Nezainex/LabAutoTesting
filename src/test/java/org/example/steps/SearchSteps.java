package org.example.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import org.example.pages.SearchPage;
import org.junit.jupiter.api.Assertions;

public class SearchSteps {

    SearchPage searchPage = new SearchPage();

    @When("I enter the analysis code {string} in the search field")
    public void enterAnalysisCode(String code) {
        Allure.step("Ввод кода анализа в поле поиска: " + code, () -> searchPage.enterSearchCode(code));
    }

    @Then("the analysis code {string} should be processed correctly")
    public void verifyAnalysisCodeProcessed(String code) {
        Allure.step("Проверка, что код анализа " + code + " отображается в результатах поиска", () -> {
            boolean isResultDisplayed = searchPage.isResultContainingCodeDisplayed(code);
            Assertions.assertTrue(isResultDisplayed, "Код анализа " + code + " не найден в результатах поиска.");
        });
    }
}
