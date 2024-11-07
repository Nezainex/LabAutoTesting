package org.example.locators;

import org.openqa.selenium.By;

public class ResultsPageLocators {

    // Поля ввода для ИНЗ, даты рождения и фамилии
    public static final By INZ_CODE_INPUT = By.xpath("//input[@name='orderNumber']");
    public static final By BIRTH_DATE_INPUT = By.xpath("//input[@name='birthday']");
    public static final By LAST_NAME_INPUT = By.xpath("//input[@name='lastName']");

    // Кнопка для поиска результатов анализов
    public static final By FIND_RESULTS_BUTTON = By.xpath("//button[contains(text(), 'Найти результаты')]");

    // Кнопка "Получить результаты анализов"
    public static final By GET_RESULTS_BUTTON = By.xpath("//*[contains(@class, 'invitro_header-get_result')]");

    // Заголовок страницы "Результаты анализов"
    public static final By RESULTS_PAGE_HEADER = By.xpath("//h2[text()='Введите индивидуальный номер заказа, чтобы посмотреть результаты анализов']");

    // Локатор сообщения об ошибке
    public static final By ERROR_MESSAGE = By.xpath("//div[contains(@class, 'UnauthResultsPage_error')]");

    // Локатор для оверлея, который может мешать кликам
    public static final By OVERLAY = By.xpath("//div[contains(@class, 'popmechanic-js-clickable-overlay')]");

    // Метод для получения локатора по имени поля (например, для проверки подсветки ошибок)
    public static By getFieldLocatorByName(String fieldName) {
        return switch (fieldName) {
            case "Код ИНЗ" -> INZ_CODE_INPUT;
            case "Дата рождения" -> BIRTH_DATE_INPUT;
            case "Фамилия" -> LAST_NAME_INPUT;
            default -> throw new IllegalArgumentException("Unknown field: " + fieldName);
        };
    }
}
