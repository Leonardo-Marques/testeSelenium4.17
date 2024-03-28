package cucumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class TestBase {
    private static String DIR_PATH_HTML = System.getProperty("user.dir") + File.separator + "src"+ File.separator+"test"+
            File.separator+"resources"+File.separator+"paginaTeste.html";
    protected static WebDriver driver;

    public static WebDriver startDriver(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        return driver;
    }

    public static WebDriver getDriver(){
        if(driver == null){
            driver = startDriver();
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }


    @BeforeEach
    public void setUp(){
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            getDriver().get(DIR_PATH_HTML);
        } else {
            getDriver().get("file://"+DIR_PATH_HTML);
        }
    }

    @AfterEach
    public void finish(){
        quitDriver();
    }

}
