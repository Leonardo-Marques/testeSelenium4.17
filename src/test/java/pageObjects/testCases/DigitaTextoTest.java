package pageObjects.testCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.TestBase;
import pageObjects.tasks.HomeTask;

public class DigitaTextoTest extends TestBase {
    private WebDriver driver = this.getDriver();

    HomeTask homeTask = new HomeTask(driver);

    @Test
    public void digitaTextoEClica(){
        homeTask.digitarTexto("Meu texto");
        homeTask.clicarNoBotao();
        homeTask.validarTextoExibido("Meu texto");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void digitaTextoEClicaError(){
        homeTask.digitarTexto("Meu texto");
        homeTask.clicarNoBotao();
        homeTask.validarTextoExibido("não é Meu texto");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
