package pageObjects.testCases;

import Report.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.TestBase;
import pageObjects.tasks.HomeTask;

public class DigitaTextoTest extends TestBase {

    private WebDriver driver = this.getDriver();

    HomeTask homeTask = new HomeTask(driver);

    @Test
    public void digitaTextoEClica(){
        Report.creatTest("teste1", ReportType.SINGLE);
        Report.createStep("tstStep");
        Report.log(Status.PASS, "tstLog");
        Report.log(Status.PASS, "tstLogComImagem", Report.print(driver));
        homeTask.digitarTexto("Meu texto");
        homeTask.clicarNoBotao();
        homeTask.validarTextoExibido("Meu texto");
        Report.close();

    }

    @Test
    public void digitaTextoEClicaError(){
        homeTask.digitarTexto("Meu texto");
        homeTask.clicarNoBotao();
        homeTask.validarTextoExibido("não é Meu texto");

    }
}
