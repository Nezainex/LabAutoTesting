package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.locators.ResultsPageLocators;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ResultsPage {

    public void closeOverlayIfPresent() {
        SelenideElement overlay = $(ResultsPageLocators.OVERLAY);
        if (overlay.is(Condition.visible)) {
            overlay.click(); // Закрываем оверлей, если он виден
        }
    }

    public void clickGetResults() {
        closeOverlayIfPresent(); // Закрываем оверлей перед кликом, если он присутствует
        SelenideElement getResultsButton = $(ResultsPageLocators.GET_RESULTS_BUTTON).shouldBe(Condition.visible);
        getResultsButton.click();
    }

    public String getHeaderText() {
        SelenideElement header = $(ResultsPageLocators.RESULTS_PAGE_HEADER).shouldBe(Condition.visible);
        return header.getText();
    }

    public void enterOrderDetails(String inzCode, String birthDate, String lastName) {
        $(ResultsPageLocators.INZ_CODE_INPUT).setValue(inzCode);
        $(ResultsPageLocators.BIRTH_DATE_INPUT).setValue(birthDate);
        $(ResultsPageLocators.LAST_NAME_INPUT).setValue(lastName);
    }

    public void clickFindResults() {
        SelenideElement findResultsButton = $(ResultsPageLocators.FIND_RESULTS_BUTTON).shouldBe(Condition.visible);
        findResultsButton.click();
    }

    public boolean isFieldHighlighted(String fieldName) {
        SelenideElement field = $(ResultsPageLocators.getFieldLocatorByName(fieldName)).shouldBe(Condition.visible);
        return Objects.requireNonNull(field.getAttribute("class")).contains("error");
    }

    public String getErrorMessage() {
        SelenideElement errorMessage = $(ResultsPageLocators.ERROR_MESSAGE).shouldBe(Condition.visible);
        return errorMessage.getText();
    }

    public String getOrderCodeFieldValue() {
        return $(ResultsPageLocators.INZ_CODE_INPUT).getValue();
    }

    public String getBirthDateFieldValue() {
        return $(ResultsPageLocators.BIRTH_DATE_INPUT).getValue();
    }

    public String getLastNameFieldValue() {
        return $(ResultsPageLocators.LAST_NAME_INPUT).getValue();
    }
}
