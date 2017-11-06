package BasePack;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC01Basics extends TestBase{
	public static void main(String[] args) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		//can also use this "(//android.widget.RelativeLayout)[2]" for above xpath 
		driver.findElementByClassName("android.widget.EditText").sendKeys("WifiNameBKP");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		//can also use this driver.findElementById("android:id/button1").click(); for above "OK" button
	}

}
