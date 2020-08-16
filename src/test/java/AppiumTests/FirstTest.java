package AppiumTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class FirstTest extends Base{
    AndroidDriver<AndroidElement> driver;
    @Test
    public void test() throws MalformedURLException {

        driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navigateTo("Preference","9. Switch");
        driver.findElementByXPath("(//android.widget.CheckBox)[1]").click();



    }
}
