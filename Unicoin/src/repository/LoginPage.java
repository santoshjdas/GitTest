package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	@FindBy(xpath=".//*[@id='email']")

	   public WebElement LoginUserid;
		
		public WebElement LoginUserid(){
			return LoginUserid;
		}
			
			@FindBy(xpath=".//*[@id='password']")

			   public WebElement LoginUserPassword;
				
				public WebElement LoginUserPassword(){
					return LoginUserPassword;
		}
				
				@FindBy(xpath=".//*[@id='signin_button2']")

				   public WebElement LoginButton;
					
					public WebElement LoginButton(){
						return LoginButton;
			}
}
//.//*[@id='repwd'] .//*[@id='forgotid'] .//*[@id='registermsgid']/b/a  