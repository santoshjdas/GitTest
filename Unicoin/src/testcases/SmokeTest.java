package testcases;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import repository.HomePage;
import repository.SignupPage;

public class SmokeTest {
public HomePage hm;
public SignupPage signup;
	WebDriver driver;

	@BeforeTest
	public void Setup(){
		System.setProperty("webdriver.gecko.driver","E:/Java setup/geckodriver-v0.11.1-win64/geckodriver.exe" );
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
		driver.get("https://www.unocoin.com/");
                 
}
	@Test
	public void LaunchedApplication(){
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		Assert.assertEquals("Unocoin | India's Bitcoin Company", pagetitle);
		
		}
	@Test(enabled=true)
	public void VerifyVideosMenu() throws InterruptedException, IOException{
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
	@Test
	public void VerifyVisitDemoPage() throws InterruptedException{
		hm.Merchantlink().click();
		String CurrenturlParent=driver.getCurrentUrl();
	    System.out.println(CurrenturlParent);
		Boolean VisitDemoButtonEnabled =hm.VisitDemoPortal().isEnabled();
		System.out.println(VisitDemoButtonEnabled);
		hm.GetStarted().click();
		//driver.navigate().back();
		driver.findElement(By.xpath(".//*[@id='menubardivid']/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='menubardivid']/ul/li[4]/a")).click();
		hm.Supportlink().click();
		
		//WebElement table=driver.findElement(By.className("grey outerroundedbox"));
		//List<WebElement> NumofRows=table.findElements(By.tagName("tr"));
		//System.out.println(NumofRows.size());
		
		/* String Parent_window=driver.getWindowHandle();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		 while(it.hasNext()){
			 String Child_window=it.next();
			 if(! Parent_window.equalsIgnoreCase(Child_window)){
				driver.switchTo().window(Child_window);
				Thread.sleep(1000);
				String CurrenturlChild=driver.getCurrentUrl();
			    System.out.println(CurrenturlChild);
			    driver.close();
			    }
			    }*/
		 
	}
	/*@Test
	public void VerifySupportpage() throws InterruptedException{
		Thread.sleep(9000);
		
		/*hm.YourMailidForSupport().sendKeys("dsantosh.das@gmail.com");
		hm.Subject().sendKeys("Testing");
		hm.SupportMsg().sendKeys("Testinggggggg");
		WebElement table=driver.findElement(By.className("grey outerroundedbox"));
		List<WebElement> NumofRows=table.findElements(By.tagName("tr"));
		System.out.println(NumofRows.size());
		
	}*/
	@Test
	public void signup() throws InterruptedException{
		Thread.sleep(9000);
		signup.Signuplink().click();
		signup.SignupEmailId().sendKeys("dsantosh.das@gmail.com");
		signup.SignupPassword().sendKeys("S12345678");
		//signup.CouponCode().click();
		//signup.CouponCode().sendKeys("xyz");
	int number=CapchaFrameswitch(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
	driver.switchTo().frame(number);
	driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
	
		Thread.sleep(9000);
		
		signup.signupButton().click();
		
	
	}
	public  int CapchaFrameswitch(WebDriver driver,By by){
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
	}
}
