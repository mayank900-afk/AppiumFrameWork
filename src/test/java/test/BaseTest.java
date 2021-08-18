package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	static AppiumDriver<MobileElement> driver;

	@BeforeTest

	public void setup() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			// caps.setCapability("platformName", "Android");
			// caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); //All are same
			

			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.VERSION, "9");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-G950F");
			caps.setCapability(MobileCapabilityType.UDID, "ce041714215710e80c");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			caps.setCapability(MobileCapabilityType.APP, "C:/Testing compare/AppiumTest/src/main/java/Apps/ApiDemos-debug.apk");
			caps.setCapability("appPackage", " io.appium.android.apis");
			caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
			//caps.setCapability( "chromedriverExecutable", "C:/Driver/chromedriver.exe");
			//caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome"); //for browser

			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, caps);
			driver = new AndroidDriver<MobileElement>(url, caps);
			// driver = new IOSDriver<MobileElement>(url, caps); //for ios
		} catch (Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();

		}
		

	}
 @Test
	public void sampleTest() {
		
	}

	@AfterTest

	public void teardown() {

		driver.close();
		//driver.quit();
	}

}
