package testeFuncinamento;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class FirstScript {
    public static void main(String[] args) {
        String DIR_PATH_HTML = System.getProperty("user.dir") + File.separator + "paginaTeste.html";
        WebDriver driver = new ChromeDriver();

        driver.get(DIR_PATH_HTML);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
