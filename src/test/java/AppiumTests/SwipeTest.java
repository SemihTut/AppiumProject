package AppiumTests;

import io.appium.java_client.TouchAction;


import io.appium.java_client.android.AndroidElement;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.offset.PointOption.*;
import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.TapOptions.*;
import static io.appium.java_client.touch.LongPressOptions.*;
import static io.appium.java_client.touch.offset.ElementOption.*;
import static java.time.Duration.*;

public class SwipeTest extends Base{

    @Test
    public void swipeThings() throws MalformedURLException {
        driver = Capabilities();
        navigateTo("Views","Date Widgets");
        taping("2. Inline");
        AndroidElement elo = driver.findElementByXPath("//*[@content-desc='9']");
        elo.click();
        String actual = driver.findElementById("android:id/minutes").getText();
        System.out.println("actual = " + actual);
        Assert.assertEquals(actual,"15");

        AndroidElement first = driver.findElementByXPath("//*[@content-desc='15']");
        AndroidElement second = driver.findElementByXPath("//*[@content-desc='45']");

        TouchAction ta = new TouchAction(driver);
        ta.longPress(longPressOptions().withElement(element(first))).moveTo(element(second)).release().perform();
        //Assert.assertEquals(second.getText(),"45");

    }

}
