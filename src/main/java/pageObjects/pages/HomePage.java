package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTextoInput() {
        return driver.findElement(By.id("textoInput"));
    }

    public WebElement getBotao() {
        return driver.findElement(By.id("botao"));
    }
    public WebElement getTextoExibito() {
        WebElement textoClicado = driver.findElement(By.id("textoDigitado"));
        return textoClicado;
    }
}
