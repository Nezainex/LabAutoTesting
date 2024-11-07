package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.locators.CitySelectionPageLocators;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CitySelectionPage {

    public void openPage(String url) {
        open(url);
    }

    public void openCitySelectionMenu() {
        SelenideElement cityDropdown = $(CitySelectionPageLocators.CITY_DROPDOWN).shouldBe(Condition.visible);
        cityDropdown.click();
    }

    public void clickChangeCityButton() {
        SelenideElement changeCityButton = $(CitySelectionPageLocators.CHANGE_CITY_BUTTON).shouldBe(Condition.visible);
        changeCityButton.click();
    }

    public void selectLetter() {
        SelenideElement letterTab = $(CitySelectionPageLocators.LETTER_O_TAB).shouldBe(Condition.visible);
        letterTab.click();
    }

    public void selectCityOmsk() {
        SelenideElement cityOmskOption = $(CitySelectionPageLocators.CITY_OMSK_OPTION).shouldBe(Condition.visible, Condition.enabled);
        cityOmskOption.click();
    }

    public boolean verifyCityChangedToOmsk() {
        SelenideElement currentCity = $(CitySelectionPageLocators.CURRENT_CITY).shouldBe(Condition.visible);
        return currentCity.getText().equals("Омск");
    }
}
