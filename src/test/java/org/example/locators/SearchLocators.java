package org.example.locators;

import org.openqa.selenium.By;

public class SearchLocators {

    // Локатор для поля ввода кода анализа
    public static final By SEARCH_INPUT = By.xpath("//input[@placeholder='Поиск на сайте']");

    // Локатор для контейнера результатов поиска
    public static final By SEARCH_RESULTS_CONTAINER = By.xpath("//div[@class='search-page__result']");

    // Локатор для проверки наличия кода анализа в результатах
    public static By getSearchResultContainingCode(String code) {
        return By.xpath("//div[@class='search-page__result']//span[contains(text(), '" + code + "')]");
    }
}
