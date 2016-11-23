package repoositories;

public class FourpointonceClient {
/*
 * package TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import repositories.HomePagerepo;
import repositories.LoginSignupRepo;

public class smokeTest {
	AndroidDriver<AndroidElement> driver;
	 
	//
	@BeforeClass
	public void Install() throws MalformedURLException{
	 //File AppDir =new File("C:/Users/santosh/Desktop");
	// File App=new File(AppDir,"NikiApp_com.nikiapp.apk");

	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID );
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"A001" );
	//cap.setCapability(MobileCapabilityType.APP,App.getAbsolutePath());
	cap.setCapability("appPackage", "net.one97.paytm");
	cap.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
	
	driver =new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
}
	@Test
	public void VerifyWallet( ) throws InterruptedException{
		HomePagerepo repo1=new HomePagerepo( driver);
		repo1.Pay_or_Send.click();
		repo1.Login.click();
		repo1.Goback.click();
		Thread.sleep(2000);
		repo1.Sign_Up.click();
		repo1.Goback.click();
		repo1.Goback.click();
		Thread.sleep(2000);
		
		
		//LoginSignupRepo repo2=new LoginSignupRepo(driver);
		//repo2.
	}
	@Test(dependsOnMethods="VerifyWallet")
	public void MobileRecharge() throws InterruptedException{
		HomePagerepo repo1=new HomePagerepo( driver);
		repo1.Mobile.click();
		repo1.PinContact.click();
		Thread.sleep(2000);
		//((StartsActivity) driver).startActivity("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
		repo1.ContactSearch.click();
		repo1.EnterContact.sendKeys("bad");
		repo1.SelectContact.click();
		repo1.ClickProceedToRecharge.click();
		
	}
	
	}	
	
	Repositories.............................................................................................................................................

package repositories;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePagerepo {
	


	public HomePagerepo(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	  
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"Pay or Send\")"))
	public WebElement Pay_or_Send;
	//
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"Request\")"))
	public WebElement Request;
	//
	//@AndroidFindBy(uiAutomator=("new UiSelector().decription(\"Navigate up\")"))
	@AndroidFindBy(accessibility="Navigate up")
	public WebElement Goback;
	
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"Login\")"))
	public WebElement Login;
	//List <WebElement> Login;
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"Sign Up\")"))
	public WebElement Sign_Up;
	
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"Mobile Prepaid\")"))
	public WebElement Mobile;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='net.one97.paytm:id/contact_picker']")
	public WebElement PinContact;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.android.contacts:id/menu_search']")
	public WebElement ContactSearch;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='android:id/search_src_text']")
	public WebElement EnterContact;   
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Baddi Manju']")
	public WebElement SelectContact;
	
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"Proceed to Recharge\")"))
	public WebElement ClickProceedToRecharge;
	
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"Please Enter the Amount\")"))
	public WebElement Verify_PleaseEnterAmountDisplayed;
	
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"OK\")"))
	public WebElement ClickOK;
	
	
}
Repository 2.........................................................................................................................................................
package repositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginSignupRepo {



	public LoginSignupRepo(AndroidDriver<AndroidElement> driver) {
	
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	  
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"Pay or Send\")"))
	public WebElement Pay_or_Send;
	//
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"Request\")"))
	public WebElement Request;
	//
	@AndroidFindBy(uiAutomator=("new UiSelector().decription(\"Navigate up\")"))
	public WebElement Goback;
	
	@AndroidFindBy(uiAutomator=("new UiSelector().text(\"Navigate up\")"))
	public WebElement Login;
	
}


 */
}
