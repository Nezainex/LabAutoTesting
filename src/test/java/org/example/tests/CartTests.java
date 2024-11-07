package org.example.tests;

import org.example.steps.CartSteps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.example.utils.RetryTestExtension;
import io.qameta.allure.Allure;

import static com.codeborne.selenide.Selenide.open;

@ExtendWith(RetryTestExtension.class)
public class CartTests extends BaseTest {

    CartSteps cartSteps = new CartSteps();

    @BeforeEach
    public void setUp() {
        Allure.step("Открытие страницы анализов", () -> open("https://www.invitro.ru/analizes/for-doctors/"));
    }

    @Test
    public void testAddProductToCartAndComparePrice() {
        String productName = "Глюкоза (в крови) (Glucose)";
        Allure.step("Запоминаем цену продукта и добавляем его в корзину", () -> {
            cartSteps.rememberProductPrice(productName);
            cartSteps.addProductToCart(productName);
        });
        Allure.step("Открываем корзину", cartSteps::openCart);
        Allure.step("Сравниваем сумму в корзине с запомненной ценой", () -> cartSteps.compareCartTotalWithRememberedPrice(productName));
        Allure.step("Очищаем корзину", cartSteps::clearCart);
    }
}
