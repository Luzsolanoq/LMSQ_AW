package com.nttdata.stepsdefinitions;

import com.nttdata.steps.HomeSteps;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import static com.nttdata.core.DriverManager.*;
import com.nttdata.steps.LoginSteps;
public class LoginStepsDef {

    private WebDriver driver;

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String user, String password) {
        driver = getDriver();

        new HomeSteps(driver).clickIniciarSesion();

        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.ingresoUsuarioYClave(user, password);

        boolean logueado = loginSteps.estaLogueado();

        screenShot();

        if (!logueado) {
            throw new AssertionError("El sistema permitió el acceso con credenciales inválidas");
        }
    }
}