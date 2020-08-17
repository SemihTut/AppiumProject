package AppiumTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseDriver {
    static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        capabilities.setCapability("chromedriverExecutable",
                "C:/Users/yalaa/.m2/repository/webdriver/chromedriver/win32/84.0.4147.30/chromedriver.exe");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        return driver;

    }

}
