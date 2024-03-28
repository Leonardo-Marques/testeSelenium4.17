package cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class TestBase {
    public static String DIR_PATH_HTML = System.getProperty("user.dir") + File.separator + "src"+ File.separator+"test"+
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

}
