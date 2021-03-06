package BasePack;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC04Swipedemo extends TestBase {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction touch = new TouchAction(driver);
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"Views\")")).perform();
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")")).perform();
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"2. Inline\")")).perform();
		touch.tap(driver.findElementByXPath("//*[@content-desc='9']")).perform();
		touch.longPress(driver.findElementByXPath("//*[@content-desc='15']")).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
	}

}
