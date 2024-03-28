package cucumber.tasks;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import cucumber.pages.HomePage;

public class HomeTask extends HomePage {
    private WebDriver driver;

    public HomeTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    public void digitarTexto(String texto) {
        txtInput.sendKeys(texto);
    }

    public void clicarNoBotao() {
        botao.click();
    }

    public void validarTextoExibido(String textoEsperado) {
        Assert.assertEquals("Você digitou: "+textoEsperado, txtExibido.getText());
    }
}
