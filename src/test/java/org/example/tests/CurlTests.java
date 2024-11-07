package org.example.tests;

import org.example.steps.CurlSteps;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class CurlTests {

    CurlSteps curlSteps = new CurlSteps();

    @DisplayName("Проверка ответа API для города Bajmak")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testCityApiResponseBajmak(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " проверки ответа API для города Bajmak", () ->
                curlSteps.verifyCityApiResponse("bajmak"));
    }

    @DisplayName("Проверка ответа API для города Moscow")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testCityApiResponseMoscow(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " проверки ответа API для города Moscow", () ->
                curlSteps.verifyCityApiResponse("moscow"));
    }

    @DisplayName("Проверка ответа API для города London")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testCityApiResponseLondon(RepetitionInfo repetitionInfo) {
        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + " проверки ответа API для города London", () ->
                curlSteps.verifyCityApiResponse("london"));
    }
}
