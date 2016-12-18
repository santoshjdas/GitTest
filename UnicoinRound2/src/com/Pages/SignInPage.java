package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends SuperTestNG {
	
	
	public SignInPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void verifySignInPageValidationText(String validationText)
	{
		try{
			String fieldText= driver.findElement(By.id("warnload")).getText();
			if (fieldText.equals(validationText)){
				System.out.println("Correct Validation Text is displayed");
			}else System.out.println("Incorrect Validation Text is displayed");

		}catch(Exception e){
			System.out.println("exception in verifySignInPageValidationText  is"+e);
		}
	}
	
	
	public void verifyMaximumTextinTextbox(int maxTextSize,String fieldId)
	{
		try{
			if (maxTextSize==getEnteredText(fieldId).length()){
				System.out.println("Maximum limit matches");
			}else System.out.println("Maximum limit does not matches");

		}catch(Exception e){
			System.out.println("exception in verifyMaximumTextinTextbox  is"+e);
		}
	}
	
	public void verifyPasswordIsInAsterisks(String password)
	{
		String passwordText=getEnteredText("password");
		int count=0;
		for (int i=0;i<password.length()-1;i++)
		{
			if (passwordText.charAt(i)=='*')
			{
				count=count+1;
			}
		}
		
		if(count==password.length()){
			System.out.println("Entered password is displayed in Asterisks");
		}else System.out.println("Entered password is not displayed in Asterisks");
	}
	
	public void verifyEnteredPasswordMaches(String password)
	{
		String passwordText=getEnteredText("password");
		int count=0;
		for (int i=0;i<password.length()-1;i++)
		{
			if (passwordText.charAt(i)=='*')
			{
				count=count+1;
			}
		}
		
		if(count==password.length()){
			System.out.println("Entered password is same as input Password");
		}else System.out.println("Entered password is not same as input Password");
	}
	
	public void verifyValidationTextForUsername(String validationText)
	{
		 String valText =driver.findElement(By.xpath("//input[@id='email']/label")).getText();
		 
		 if (valText.equals(validationText))
		 {
			 System.out.println("Entered value text is matches");
		 }else{
			 System.out.println("Entered value text is does not matches");
		 }
	}
	
	public void verifyPageTitle(String titleText)
	{
		String title=driver.getTitle();
		
		if (title.equals(titleText))
		{
			System.out.println("Mentioned title matches");
		}else{
			System.out.println("Mentioned title matches");
		}
	}
	

	public void clickRegisterNowLink()
	{
		driver.findElement(By.xpath("//font[@id='registermsgid']/b")).click();
	}
	
	public void verifyFieldTextForFieldId(String fieldId, String fieldText)
	{
		if(driver.findElement(By.id(fieldId)).getText().equals(fieldText))
		{
			System.out.println("Mentioned fieldtext is matching");
		}else System.out.println("Mentioned fieldtext is not matching");
	}
	
	

}
