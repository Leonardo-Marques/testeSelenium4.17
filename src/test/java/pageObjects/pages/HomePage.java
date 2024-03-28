package pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Waits;

public class HomePage {
    private WebDriver driver;
    private Waits wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new Waits(driver);
    }

    public WebElement getTextoInput() {
        return wait.waitVisibility(driver.findElement(By.id("textoInput")));
    }

    public WebElement getBotao() {
        return wait.waitVisibility(driver.findElement(By.id("botao")));
    }
    public WebElement getTextoExibito() {
        return wait.waitVisibility(driver.findElement(By.id("textoDigitado")));
    }
}
