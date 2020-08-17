package AppiumTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UiAutomatorTest extends Base{
    AndroidDriver<AndroidElement> driver;

    @Test
    public void uiAutomator() throws MalformedURLException {

        driver=Capabilities("emulator");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();

    }
    @Test
    public void clicableElements() throws MalformedURLException {
        //driver=Capabilities("emulator");
        driver=Capabilities("real");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //new UiSelector().clickable(true)
        List<AndroidElement> elementsByAndroidUIAutomator = driver.findElementsByAndroidUIAutomator("clickable(false)");
        int size = elementsByAndroidUIAutomator.size();
        System.out.println("size = " + size);
        //Assert.assertEquals(size,7);


    }
}
