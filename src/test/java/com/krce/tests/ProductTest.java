package com.krce.tests;

import com.krce.base.BaseTest;
import com.krce.pages.ProductsPage;
import com.krce.utils.ScreenshotUtils;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void searchProductTest() {

        ProductsPage product = new ProductsPage(driver,wait);
        product.clickProducts();
        product.searchProduct("Tshirt");
        product.clickSearchButton();
        ScreenshotUtils.captureScreenshot(
                driver,
                "ProductSearch");
    }

}
