package com.nttdata.page;

import org.openqa.selenium.By;

public class CartPage {

    public static By cantidadProductoPopup = By.cssSelector("#blockcart-modal h6.product-name");
    public static By precioUnitarioPopup = By.cssSelector("#blockcart-modal h6.product-price");
    public static By mensajeProductoAgregado = By.id("blockcart-modal");
    public static By precioTotalPopup = By.cssSelector("product-total");
    public static By botonFinalizarCompra = By.cssSelector("a[href*='carrito?action=show']");
    public static By tituloCarrito = By.cssSelector("h1.h1");
    public static By precioTotalCarrito = By.cssSelector(".cart-summary-line.cart-total .value");
}