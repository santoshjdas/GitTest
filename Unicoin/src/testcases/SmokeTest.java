package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import repository.HomePage;
import repository.LoginPage;
import repository.SignupPage;

public class SmokeTest {
public HomePage hm;
public SignupPage signup;
public LoginPage LoginPg;
	WebDriver driver;

	@BeforeTest
	public void Setup() throws IOException{
		Properties prop=new Properties();
		FileInputStream fls=new FileInputStream("C:\\Users\\santosh\\Desktop\\GitEclipse\\Unicoin\\src\\testcases\\datadriven.properties");
		prop.load(fls);
		if(prop.getProperty("Browser").equals("Firefox")){
			System.setProperty("webdriver.gecko.driver","E:/Java setup/geckodriver-v0.11.1-win64/geckodriver.exe" );
			driver = new FirefoxDriver();
		}
		else if(prop.getProperty("Browser").equals("Chrome")){
			System.setProperty("", "");
			driver = new ChromeDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
                 
}
	@Test
	public void LaunchedApplication(){
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		Assert.assertEquals("Unocoin | India's Bitcoin Company", pagetitle);
		
		}
	@Test(enabled=false)
	public void VerifyVideosMenu() throws InterruptedException, IOException{
	//	.//*[@id='email']
		
		hm=new HomePage(driver); 
		//Actions acn=new Actions(driver);  
		// ele=
		hm.Videos().click();
		Thread.sleep(9000);
		
		hm.EnglishVideolink().click();
		hm.EnglishVideoForRegister().click();
		Thread.sleep(9000);
		File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("D:\\Screenshots\\ScrShotRegister.jpg"));
		hm.EnglishVideoForBuy().click();
		Thread.sleep(9000);
		File sourceFile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("D:\\Screenshots\\ScrShotBuy.jpg"));
		hm.EnglishVideoForSell().click();
		Thread.sleep(9000);
		File sourceFile3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("D:\\Screenshots\\scrSell.jpg"));
		hm.EnglishVideoForBTC().click();
		Thread.sleep(9000);
		File sourceFile4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("D:\\Screenshots\\ScrShotBTC.jpg"));
		hm.EnglishVideoForINR().click();
	    Thread.sleep(9000);
	    hm.Bengalilink().click();
	    hm.BengaliRegisterVideo().click();
	    Thread.sleep(9000);
	    String Currenturl=driver.getCurrentUrl();
	    System.out.println(Currenturl);
	    hm.WhatIsBitCoinVideo().click();
	    Thread.sleep(9000);
	    String Currenturl1=driver.getCurrentUrl();
	    System.out.println(Currenturl1);
		 
	}
	@Test(enabled=false)
	public void VerifyVisitDemoPage() throws InterruptedException{
		hm.Merchantlink().click();
		String CurrenturlParent=driver.getCurrentUrl();
	    System.out.println(CurrenturlParent);
		Boolean VisitDemoButtonEnabled =hm.VisitDemoPortal().isEnabled();
		/*
		 
		String Parent_window=driver.getWindowHandle();
		hm.VisitDemoPortal.click();
		System.out.println(VisitDemoButtonEnabled);
		Set<String> strHandles=driver.getWindowHandles();
		for(String handle:strHandles)
		{
			driver.switchTo().window(handle);
			String strTitle=driver.getTitle();
			if( strTitle.equalsIgnoreCase("A Book Apart, Brief books for people who makes websites")){
					
					
				String urlchild=	driver.getCurrentUrl();
				   System.out.println(urlchild); 
				    }
		
		} 
		 */
		
		
		
		
		
		
	
		hm.GetStarted().click();
		//driver.navigate().back();
		
		hm.Resourcesbtn().click();
		hm.Supportlink().click();
		
		/*System.out.println(driver.getPageSource());

		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		//driver.switchTo().frame("");
		driver.findElement(By.className("required email")).sendKeys("Test");
		
	}
		
		
		WebElement table=driver.findElement(By.className("grey outerroundedbox"));
		List<WebElement> NumofRows=table.findElements(By.tagName("tr"));
		System.out.println(NumofRows.size());
		
		String Parent_window=driver.getWindowHandle();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		 while(it.hasNext()){
			 String Child_window=it.next();
			 if( Parent_window.equalsIgnoreCase(Child_window)){
				driver.switchTo().window(Child_window);
				Thread.sleep(1000);
				String CurrenturlChild=driver.getCurrentUrl();
			    System.out.println(CurrenturlChild);
			    driver.close();
			    }
			    }
		 
	}
	@Test
	public void VerifySupportpage() throws InterruptedException{
		Thread.sleep(9000);
		
		hm.YourMailidForSupport().sendKeys("dsantosh.das@gmail.com");
		hm.Subject().sendKeys("Testing");
		hm.SupportMsg().sendKeys("Testinggggggg");
		WebElement table=driver.findElement(By.className("grey outerroundedbox"));
		List<WebElement> NumofRows=table.findElements(By.tagName("tr"));
		System.out.println(NumofRows.size());
		
	}*/
	}
	@Test
	public void signupclick() throws InterruptedException{
		signup=new SignupPage(driver);
		signup.Signuplink().click();
		Thread.sleep(6000);
	}
	@Test(dependsOnMethods="signupclick")
	public void signupNegativeScenariosTest() throws InterruptedException, IOException{
		Properties prop=new Properties();
		FileInputStream flss=new FileInputStream("C:\\Users\\santosh\\Desktop\\GitEclipse\\Unicoin\\src\\testcases\\datadriven.properties");
		prop.load(flss);
		signup=new SignupPage(driver);
		
		//for invalid password
		signup.SignupEmailId.sendKeys(prop.getProperty("RegValidUserid"));
		//signup.SignupEmailId().sendKeys("dsantosh.das@gmail.com");
		signup.SignupPassword().sendKeys(prop.getProperty("InvalidPassword"));
		Thread.sleep(30000);
		signup.signupButton().click();
		Thread.sleep(6000);
		String signuperr=	signup.signupError.getText();
	    System.out.println(signuperr);
		signup.signupErrOKButton.click();
		signup.SignupEmailId.clear();
		signup.SignupEmailId.sendKeys(prop.getProperty("InValidUserid"));
		//signup.SignupEmailId().sendKeys("dsantosh.das@gmail.com");
		signup.SignupPassword.clear();
		Thread.sleep(2000);
		signup.SignupPassword().sendKeys(prop.getProperty("validPassword"));
		Thread.sleep(30000);
		signup.signupButton().click();
		Thread.sleep(6000);
		String signuperr1=	signup.signupError.getText();
	    System.out.println(signuperr1);
		signup.signupErrOKButton.click();
		
		signup.SignupEmailId.clear();
		signup.SignupEmailId.sendKeys(prop.getProperty("RegValidUserid"));
		//signup.SignupEmailId().sendKeys("dsantosh.das@gmail.com");
		signup.SignupPassword.clear();
		Thread.sleep(2000);
		signup.SignupPassword().sendKeys(prop.getProperty("WeakPassword"));
	Thread.sleep(30000);
		signup.signupButton().click();
		Thread.sleep(6000);
		String signuperr2=	signup.signupError.getText();
	    System.out.println(signuperr2);
		signup.signupErrOKButton.click();
		
		signup.SignupEmailId.clear();
		signup.SignupEmailId.sendKeys(prop.getProperty("RegValidUserid"));
		//signup.SignupEmailId().sendKeys("dsantosh.das@gmail.com");
		Thread.sleep(2000);
		signup.SignupPassword.clear();
		signup.SignupPassword().sendKeys(prop.getProperty("RegValidPassword"));
		Thread.sleep(30000);
		signup.signupButton().click();
		Thread.sleep(4000);
	//	String signuperr3=	signup.signupError.getText();
	 //   System.out.println(signuperr3);
		signup.signupErrOKButton.click();
		Thread.sleep(4000);
		
	
	
		
		/*signup.SignupEmailId.clear();
		signup.SignupEmailId.sendKeys(prop.getProperty("RegValidUserid"));
		//signup.SignupEmailId().sendKeys("dsantosh.das@gmail.com");
		Thread.sleep(2000);
		signup.SignupPassword.clear();
		signup.SignupPassword().sendKeys(prop.getProperty("ValidPassword"));
		Thread.sleep(30000);
		signup.signupButton().click();
		Thread.sleep(6000);
		String signuperr5=	signup.signupError.getText();
	    System.out.println(signuperr5);
		signup.signupErrOKButton.click();*/
	
	
		
		//signup.CouponCode().click();
		//signup.CouponCode().sendKeys("xyz");
	/*int number=CapchaFrameswitch(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
	driver.switchTo().frame(number);
	driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
	
		Thread.sleep(9000);
		
		*/
		
	
	

	//private void While(boolean contains) {
		// TODO Auto-generated method stub
		
	}
	@Test(dependsOnMethods="signupNegativeScenariosTest")
	public void RegUserSignup() throws IOException, InterruptedException{
		Properties prop=new Properties();
		FileInputStream fls1=new FileInputStream("C:\\Users\\santosh\\Desktop\\GitEclipse\\Unicoin\\src\\testcases\\datadriven.properties");
		prop.load(fls1);
	    signup=new SignupPage(driver);
		signup.SignupEmailId.clear();
		signup.SignupEmailId.sendKeys(prop.getProperty("RegValidUserid"));
		//signup.SignupEmailId().sendKeys("becsantosh.das@gmail.com");
		//Thread.sleep(2000);
		signup.SignupPassword.clear();
		signup.SignupPassword().sendKeys(prop.getProperty("ValidPassword"));
		Thread.sleep(30000);
		signup.signupButton().click();
		Thread.sleep(6000);
		String signupmsg=	signup.signupError.getText();
	    System.out.println(signupmsg);
		signup.signupErrOKButton.click();
		Thread.sleep(4000);
		}
	
	@Test(dependsOnMethods="RegUserSignup")
	public void LoginTestForReguser() throws IOException, InterruptedException{
		Properties prop=new Properties();
		FileInputStream fls2=new FileInputStream("C:\\Users\\santosh\\Desktop\\GitEclipse\\Unicoin\\src\\testcases\\datadriven.properties");
		prop.load(fls2);
		LoginPg=new LoginPage(driver);
		LoginPg.LoginUserid.sendKeys(prop.getProperty("RegValidUserid"));
		LoginPg.LoginUserPassword.sendKeys(prop.getProperty("InValidPassword"));
		LoginPg.LoginButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='warningok']")).click();
		Thread.sleep(3000);
		LoginPg.LoginUserPassword.clear();
		LoginPg.LoginUserPassword.sendKeys(prop.getProperty("ValidPassword"));
		LoginPg.LoginButton.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='logout2']")).click();
		
	
	}
	@Test(dependsOnMethods="LoginTestForReguser")
	public void signup() throws IOException, InterruptedException{
		Properties prop=new Properties();
		FileInputStream flsl=new FileInputStream("C:\\Users\\santosh\\Desktop\\GitEclipse\\Unicoin\\src\\testcases\\datadriven.properties");
		prop.load(flsl);
		signup=new SignupPage(driver);
	signup.Signuplink.click();
		//	signup.SignupEmailId.clear();
		Thread.sleep(4000);
		signup.SignupEmailId.sendKeys(prop.getProperty("NewValidUserid"));
		//signup.SignupEmailId().sendKeys("becsantosh.das@gmail.com");
		//Thread.sleep(2000);
		//signup.SignupPassword.clear();
		signup.SignupPassword().sendKeys(prop.getProperty("ValidPassword"));
		Thread.sleep(30000);
		signup.signupButton().click();
		Thread.sleep(60000);
		LoginPg=new LoginPage(driver);
		LoginPg.LoginUserid.sendKeys(prop.getProperty("NewValidUserid"));
		LoginPg.LoginUserPassword.sendKeys(prop.getProperty("InValidPassword"));
		LoginPg.LoginButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='warningok']")).click();
		Thread.sleep(3000);
		LoginPg.LoginUserPassword.clear();
		LoginPg.LoginUserPassword.sendKeys(prop.getProperty("ValidPassword"));
		LoginPg.LoginButton.click();
	}
	
	/* public  int CapchaFrameswitch(WebDriver driver,By by){
		int i;
		int count=driver.findElements(By.tagName("iframe")).size();
		for( i=0;i<count;i++)
		{
			driver.switchTo().frame(i);
		int ccount	=driver.findElements(by).size();
		if(ccount>0)
		{
			driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
			break;
		}
		else
		{
			System.out.println("Continue loop");
		}
		}
		driver.switchTo().defaultContent();
		return i;
	} */
	 
}

