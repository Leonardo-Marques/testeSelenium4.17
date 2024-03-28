package Report;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Base64;


public class Screenshot {

      private static final String PATH_SCREENSHOT =  ReportFactory.PATH_REPORT + File.separator + "Screenshot";


    public static Media capture(WebDriver driver) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        byte[] screenshotBytes = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        String base64Encoded = Base64.getEncoder().encodeToString(screenshotBytes);
        return  MediaEntityBuilder.createScreenCaptureFromBase64String(base64Encoded).build();
    }

}
