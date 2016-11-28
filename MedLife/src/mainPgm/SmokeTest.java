package mainPgm;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import repoositories.Homepage;

public class SmokeTest {
	AndroidDriver<AndroidElement> driver;
	static String encodedPassword="cXdlcnR5MTIz";
	
	
	@Test
	public void Install() throws MalformedURLException, InterruptedException{
	 //File AppDir =new File("C:/Users/santosh/Desktop");
	// File App=new File(AppDir,"");
		 File AppDir =new File("C:/App");
		 File App=new File(AppDir,"base.apk");

	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID );
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"A001" );
	cap.setCapability(MobileCapabilityType.APP,App.getAbsolutePath());
	
	//cap.setCapability("appPackage", "net.one97.paytm");
	//cap.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "5000");
	
	driver =new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	Thread.sleep(5000);
	System.out.println(driver.getContextHandles());
}
	@Test
	public void getStarted() throws InterruptedException{
		//driver.findElementByXPath("//com.medlife.customer[@class='android.widget.Button'").click();
		
		Homepage pg=new Homepage(driver);
		//AndroidElement header=driver.findElementById("appHeader");
		TouchAction acn1 =new TouchAction(driver);
		acn1.tap(587, 1754).perform();
		Thread.sleep(2000);
		TouchAction acn2 =new TouchAction(driver);
		//acn.tap(header);
		acn2.tap(130, 181).perform();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.startActivity("com.UCMobile.int1", "com.uc.browser.InnerUCMobile");
		System.out.println(driver.getContextHandles());
		TouchAction acn3 =new TouchAction(driver);
		acn3.tap(305, 810).perform();
		
		Thread.sleep(2000);
		//driver.startActivity("com.UCMobile.int1", "com.uc.browser.InnerUCMobile");
		System.out.println(driver.getContextHandles());
		Set <String> Str=driver.getContextHandles();
		for(String handle: Str){
			System.out.println(handle);
		}
		
		
		//TouchAction acn4 =new TouchAction(driver);
	//	acn4.tap(296, 662).perform();
		//pg.Signinsignup.click();
	Thread.sleep(5000);
	//TouchAction acn2 =new TouchAction(driver);
	//acn.tap(598, 593).perform();
		//driver.hideKeyboard();
	pg.Regester.click();
	Thread.sleep(4000);
	String s="ssss";
		//pg.MobileNum.sendKeys(getEncodedPassword());
	pg.MobileNumForReg.sendKeys("8431039261");
	pg.RegOKButton.click();
	Thread.sleep(15000);
	pg.OTPEnteredConfirmButton.click();
	
	
	
		
		
	//	driver.findElementByAccessibilityId("Sign in/Sign up to view your order details").click();
		
	// Assert.assertEquals("Sign in/Sign up to view your order details", txt);
		//Sign in/Sign up to view your order details
		//pg.MyOrders.click();
		//driver.findElementByAccessibilityId("  My orders").click();
		//int ele=driver.findElementsByClassName("android.view.View").size();
//System.out.println(ele);
//List<AndroidElement> elee=driver.findElementsByName("android.view.View");
//elee.get(1).click();

	}
	@Test//(dependsOnMethods="getStarted")
	public void Registration(){
		Homepage pg=new Homepage(driver);
		//Boolean bl=pg.VerifyTextDisplayed.isEnabled();
		//pg.MobileNumForReg.sendKeys("8431039261");
		//pg.RegOKButton.click();
	}
	public static String getEncodedPassword(){
		String decodedPassword=new String (Base64.getDecoder().decode(encodedPassword.getBytes()));
		return decodedPassword;
	}
}
