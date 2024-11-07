package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import org.example.pages.SectionPage;
import org.junit.jupiter.api.Assertions;

public class SectionSteps {

    SectionPage sectionPage = new SectionPage();

    @Given("I open the medical services page")
    public void openMedicalServicesPage() {
        Allure.step("Открытие страницы медицинских услуг",
                () -> sectionPage.openPage("https://www.invitro.ru/moscow/radiology/"));
    }

    @When("I select the {string} section")
    public void clickOnSection(String sectionName) {
        Allure.step("Выбор раздела: " + sectionName, () -> sectionPage.clickSection(sectionName));
    }

    @Then("the {string} section should be correctly selected")
    public void verifySectionIsSelected(String sectionName) {
        Allure.step("Проверка, что раздел выбран: " + sectionName, () -> {
            boolean isSelected = sectionPage.isSectionSelected(sectionName);
            Assertions.assertTrue(isSelected, "Раздел " + sectionName + " не был корректно выбран.");
        });
    }

    @When("I hover over the {string} menu")
    public void hoverOverMenu(String menuName) {
        Allure.step("Наведение курсора на меню: " + menuName, () -> sectionPage.hoverOverMenu(menuName));
    }

    @Then("I click on the {string} menu sub-section")
    public void clickMenuSubSection(String menuSubSectionName) {
        Allure.step("Клик на подраздел меню: " + menuSubSectionName, () -> {
            boolean isClicked = sectionPage.clickMenuSubSection(menuSubSectionName);
            Assertions.assertTrue(isClicked, "Подраздел меню " + menuSubSectionName + " не был нажат.");
        });
    }

    @Then("I click on the {string} sub-section")
    public void verifySubSectionClick(String subSectionName) {
        Allure.step("Проверка клика по подразделу: " + subSectionName, () -> {
            boolean isClicked = sectionPage.clickSubSection(subSectionName);
            Assertions.assertTrue(isClicked, "Подраздел " + subSectionName + " не был нажат.");
        });
    }

    @When("I click on the {string} subcategory in {string} section")
    public void clickOnSubCategory(String subCategoryName, String sectionName) {
        Allure.step("Клик на подкатегорию: " + subCategoryName + " в разделе: " + sectionName, () -> {
            switch (sectionName) {
                case "МРТ":
                    sectionPage.clickOnMrtSubCategory(subCategoryName);
                    break;
                case "КТ":
                    sectionPage.clickOnKtSubCategory(subCategoryName);
                    break;
                case "Рентген":
                    sectionPage.clickOnRentgenSubCategory(subCategoryName);
                    break;
                case "Эндоскопия":
                    sectionPage.clickOnEndoskopiyaSubCategory(subCategoryName);
                    break;
                case "УЗИ":
                    sectionPage.clickOnUziSubCategory(subCategoryName);
                    break;
                case "Инъекции":
                    sectionPage.clickOnInjectionsSubCategory(subCategoryName);
                    break;
                default:
                    throw new IllegalArgumentException("Неверное имя секции: " + sectionName);
            }
        });
    }
}