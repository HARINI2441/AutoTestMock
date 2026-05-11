package com.krce.tests;

import com.krce.base.BaseTest;
import com.krce.pages.CartPage;
import com.krce.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @Test
    public void verifyAddProductToCart() {
        ProductsPage product = new ProductsPage(driver);
        product.clickProducts();
        CartPage cart = new CartPage(driver);
        cart.addProductToCart();
        cart.clickViewCart();
//        cart.removeProductFromCart();
        Assert.assertTrue(driver.getCurrentUrl().contains("view_cart"));
        System.out.println("Product Added To Cart Successfully");
    }
}
