package BasePack;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC02UIautomatorTest  extends TestBase{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// findElementByAndroidUIAutomator("attribute(\"value\")") 
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		// findElementsByAndroidUIAutomator("new UiSelector().property(value)")
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().enabled(true)").size());
	}

}
