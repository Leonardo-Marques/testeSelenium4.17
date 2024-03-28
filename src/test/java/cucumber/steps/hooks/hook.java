package cucumber.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static cucumber.TestBase.*;

public class hook{

    @Before
    public void setUp(){
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            getDriver().get(DIR_PATH_HTML);
        } else {
            getDriver().get("file://"+DIR_PATH_HTML);
        }
    }

    @After
    public void finish(){
        quitDriver();
    }
}
