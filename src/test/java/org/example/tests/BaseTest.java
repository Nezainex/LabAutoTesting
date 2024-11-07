package org.example.tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    @BeforeAll
    public static void setUpBrowser() {
        // Настройка WebDriver для Chrome
        WebDriverManager.chromedriver().setup();

        // Конфигурация Selenide для Chrome
        Configuration.browser = "chrome";
        Configuration.timeout = 5000;  // Тайм-аут ожидания элементов (5 секунд)
        Configuration.reopenBrowserOnFail = true;  // Перезапуск браузера в случае неудачи
        Configuration.pageLoadStrategy = "normal";  // Стратегия загрузки страниц (eager)
        Configuration.pageLoadTimeout = 30000;  // Тайм-аут загрузки страниц (30 секунд)
        Configuration.headless = false;  // Отключение headless-режима для тестов
        // Открытие любой страницы для инициализации WebDriver
        open("https://www.invitro.ru/");
        // Максимизация окна браузера после инициализации WebDriver
        getWebDriver().manage().window().maximize();
    }

    @AfterAll
    public static void tearDownBrowser() {
        try {
            getWebDriver().quit();  // Закрытие всех окон и завершение сессии WebDriver
        } catch (Exception e) {
            System.out.println("Ошибка при завершении сессии WebDriver: " + e.getMessage());
        }
    }
}
