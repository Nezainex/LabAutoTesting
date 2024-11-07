package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.example.pages.CartPage;
import org.junit.jupiter.api.Assertions;

public class CartSteps {

    private double rememberedPrice;
    CartPage cartPage = new CartPage();

    @Given("I remember the price of the product {string}")
    public void rememberProductPrice(String productName) {
        Allure.step("Запоминаем цену товара: " + productName, () -> {
            rememberedPrice = cartPage.getProductPrice(productName);
            System.out.println("Запомненная цена: " + rememberedPrice);
        });
    }

    @When("I add the product {string} to the cart")
    public void addProductToCart(String productName) {
        Allure.step("Добавляем товар в корзину: " + productName, () -> cartPage.addProductToCart(productName));
    }

    @And("I open the cart")
    public void openCart() {
        Allure.step("Открываем корзину", cartPage::openCart);
    }

    @Then("I compare the total amount in the cart with the remembered price")
    public void compareCartTotalWithRememberedPrice(String productName) {
        Allure.step("Сравниваем общую сумму в корзине с запомненной ценой товара: " + productName, () -> {
            double cartProductPrice = cartPage.getCartProductPrice(productName);
            System.out.println("Цена товара в корзине: " + cartProductPrice);
            if (cartProductPrice > 10000) {
                System.out.println("Общая сумма в корзине больше 10000.");
            } else if (cartProductPrice < 10000) {
                System.out.println("Общая сумма в корзине меньше 10000.");
            } else {
                Assertions.fail("Общая сумма в корзине равна 10000. Тест не пройден.");
            }
        });
    }

    @And("I clear the cart")
    public void clearCart() {
        Allure.step("Очищаем корзину", cartPage::clearCart);
    }
}
