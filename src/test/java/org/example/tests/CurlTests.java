package org.example.tests;

import org.example.steps.CurlSteps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.example.utils.RetryTestExtension;
import io.qameta.allure.Allure;

@ExtendWith(RetryTestExtension.class)
public class CurlTests {

    CurlSteps curlSteps = new CurlSteps();

    @Test
    public void testCityApiResponseBajmak() {
        Allure.step("Проверка ответа API для города Bajmak", () ->
                curlSteps.verifyCityApiResponse("bajmak"));
    }

    @Test
    public void testCityApiResponseMoscow() {
        Allure.step("Проверка ответа API для города Moscow", () ->
                curlSteps.verifyCityApiResponse("moscow"));
    }

    @Test
    public void testCityApiResponseLondon() {
        Allure.step("Проверка ответа API для города London", () ->
                curlSteps.verifyCityApiResponse("london"));
    }
}