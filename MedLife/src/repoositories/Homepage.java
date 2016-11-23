package repoositories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Homepage {
	public Homepage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	  
	//@AndroidFindBy(id="appHeader")
	//public WebElement GETSTARTED;
	//
	@AndroidFindBy(uiAutomator=("new UiSelector().description(\"Sign in/Sign up to view your order details\")"))
	public WebElement Signinsignup;
	//
	//@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"New here? Register with us\"]/preceding::android.view.View[4]/")
	//public WebElement Register ;
	
	@AndroidFindBy(xpath=("//android.widget.Button[contains(@content-desc,'New here? Register with us') and @index='0']"))
	public WebElement Regester;//userMobile
	
	@AndroidFindBy(xpath=("//android.view.View[contains(@content-desc,'Let's start by verifying your mobile number.') and @index='0']"))
	public WebElement VerifyTextDisplayed;//userMobile
	
	@AndroidFindBy(xpath=("//android.widget.EditText[contains(@content-desc,'Enter your mobile number') and @index='0']"))
	public WebElement MobileNumForReg;

	@AndroidFindBy(xpath=("//android.widget.Button[contains(@content-desc,'Ok') and @index='0']"))
	public WebElement RegOKButton;
	
	//@AndroidFindBy(xpath="//android.widget.EditText[@resource-id=\"userMobile\"]/preceding::android.view.View[1]")
	//public WebElement MobileNumberForReg ;

	//@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Ok\"]/preceding::android.view.View[0]")
	//public WebElement VerificationOKButton ;
	//xpath("//android.widget.Button[contains(@resource-id,'digit5')]")
	//xpath("//android.widget.Button[contains(@resource-id,'digit5') and @text='5']")
	
	@AndroidFindBy(uiAutomator=("new UiSelector().description(\"Enter your mobile number\")"))
	public WebElement MobileNum;
	//List <WebElement> Login;
	@AndroidFindBy(uiAutomator=("new UiSelector().description(\"\")"))
	public WebElement OK;
	
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
}
