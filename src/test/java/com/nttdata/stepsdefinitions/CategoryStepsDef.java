package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CategorySteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.*;

public class CategoryStepsDef {

    private WebDriver driver;

    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navegarCategoriaYSubcategoria(String categoria, String subcategoria) {

        driver = getDriver();

        CategorySteps categorySteps = new CategorySteps(driver);

        if (categoria.equals("Clothes")) {
            categorySteps.seleccionarCategoriaClothes();
        }

        if (subcategoria.equals("Men")) {
            categorySteps.seleccionarSubcategoriaMen();
        }
        screenShot();
    }

    @Y("agrego 2 unidades del primer producto al carrito")
    public void agregarDosUnidadesProducto() {

        driver = getDriver();

        CategorySteps categorySteps = new CategorySteps(driver);
        categorySteps.seleccionarPrimerProducto();
        categorySteps.agregarDosUnidades();
        screenShot();
    }
}