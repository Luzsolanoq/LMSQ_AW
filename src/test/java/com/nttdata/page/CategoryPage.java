package com.nttdata.page;

import org.openqa.selenium.By;

public class CategoryPage {

    public static By categoriaClothes = By.id("category-3");
    public static By subcategoriaMen = By.cssSelector("a[title='Men']");
    public static By primerProducto = By.cssSelector("h2.h3.product-title a");
    public static By cantidadProducto = By.id("quantity_wanted");
    public static By botonAgregarCarrito = By.cssSelector(".add-to-cart");
}