package org.example.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

import java.nio.charset.StandardCharsets;

public class CurlSteps {

    @When("I check the API response for the city {string}")
    public void checkApiResponseForCity(String cityCode) {
        verifyCityApiResponse(cityCode);
    }

    @Then("the response code should be 200 and the {string} field should not be empty")
    public void verifyCityApiResponse(String code) {
        Allure.step("Проверка ответа для города: " + code, () -> {
            // Отправка запроса и проверка кода ответа
            Response response = RestAssured.given()
                    .header("User-Agent", "Mozilla/5.0")
                    .when()
                    .get("https://www.invitro.ru/local/ajax/current-city.php?CODE=" + code);

            int statusCode = response.getStatusCode();
            Allure.step("Проверка кода статуса ответа", () ->
                    Assertions.assertEquals(200, statusCode,
                            "Ожидался код статуса 200, но получен " + statusCode + " для города " + code)
            );

            String responseBody = response.getBody().asString();
            System.out.println("Тело ответа для " + code + ": " + responseBody);

            // Проверка поля 'city' с учетом возможных проблем с кодировкой
            Allure.step("Проверка значения поля 'city'", () -> {
                String city = response.jsonPath().get("city");
                if (city != null) {
                    city = new String(city.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
                }
                Assertions.assertNotNull(city, "Поле 'city' является null для " + code + ". Полный ответ: " + responseBody);
            });

            // Проверка поля 'code'
            Allure.step("Проверка значения поля 'code'", () -> {
                String responseCode = response.jsonPath().get("code");
                Assertions.assertNotNull(responseCode, "Поле 'code' является null для " + code + ". Полный ответ: " + responseBody);
                Assertions.assertEquals(code, responseCode, "Ожидался код города '" + code + "', но получен '" + responseCode + "'. Полный ответ: " + responseBody);
            });

            // Проверка поля 'guid'
            Allure.step("Проверка значения поля 'guid'", () -> {
                String guid = response.jsonPath().get("guid");
                Assertions.assertNotNull(guid, "Поле 'guid' является null для " + code + ". Полный ответ: " + responseBody);
            });
        });
    }
}
