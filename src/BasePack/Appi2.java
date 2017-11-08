package BasePack;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Appi2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver;
		/*File appDir=new File("src");
		File app=new File(appDir,"com.raaga.android_2.0.apk"); */
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");//Moto G4 Plus
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		TouchAction touch = new TouchAction(driver);
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"Views\")")).perform();
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")")).perform();
		touch.longPress(driver.findElementsByAndroidUIAutomator("className(\"android.view.View\")").get(0)).moveTo(driver.findElementsByAndroidUIAutomator("className(\"android.view.View\")").get(1)).release().perform();
	}

}
