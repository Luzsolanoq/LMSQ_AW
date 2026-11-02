package com.nttdata.steps;

import com.nttdata.page.HomePage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.nttdata.core.DriverManager.esperaImplicita;

public class LoginSteps {

    private WebDriver driver;

    //constructor
    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);

        //Espera implicita
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        //Espera explicita
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));
    }

    public void typePassword(String password){
        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }


    public void login() {
        driver.findElement(LoginPage.loginButton).click();
    }

    public void ingresoUsuarioYClave(String user, String password) {
        typeUser(user);
        typePassword(password);
        esperaImplicita();
        login();
    }

    public boolean estaLogueado() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(HomePage.linkCerrarSesion),
                ExpectedConditions.visibilityOfElementLocated(LoginPage.mensajeError)
        ));

        if (driver.findElements(HomePage.linkCerrarSesion).size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}