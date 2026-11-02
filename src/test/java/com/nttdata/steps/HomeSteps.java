package com.nttdata.steps;
import com.nttdata.page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static com.nttdata.core.DriverManager.*;

public class HomeSteps {
    private WebDriver driver;

    //constructor
    public HomeSteps(WebDriver driver){
        this.driver = driver;
    }


    public void clickIniciarSesion(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(HomePage.linkIniciarSesion)).click();

    }
}
