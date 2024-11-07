package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.locators.SearchLocators;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    public void enterSearchCode(String code) {
        SelenideElement searchInput = $(SearchLocators.SEARCH_INPUT).shouldBe(Condition.visible);
        searchInput.setValue(code).pressEnter();
    }

    public boolean isResultContainingCodeDisplayed(String code) {
        // Проверка на видимость контейнера результатов
        $(SearchLocators.SEARCH_RESULTS_CONTAINER).shouldBe(Condition.visible);

        // Проверка наличия конкретного кода анализа в результатах
        SelenideElement searchResult = $(SearchLocators.getSearchResultContainingCode(code));
        return searchResult.shouldBe(Condition.visible).exists();
    }
}
