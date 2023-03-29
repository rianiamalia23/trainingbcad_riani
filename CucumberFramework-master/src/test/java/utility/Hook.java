/**
 * 
 */
package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author CHIRAG
 *
 */
public class Hook {

	private static WebDriver driver;

	@Before("@instagram")
	public void setUp()
	{
		//String DriverPath = "C://Users//riani.amalia//Downloads//chromedriver_win32.exe";
		//System.setProperty("webdriver.chrome.driver", DriverPath);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}


	@Before("@mobile")
	public void setUpAppium() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//desiredCapabilities.setCapability("appium:udid", "be518def");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
		cap.setCapability("appPackage","com.android.chrome");
		cap.setCapability("appActivity","com.google.android.apps.chrome.Main");
		//cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"//App//ApiDemos.apk");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Before("@clock")
	public void setUpClock() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//desiredCapabilities.setCapability("appium:udid", "be518def");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
		cap.setCapability("appPackage","com.google.android.deskclock");
		cap.setCapability("appActivity","com.android.deskclock.DeskClock");
		//cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"//App//ApiDemos.apk");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
