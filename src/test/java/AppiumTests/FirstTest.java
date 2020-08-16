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

    @Test
    public void wifiSettings() throws MalformedURLException {
        driver=Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navigateTo("Preference","3. Preference dependencies");
        driver.findElementByXPath("(//android.widget.RelativeLayout)[1]").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("Semih TUT");

        //2 ways
       // driver.findElementById("android:id/button1").click();
        driver.findElementsByClassName("android.widget.Button").get(1).click();


    }
}
