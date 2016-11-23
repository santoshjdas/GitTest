package repoositories;

public class AppiumRND {
	/*import java.awt.event.KeyEvent;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.List;

	import org.junit.Assert;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.Wait;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.android.AndroidKeyCode;
	import io.appium.java_client.remote.MobileCapabilityType;

	public class MainPgm {
	AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void InstallApp() throws MalformedURLException{
		DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "A0001");
		cap.setCapability("appPackage", "net.one97.paytm");
		cap.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");
		cap.setCapability("unicodeKeyboard", "true");
		cap.setCapability("resetKeyboard", "true");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
		
		driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		System.out.println(driver.getContextHandles());
		
	}
	@Test()
	public void Mainpageloaded(){
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		String pagetitle =driver.findElementByName("Your Paytm Wallet is here!").getText();
	    Assert.assertTrue(pagetitle.contains("Your Paytm Wallet is here!"));

		
	}

	@Test(dependsOnMethods="Mainpageloaded")
	public void Signup(){
		driver.findElementById("img_tab_bar_profile").click();
		driver.findElementById("lyt_user_image").click();driver.startActivity("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
		
		//driver.findElementByName("Allow").click();
		//driver.startActivity("net.one97.paytm", "net.one97.paytm.landingpage.activity.AJRMainActivity");
		//TouchAction t=new TouchAction(driver);
		//List<AndroidElement> ele=driver.findElementsByName("Allow");
		//t.tap((AndroidElement) ele.get(1)).perform();
		
		//Here we use pressKeyCode instead of SendKeyEvent in java client 4.1 for hardware key events
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		//driver.findElementByXPath("//UIAButton[@name='Allow'").click();
		//driver.startActivity("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
		//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Allow\")").click();
		//driver.findElementByName("Allow").click();
		//driver.startActivity("net.one97.paytm", "net.one97.paytm.landingpage.activity.AJRMainActivity");
		driver.findElementByName("Sign Up").click();
		driver.findElementByName("Mobile").sendKeys("8431039261");
		driver.findElementByName("Email (optional)").sendKeys("becsantosh.das@gmail.com");
		driver.findElementById("edit_password").sendKeys("@password6577");
		driver.findElementByName("Sign Up").click();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		import java.awt.event.KeyEvent;
		import java.net.MalformedURLException;
		import java.net.URL;
		import java.util.List;

		import org.junit.Assert;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.support.ui.Wait;
		import org.testng.annotations.BeforeTest;
		import org.testng.annotations.Test;

		import io.appium.java_client.AppiumDriver;
		import io.appium.java_client.MobileElement;
		import io.appium.java_client.TouchAction;
		import io.appium.java_client.android.AndroidDriver;
		import io.appium.java_client.android.AndroidElement;
		import io.appium.java_client.android.AndroidKeyCode;
		import io.appium.java_client.remote.MobileCapabilityType;

		public class MainPgm {
		AndroidDriver<AndroidElement> driver;
		@BeforeTest
		public void InstallApp() throws MalformedURLException{
			DesiredCapabilities cap=new DesiredCapabilities();
			//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "A0001");
			cap.setCapability("appPackage", "net.one97.paytm");
			cap.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");
			cap.setCapability("unicodeKeyboard", "true");
			cap.setCapability("resetKeyboard", "true");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
			
			driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			System.out.println(driver.getContextHandles());
			
		}
		@Test()
		public void Mainpageloaded(){
			driver.findElementByAccessibilityId("Open navigation drawer").click();
			driver.findElementByAccessibilityId("Open navigation drawer").click();
			String pagetitle =driver.findElementByName("Your Paytm Wallet is here!").getText();
		    Assert.assertTrue(pagetitle.contains("Your Paytm Wallet is here!"));

			
		}

		@Test(dependsOnMethods="Mainpageloaded")
		public void Signup(){
			driver.findElementById("img_tab_bar_profile").click();
			driver.findElementById("lyt_user_image").click();driver.startActivity("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
			
			//driver.findElementByName("Allow").click();
			//driver.startActivity("net.one97.paytm", "net.one97.paytm.landingpage.activity.AJRMainActivity");
			//TouchAction t=new TouchAction(driver);
			//List<AndroidElement> ele=driver.findElementsByName("Allow");
			//t.tap((AndroidElement) ele.get(1)).perform();
			
			//Here we use pressKeyCode instead of SendKeyEvent in java client 4.1 for hardware key events
			//driver.pressKeyCode(AndroidKeyCode.BACK);
			//driver.findElementByXPath("//UIAButton[@name='Allow'").click();
			//driver.startActivity("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
			//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Allow\")").click();
			//driver.findElementByName("Allow").click();
			//driver.startActivity("net.one97.paytm", "net.one97.paytm.landingpage.activity.AJRMainActivity");
			driver.findElementByName("Sign Up").click();
			driver.findElementByName("Mobile").sendKeys("8431039261");
			driver.findElementByName("Email (optional)").sendKeys("becsantosh.das@gmail.com");
			driver.findElementById("edit_password").sendKeys("@password6577");
			driver.findElementByName("Sign Up").click();
			driver.pressKeyCode(AndroidKeyCode.BACK);
		
		
		}
		

BE in Electronics and communication engg with 1.3 years of experience in Testing as Trainee test engineer
in Pole to win India pvt ltd


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

 

public class appmobi
{
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		File appDir=new File("src");
		File app=new File(appDir,"selendroid-test-app-0.15.0(1).apk");
		DesiredCapabilities cap=new DesiredCapabilities();
cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android" );
cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
AndroidDriver driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

List<WebElement> listofelement= driver.findElements(By.className("android.widget.Button"));
int size=listofelement.size();
listofelement.get(6).click();


	}

}
/*







		}



	}









	}



}*/
}
