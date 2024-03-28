package pageFactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waits;

public class HomePage {

    @FindBy(id = "textoInput")
    public static WebElement txtInput;

    @FindBy(id = "botao")
    public static WebElement botao;

    @FindBy(id = "textoDigitado")
    public static WebElement txtExibido;

}
