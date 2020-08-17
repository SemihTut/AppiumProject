package AppiumTests;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.AndroidKey.*;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


import static io.appium.java_client.touch.offset.PointOption.*;
import static io.appium.java_client.touch.TapOptions.*;
import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.offset.ElementOption.*;

public class KeysOfMobile extends Base{
    @Test
    public void keysEvent() throws MalformedURLException {

        driver=Capabilities("emulator");
        navigateTo("Views","Drag and Drop");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));


    }

}
