package org.example.locators;

import org.openqa.selenium.By;

public class CitySelectionPageLocators {

    // Локатор текущего отображаемого города "Омск"
    public static final By CURRENT_CITY = By.xpath("//div[@id='headerCityNameDynamic']//span[contains(@class, 'city__name--label') and text()='Омск']");

    // Локатор кнопки выбора текущего города
    public static final By CITY_DROPDOWN = By.xpath("//div[@id='headerCityNameDynamic']");

    // Локатор кнопки "Выбрать другой"
    public static final By CHANGE_CITY_BUTTON = By.xpath("//a[contains(@class, 'city__change-btn')]");

    // Локатор буквы "О" для выбора городов на "О"
    public static final By LETTER_O_TAB = By.xpath("//a[text()='О']");

    // Локатор города Омск в результатах поиска после нажатия на букву "О"
    public static final By CITY_OMSK_OPTION = By.cssSelector("#change-city-form > div.change-city-tab-content.active.tab-content-cities > div.row.cities > div.select-basket-city-cities.open > div > div:nth-child(4) > a:nth-child(5)");
}
