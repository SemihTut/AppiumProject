package AppiumTests;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class browserTest extends BaseDriver{

    @Test
    public void test() throws MalformedURLException, InterruptedException {

        driver=Capabilities();
        driver.get("http://facebook.com");
        driver.switchTo().activeElement().sendKeys("Setu");
        Thread.sleep(1000);
       // driver.findElementByXPath("//*[@id='m_login_email']").sendKeys("Semih");
      //  driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("Oldu mu simdi bu adamim");


    }
}
