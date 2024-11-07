package org.example.tests;

import org.example.steps.CitySelectionSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import io.qameta.allure.Allure;

public class CitySelectionTests extends BaseTest {

    CitySelectionSteps citySelectionSteps = new CitySelectionSteps();

    @BeforeEach
    public void setUp() {
        Allure.step("Открываем страницу медицинских услуг", () ->
                citySelectionSteps.openPage("https://www.invitro.ru/moscow/radiology/"));
    }

    @DisplayName("Изменение города на Омск")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testChangeCityToOmsk(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " изменения города на Омск", () -> {
            Allure.step("Открываем меню выбора города", () -> citySelectionSteps.openCitySelectionMenu());
            Allure.step("Выбираем опцию 'Выбрать другой'", () -> citySelectionSteps.chooseSelectAnotherOption("Выбрать другой"));
            Allure.step("Выбираем букву 'О' для городов на эту букву", () -> citySelectionSteps.selectLetterForCities("O", "O"));
            Allure.step("Выбираем город Омск из списка", () -> citySelectionSteps.selectCityFromList("Omsk"));
            Allure.step("Проверяем, что выбран город Омск", () -> citySelectionSteps.verifyCityIsSelected("Omsk"));
        });
    }
}
