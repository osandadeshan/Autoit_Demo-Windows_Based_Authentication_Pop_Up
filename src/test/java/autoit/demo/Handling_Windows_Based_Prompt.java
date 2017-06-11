package autoit.demo;

import java.io.IOException;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Osanda on 4/17/2017.
 */

public class Handling_Windows_Based_Prompt {
    WebDriver driver;

    @Step("Wait <seconds> seconds")
    public void stay(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Run this Autoit file")
    public void testm() throws IOException {
        driver = new FirefoxDriver();
        Runtime.getRuntime().exec("resources\\UI3_Authentication.exe");
        driver.get("http://www.signa5.com/LTSWA3/PASSWORD/file.txt");
        stay(2);
    }

    @Step("Close the driver")
    public void quit(){
        driver.close();
    }

}
