package AppiumTests;

import io.appium.java_client.TouchAction;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.offset.PointOption.*;
import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.TapOptions.*;
import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.offset.ElementOption.*;
import static java.time.Duration.*;

public class scrollingThings extends Base{


    @Test
    public void scrolling() throws MalformedURLException {
        driver=Capabilities();
        taping("Views");
       // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
        scrolling("text","WebView");

    }
}
