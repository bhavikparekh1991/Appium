package BasePack;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC06DragDropDemo extends TestBase {
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction touch = new TouchAction(driver);
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"Views\")")).perform();
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")")).perform();
		touch.longPress(driver.findElementsByAndroidUIAutomator("className(\"android.view.View\")").get(0)).moveTo(driver.findElementsByAndroidUIAutomator("className(\"android.view.View\")").get(1)).release().perform();
		
	}
}
