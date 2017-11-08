package BasePack;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class TC07Miscellaneous extends TestBase{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isLocked());
		//driver.hideKeyboard();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Preference']")));
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
	}

}
