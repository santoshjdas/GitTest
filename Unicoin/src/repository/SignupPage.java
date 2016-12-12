package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	//
	WebDriver driver;

	public SignupPage(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	@FindBy(xpath=".//*[@id='menubardivid']/ul/li[7]/a/b")

   public WebElement Signuplink;
	
	public WebElement Signuplink(){
		return Signuplink;
	}
	
	@FindBy(xpath=".//*[@id='email']")

   public WebElement SignupEmailId;
	
	public WebElement SignupEmailId(){
		return SignupEmailId;
	}
	@FindBy(xpath=".//*[@id='password']")

  public  WebElement SignupPassword;
	
	public WebElement SignupPassword(){
		return SignupPassword;
	}
	//
	@FindBy(xpath=".//*[@id='couponval']")

  public  WebElement CouponCode;
	
	public WebElement CouponCode(){
		return CouponCode;
		
	}
	@FindBy(xpath=".//*[@id='signin_button1']")

  public  WebElement signupButton;
	
	public WebElement signupButton(){
		return signupButton;
		
	}
	@FindBy(xpath=".//*[@id='myModalLabel']")
public  WebElement signupError;
	
	public WebElement signupError(){
		return signupError;
		
	}
	@FindBy(xpath=".//*[@id='registerok']")
	public  WebElement signupErrOKButton;
	public WebElement signupErrOKButton(){
		return signupErrOKButton;
}
		
}		
