package pageObjects.tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.pages.HomePage;

public class HomeTask {
    private WebDriver driver;
    private HomePage homePage;

    private WebDriverWait wait;
    public HomeTask(WebDriver driver) {
        this.driver = driver;
        this.homePage = new HomePage(driver);
    }

    public void digitarTexto(String texto) {

        WebElement inputTexto = homePage.getTextoInput();
        inputTexto.sendKeys(texto);
    }

    public void clicarNoBotao() {
        WebElement botao = homePage.getBotao();
        botao.click();
    }

    public void validarTextoExibido(String textoEsperado) {
        Assertions.assertEquals("Você digitou: "+textoEsperado, homePage.getTextoExibito().getText());
    }
}
