package AppiumTests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.remote.DesiredCapabilities;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import org.testng.annotations.Test;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

        File f = new File("src");
        File fs = new File(f,"ApiDemos-debug.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
       // capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
      //  capabilities.setCapability(MobileCapabilityType.VERSION,"8.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

    public static void navigateTo(String modules,String tab) {

        driver.findElementByAccessibilityId(modules).click();
       // Thread.sleep(2000);
        driver.findElementByAccessibilityId(tab).click();



    }
    public static void taping(String modules) {
        TouchAction ta = new TouchAction(driver);
        AndroidElement animation = driver.findElementByAccessibilityId(modules);
        ta.tap(tapOptions().withElement(element(animation))).perform();

    }
    public static void scrolling(String attribute, String value){

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attribute+"(\""+value+"\"))").click();
    }
}
