package cucumber.steps;

import cucumber.TestBase;
import cucumber.tasks.HomeTask;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

public class HomeStep extends TestBase {

    HomeTask homeTask = new HomeTask(getDriver());

    public HomeStep() {
    }

    @Dado("Digito o texto {string}")
    public void digitoTexto(String texto) throws Exception{
       homeTask.digitarTexto(texto);
    }

    @E("clico no botao")
    public void clicarBotao(){
        homeTask.clicarNoBotao();
    }

    @Entao("Valido que exiba o texto {string}")
    public void validaTexto(String texto) throws Exception{
        homeTask.validarTextoExibido(texto);
    }

    @Dado("que estou na pagina inicial")
    public void validaPaginaInicial(){
//        String os = System.getProperty("os.name").toLowerCase();
//        if (os.contains("win")) {
//            getDriver().get(DIR_PATH_HTML);
//        } else {
//            getDriver().get("file://"+DIR_PATH_HTML);
//        }
    }
}
