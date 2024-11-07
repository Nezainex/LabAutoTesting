package org.example.locators;

import org.openqa.selenium.By;

public class CartPageLocators {

    public static By getAddToCartButtonByProductName(String productName) {
        return By.xpath(".//a[@data-product-name='" + productName + "' and @title='В корзину']");
    }

    public static By getProductPriceLocatorByName(String productName) {
        return By.xpath(".//a[@data-product-name='" + productName + "']/ancestor::div[contains(@class, 'analyzes-item__total')]//div[contains(@class, 'analyzes-item__total--sum')]");
    }

    public static final By ICON_CART = By.xpath(".//div[@id='headerCartDynamic']//a//*[name()='svg']");

    public static final By CLEAR_CART_BUTTON = By.xpath(".//button[contains(@class, 'CartProductsPanel_cartClear') and contains(., 'Очистить корзину')]");

    public static By getCartProductPriceByName(String productName) {
        return By.xpath(".//button[contains(text(), '" + productName + "')]/ancestor::div[contains(@class, 'CartProduct_product__euiRX')]//div[@class='CartProduct_productPrice__1lW-7']/span");
    }
}

