package RealDeviceTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DeviceSetUp {

    static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

        File f = new File("src");
        File fs = new File(f,"ApiDemos-debug.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
        // capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        //  capabilities.setCapability(MobileCapabilityType.VERSION,"8.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }


}
