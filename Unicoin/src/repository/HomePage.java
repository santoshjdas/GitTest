package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	  WebDriver driver;

	public HomePage(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);

	    }
	@FindBy(xpath=".//*[@id='menubardivid']/ul/li[1]/a")

  public  WebElement Videos;
	
	public WebElement Videos(){
		return Videos;
	}
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[1]/a")

   public WebElement EnglishVideoslink;
	
	public WebElement EnglishVideolink(){
		return EnglishVideoslink;
	}
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[1]/ul/li[1]/a/span")

   public WebElement EnglishVideoForRegister;
	
	public WebElement EnglishVideoForRegister(){
		return EnglishVideoForRegister;
	}
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[1]/ul/li[2]/a/span")

	public WebElement EnglishVideoForBuy;
	
	public WebElement EnglishVideoForBuy(){
		return EnglishVideoForBuy;
	}
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[1]/ul/li[3]/a/span")

	public WebElement EnglishVideoForSell;
	
	public WebElement EnglishVideoForSell(){
		return EnglishVideoForSell;
	}
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[1]/ul/li[4]/a/span")

	public WebElement EnglishVideoForBTC;
	
	public WebElement EnglishVideoForBTC(){
		return EnglishVideoForBTC;
	}
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[1]/ul/li[5]/a/span")

   public WebElement EnglishVideoForINR;
	
	public WebElement EnglishVideoForINR(){
		return EnglishVideoForINR;
	}
	
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[8]/a/span[1]")

   public WebElement Bengalilink;
	
	public WebElement Bengalilink(){
		return Bengalilink;
	}
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[8]/ul/li[1]/a/span")

	public WebElement BengaliRegisterVideo;
	
	public WebElement BengaliRegisterVideo(){
		return BengaliRegisterVideo;
	}
	
	@FindBy(xpath=".//*[@id='sidebar']/ul/li[8]/ul/li[7]/a/span")

	public WebElement WhatIsBitCoinVideo;
	
	public WebElement WhatIsBitCoinVideo(){
		return WhatIsBitCoinVideo;
	}
	
	@FindBy(xpath=".//*[@id='menubardivid']/ul/li[2]/a")

	public WebElement Merchantlink;
	
	public WebElement Merchantlink(){
		return Merchantlink;
	}
	
	@FindBy(xpath="html/body/div[2]/div/div[1]/p[3]/a")

	public WebElement VisitDemoPortal;
	
	public WebElement VisitDemoPortal(){
		return VisitDemoPortal;
	}
	
	@FindBy(xpath="html/body/div[4]/div[2]/div[2]/a")

	public WebElement GetStarted;
	
	public WebElement GetStarted(){
		return GetStarted;
	}
	//
	@FindBy(xpath=".//*[@id='home']/section[2]/ul/li[1]/a/span")

    WebElement BuyBookDesignIsJob;
	
	public WebElement BuyBookDesignIsJob(){
		return BuyBookDesignIsJob;
	}

	@FindBy(xpath=".//*[@id='menubardivid']/ul/li[5]/a")   

	public WebElement Supportlink;
	
	public WebElement Supportlink(){
		return Supportlink;
	}
	@FindBy(xpath=".//*[@id='Email']")

	public WebElement YourMailidForSupport;
	
	public WebElement YourMailidForSupport(){
		return YourMailidForSupport;
	}
	@FindBy(xpath=".//*[@id='Subject']")

	public WebElement Subject;
	
	public WebElement Subject(){
		return Subject;
	}
	@FindBy(xpath=".//*[@id='placeholderspan']")

	public WebElement SupportMsg;
	
	public WebElement SupportMsg(){
		return SupportMsg;
	}
	
	//
	
	@FindBy(xpath=".//*[@id='menubardivid']/ul/li[3]/a")

	public WebElement Resourcesbtn;
	
	public WebElement Resourcesbtn(){
		return Resourcesbtn;
	}
	@FindBy(xpath=".//*[@id='menubardivid']/ul/li[3]/ul/li[1]/a")

   public WebElement HowItWorks;
	
	public WebElement HowItWorks(){
		return HowItWorks;
	}
	//
}
