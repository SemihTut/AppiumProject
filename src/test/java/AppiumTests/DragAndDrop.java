package AppiumTests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.offset.PointOption.*;
import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.TapOptions.*;
import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.offset.ElementOption.*;
import java.net.MalformedURLException;

public class DragAndDrop extends Base{

    @Test
    public void dragAndDrop() throws MalformedURLException {

        driver=Capabilities("emulator");
        navigateTo("Views","Drag and Drop");
        TouchAction ta = new TouchAction(driver);
        AndroidElement firstDot = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
        AndroidElement thirdDot = driver.findElementById("io.appium.android.apis:id/drag_dot_3");

       // ta.longPress(longPressOptions().withElement(element(firstDot))).moveTo(element(thirdDot)).release().perform();
        ta.longPress(element(firstDot)).moveTo(element(thirdDot)).release().perform();
    }
}
