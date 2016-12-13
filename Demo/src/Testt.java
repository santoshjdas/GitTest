import java.net.MalformedURLException;
	import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.xerces.xs.StringList;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import com.sun.jna.StringArray;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

	 class Testt {
	public int n=7;
public static String AppPacakage="public static string AppPacakage";
public static String AppActivity="com.android.packageinstaller.permission.ui.GrantPermissionsActivity";
	
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void InstallApp() throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap=new DesiredCapabilities();
		DesiredCapabilities cd=DesiredCapabilities.android();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "A0001");
		
		cap.setCapability("appPackage", "net.one97.paytm");
		cap.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");
		//cap.setCapability("unicodeKeyboard", "true");
		//cap.setCapability("resetKeyboard", "true");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15000);
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		
	}
	@Test()
	public void Mainpageloaded(){
		String pagetitle =driver.findElementByName("Your Paytm Wallet is here!").getText();
	    System.out.println(pagetitle);
		Assert.assertTrue(pagetitle.contains("Your Paytm Wallet is here!"));
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		System.out.println(driver.getContextHandles());

		
	}
	@Test()
	public void Shoponpaytm() throws InterruptedException{
		//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Bazaar SuperValue\")").click();
		driver.findElementById("tv_pay_img").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		driver.findElementById("tv_request_img").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
		String pagetitle1 =driver.findElementByName("Recharge or Pay for").getText();
		System.out.println(pagetitle1);
		driver.findElementById("item_image").click();
		driver.findElementByClassName("android.widget.ImageButton").click();
	//String str=driver. 
		driver.swipe(1004, 947, 65, 919, 6000);
		driver.swipe(1004, 947, 65, 919, 6000);
		driver.swipe(1004, 947, 65, 919, 6000);
		//driver.findElementByName("Dairy Products").click();
		driver.findElementByName("Movies ").click();
		System.out.println(driver.getContextHandles());
		Thread.sleep(5000);
		System.out.println(driver.getContextHandles());
	//String lst=driver.findElementById("movie_name").getText();
		//JavascriptExecutor je= (JavascriptExecutor)driver;
		//je.executeScript("arguments[0].scrollIntoView(true);", driver.findElementByName("Remo"));
		
		List<AndroidElement> movilist= driver.findElementsById("movie_name");
		System.out.println(movilist.get(0).getText());
		System.out.println(movilist.get(1).getText());
		driver.swipe(218, 1864, 182, 180, 20000);
		List<AndroidElement> movilist1= driver.findElementsById("movie_name");
		System.out.println(movilist1.get(0).getText());
		System.out.println(movilist1.get(1).getText());
		System.out.println(movilist1.get(2).getText());
		System.out.println(movilist1.get(3).getText());
		driver.swipe(218, 1864, 182, 180, 20000);
		List<AndroidElement> movilist2= driver.findElementsById("movie_name");
		System.out.println(movilist1.get(0).getText());
		System.out.println(movilist1.get(1).getText());
		//System.out.println(movilist1.get(2).getText());
		//System.out.println(movilist1.get(3).getText());
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.findElementByName("Movies ").click();
		Thread.sleep(10000);
	    driver.swipe(218, 1864, 182, 180, 20000);
	    driver.swipe(218, 1864, 182, 180, 20000);
		driver.findElementByName("Kaashmora (tamil)").click();
		//android.widget.ImageView Electronics net.one97.paytm:id/action_search
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.swipe(218, 1864, 182, 180, 20000);
		driver.findElementByName("Movies ").click();
		driver.findElementById("action_search").sendKeys("Lenovo laptops");
	}
}


