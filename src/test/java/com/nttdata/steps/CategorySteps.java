package com.nttdata.steps;

import com.nttdata.page.CategoryPage;
import org.openqa.selenium.WebDriver;

public class CategorySteps {

    private WebDriver driver;

    public CategorySteps(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarCategoriaClothes() {
        driver.findElement(CategoryPage.categoriaClothes).click();
    }

    public void seleccionarSubcategoriaMen() {
        driver.findElement(CategoryPage.subcategoriaMen).click();
    }

    public void seleccionarPrimerProducto() {
        driver.findElement(CategoryPage.primerProducto).click();
    }

    public void agregarDosUnidades(){

            driver.findElement(CategoryPage.cantidadProducto).clear();
            driver.findElement(CategoryPage.cantidadProducto).sendKeys("2");
            driver.findElement(CategoryPage.botonAgregarCarrito).click();
        }
    }
