package AppiumTests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.*;
import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.offset.ElementOption.*;
import static java.time.Duration.*;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

public class Gestures extends Base{

    @Test
    public void mobileGestures() throws MalformedURLException {
        driver=Capabilities("emulator");
        driver.findElementByAccessibilityId("Views").click();
        taping("Animation");

    }

    @Test
    public void longPress() throws MalformedURLException {
        driver=Capabilities("emulator");
        TouchAction ta = new TouchAction(driver);
        navigateTo("Views","Expandable Lists");
        taping("1. Custom Adapter");
        AndroidElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        ta.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).perform();
        driver.findElementByAndroidUIAutomator("text(\"Sample action\")").click();

    }
}
