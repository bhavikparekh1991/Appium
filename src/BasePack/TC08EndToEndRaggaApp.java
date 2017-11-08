package BasePack;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class TC08EndToEndRaggaApp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver;
		File appDir=new File("src");
		File app=new File(appDir,"Gaana_com.gaana.apk"); 
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");//Moto G4 Plus
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction touch = new TouchAction(driver);//com.raaga.android:id/skip_text
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='ALLOW']")));
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"ALLOW\")")).perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='GET STARTED']")));
		touch.tap(driver.findElementsByAndroidUIAutomator("className(\"android.widget.TextView\")").get(1)).perform();
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"GET STARTED\")")).perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='SKIP']")));
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"SKIP\")")).perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='SKIP']")));
		touch.tap(driver.findElementByAndroidUIAutomator("text(\"SKIP\")")).perform();
		touch.tap(driver.findElementById("com.gaana:id/menu_icon")).perform();
		Point p = driver.findElementById("com.gaana:id/menuSwitchTheme_switch").getLocation();
		//touch.tap(driver.findElementById("com.gaana:id/menuSwitchTheme_switch")).perform();
		touch.tap(p.x+20, p.y+30).perform();
		touch.tap(driver.findElementById("com.gaana:id/menu_icon")).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.gaana:id/menuSwitchTheme_switch")));
		touch.tap(p.x+100, p.y+30).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.gaana:id/menu_icon")));
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Settings']")));
		touch.tap(driver.findElementByXPath("//android.widget.TextView[@text='Settings']")).perform();
		touch.tap(driver.findElementByXPath("//android.widget.Button[@text='CLEAR DATA']")).perform();
		touch.tap(driver.findElementByXPath("//android.widget.Button[@text='OK']")).perform();
		driver.pressKeyCode(AndroidKeyCode.HOME);
	}

}
