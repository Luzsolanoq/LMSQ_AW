package com.nttdata.stepsdefinitions;

import com.nttdata.steps.HomeSteps;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.*;

public class HomeStepsDef {

    private WebDriver driver;

    @Dado("que estoy en la página de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");
        screenShot();
    }

}