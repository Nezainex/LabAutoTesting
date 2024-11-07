package org.example.pages;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import org.example.locators.CartPageLocators;

public class CartPage {

    public void addProductToCart(String productName) {
        SelenideElement addToCartButton = $(CartPageLocators.getAddToCartButtonByProductName(productName));
        addToCartButton.click();
    }

    public double getProductPrice(String productName) {
        SelenideElement productPriceElement = $(CartPageLocators.getProductPriceLocatorByName(productName));
        return Double.parseDouble(productPriceElement.getText().replaceAll("[^\\d.]", ""));
    }

    public void openCart() {
        SelenideElement cartIcon = $(CartPageLocators.ICON_CART);
        cartIcon.click();
    }

    public double getCartProductPrice(String productName) {
        SelenideElement cartProductPriceElement = $(CartPageLocators.getCartProductPriceByName(productName));
        return Double.parseDouble(cartProductPriceElement.getText().replaceAll("[^\\d.]", ""));
    }

    public void clearCart() {
        SelenideElement clearCartButton = $(CartPageLocators.CLEAR_CART_BUTTON);
        clearCartButton.click();
    }
}
