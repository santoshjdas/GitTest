package Deflt;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class mainpgm {

public  AndroidDriver<MobileElement> driver;
	
	public static DesiredCapabilities cap;
	
	@BeforeTest(alwaysRun=true)
	@Parameters({"port","device"})
	public void testsetup(String port,String device) throws MalformedURLException, InterruptedException{
				
		//String path = "D://Appium//apkfiles//com.gorillalogic.monkeytalk.demo1.apk";
		//File file = new File(path);
		
		cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);
		cap.setCapability("appPackage", "net.one97.paytm");
		cap.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
		
		//cap.setCapability(MobileCapabilityType.APP, file);
		
		driver = new AndroidDriver<>(new URL("http://localhost:"+port+"/wd/hub"), cap);
		
		System.out.println("session id is---"+driver.getSessionId());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void ValidLoginTest() throws InterruptedException{
		
		//driver.findElementByAccessibilityId("Open navigation drawer").click();
		//driver.findElementByAccessibilityId("Close navigation drawer").click();
		

		
		//driver.tap(1, driver.findElementById("com.gorillalogic.monkeytalk.demo1:id/login_btn"), 1);
		
		//String name = driver.findElementById("com.gorillalogic.monkeytalk.demo1:id/logout_txt").getText();
		
		//Assert.assertTrue(name.contains("admin"));
		
	}
	
	@Test
	public void InvalidValidLoginTest() throws InterruptedException{
		
		String pagetitle =driver.findElementByName("Your Paytm Wallet is here!").getText();
	    System.out.println(pagetitle);
		Assert.assertTrue(pagetitle.contains("Your Paytm Wallet is here!"));
	
		
		driver.findElementByName("Pay or Send").click();
		driver.findElementByAccessibilityId("Navigate up").click();
		driver.findElementByName("Request").click();
		driver.findElementByAccessibilityId("Navigate up").click();
		String pagetitle1 =driver.findElementByName("Recharge or Pay for").getText();
		System.out.println(pagetitle1);
		driver.findElementByName("Mobile Prepaid").click();
		driver.findElementByAccessibilityId("Navigate up").click();
	//String str=driver. 
		driver.swipe(1004, 947, 65, 919, 6000);
		driver.swipe(1004, 947, 65, 919, 6000);
		driver.swipe(1004, 947, 65, 919, 6000);
		//driver.findElementByName("Dairy Products").click();
		driver.findElementByName("Movies ").click();
		System.out.println(driver.getContextHandles());
		Thread.sleep(5000);
		System.out.println(driver.getContextHandles());
   	}
	@Test()
	public void Shoponpaytmm() throws InterruptedException {
		//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Bazaar SuperValue\")").click();
		
	//String lst=driver.findElementById("movie_name").getText();
		//JavascriptExecutor je= (JavascriptExecutor)driver;
		//je.executeScript("arguments[0].scrollIntoView(true);", driver.findElementByName("Remo"));
		
		
        
		List<MobileElement> movilist= driver.findElementsById("movie_name");
		System.out.println(movilist.get(0).getText());
		System.out.println(movilist.get(1).getText());
		driver.swipe(218, 1864, 182, 180, 20000);
		List<MobileElement> movilist1= driver.findElementsById("movie_name");
		System.out.println(movilist1.get(0).getText());
		System.out.println(movilist1.get(1).getText());
		System.out.println(movilist1.get(2).getText());
		System.out.println(movilist1.get(3).getText());
		driver.swipe(218, 1864, 182, 180, 20000);
		List<MobileElement> movilist2= driver.findElementsById("movie_name");
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
		driver.
	}
	@AfterTest
	public void quit(){
		driver.quit();
	}
	
	
	}
