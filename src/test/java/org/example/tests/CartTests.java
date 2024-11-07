package org.example.tests;

import io.qameta.allure.Allure;
import org.example.steps.CartSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static com.codeborne.selenide.Selenide.open;

public class CartTests extends BaseTest {

    CartSteps cartSteps = new CartSteps();

    @BeforeEach
    public void setUp() {
        Allure.step("Открытие страницы анализов", () -> open("https://www.invitro.ru/analizes/for-doctors/"));
    }

    @DisplayName("Добавление продукта в корзину и проверка цены")
    @RepeatedTest(value = 3, name = "{displayName} - попытка {currentRepetition} из {totalRepetitions}")
    public void testAddProductToCartAndComparePrice(RepetitionInfo repetitionInfo) {
        String productName = "Глюкоза (в крови) (Glucose)";

        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + ": Запоминаем цену продукта и добавляем его в корзину", () -> {
            cartSteps.rememberProductPrice(productName);
            cartSteps.addProductToCart(productName);
        });

        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + ": Открываем корзину", cartSteps::openCart);

        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + ": Сравниваем сумму в корзине с запомненной ценой",
                () -> cartSteps.compareCartTotalWithRememberedPrice(productName));

        Allure.step("Попытка #" + repetitionInfo.getCurrentRepetition() + ": Очищаем корзину", cartSteps::clearCart);
    }
}
