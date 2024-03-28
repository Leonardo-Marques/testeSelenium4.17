package pageFactory.testCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageFactory.TestBase;
import pageFactory.tasks.HomeTask;


public class DigitaTextoTest extends TestBase {
    private WebDriver driver = this.getDriver();

    HomeTask homeTask = new HomeTask(driver);

    @Test
    public void digitaTextoEClica(){
        homeTask.digitarTexto("Meu texto");
        homeTask.clicarNoBotao();
        homeTask.validarTextoExibido("Meu texto");

    }

    @Test
    public void digitaTextoEClicaError(){
        homeTask.digitarTexto("Meu texto");
        homeTask.clicarNoBotao();
        homeTask.validarTextoExibido("não é Meu texto");

    }
}
