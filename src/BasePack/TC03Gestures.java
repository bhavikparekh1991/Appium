package BasePack;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC03Gestures extends TestBase{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		TouchAction touch = new TouchAction(driver);
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"Views\")")).perform();
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")")).perform();
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")")).perform();
		touch.longPress(driver.findElementByAndroidUIAutomator("text(\"People Names\")")).perform();
		System.out.println(driver.findElementByAndroidUIAutomator("text(\"Sample menu\")").getText());
		//press(driver.findElementByAndroidUIAutomator("text(\"People Names\")")).waitAction(3000).release().perform();
	}

}
