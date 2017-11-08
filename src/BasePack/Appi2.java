package BasePack;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Appi2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver;
		File appDir=new File("src");
		File app=new File(appDir,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G4 Plus");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		TouchAction touch = new TouchAction(driver);
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"Views\")")).perform();
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")")).perform();
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"2. Inline\")")).perform();
		touch.tap(driver.findElementByXPath("//*[@content-desc='9']")).perform();
		touch.longPress(driver.findElementByXPath("//*[@content-desc='15']")).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
	}

}
