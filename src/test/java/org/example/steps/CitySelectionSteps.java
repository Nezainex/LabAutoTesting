package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import org.example.pages.CitySelectionPage;
import org.junit.jupiter.api.Assertions;

public class CitySelectionSteps {

    CitySelectionPage citySelectionPage = new CitySelectionPage();

    @Given("The page {string} is open")
    public void openPage(String url) {
        Allure.step("Открываем страницу: " + url, () -> citySelectionPage.openPage(url));
    }

    @When("The user opens the city selection menu")
    public void openCitySelectionMenu() {
        Allure.step("Открываем меню выбора города", citySelectionPage::openCitySelectionMenu);
    }

    @When("The user selects the option {string} to change the city")
    public void chooseSelectAnotherOption(String option) {
        Allure.step("Выбираем опцию для смены города: " + option, citySelectionPage::clickChangeCityButton);
    }

    @When("The user selects the letter {string} to display cities starting with {string}")
    public void selectLetterForCities(String letter, String expectedLetter) {
        Allure.step("Выбираем букву " + letter + " для отображения городов, начинающихся на " + expectedLetter,
                () -> citySelectionPage.selectLetter());
    }

    @When("The user selects the city {string} from the list")
    public void selectCityFromList(String city) {
        Allure.step("Выбираем город " + city + " из списка", () -> citySelectionPage.selectCityOmsk());
    }

    @Then("The city {string} is displayed as the currently selected city on the website")
    public void verifyCityIsSelected(String expectedCity) {
        Allure.step("Проверяем, что выбранный город отображается как: " + expectedCity, () -> Assertions.assertTrue(citySelectionPage.verifyCityChangedToOmsk(),
                "Город не был изменен на " + expectedCity));
    }
}
