package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class SuperTestNG {

	public WebDriver driver;
	
//	@BeforeSuite
//	public void beforesuitemethod ()
//	{
//		driver.get("https://www.unocoin.com");
//	}
	
	@BeforeSuite
	public void Launch(){
		driver=new FirefoxDriver();
		driver.get("https://www.unocoin.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
	}
	@AfterSuite
	public void ExitApplication() {
		driver.quit();
	}
	
	public void externalWait(int timeInSec){
		try{
			Thread.sleep(timeInSec*1000);	
		}catch(Exception e){
			
		}
	}
	
	//This method is used to enter text for text field, Pass the field Id and Text to be entered
	public void enterFieldText(String fieldId, String fieldText)
	{
		try{
			driver.findElement(By.id(fieldId)).sendKeys(fieldText);
		}catch(Exception e){
			System.out.println("exception in enterFieldText  is"+e);
		}
	}
	
	//This method is used to click a button, pass buttonId
	public void clickButton(String buttonId)
	{
		try{
			driver.findElement(By.id(buttonId)).click();
		}catch(Exception e){
			System.out.println("exception in clickButtom  is"+e);
		}
	}
	
	//This method is used to clear the text field, pass text field Id
	public void clearText(String fieldId)
	{
		try{
			driver.findElement(By.id(fieldId)).clear();
		}catch(Exception e){
			System.out.println("exception in clearTexts  is"+e);
		}
	}
	
	//This method is used to get entered text from a textbox, pass textbox field id
	public String getEnteredText(String fieldId)
	{
		try{
			return(driver.findElement(By.id(fieldId)).getAttribute("value"));
		}catch(Exception e){
			System.out.println("exception in clickButtom  is"+e);
			return null;
		}
	}
	
	//This method is used to verify the mentioned field is present based on its id, Pass fieldId to verify field is present
	public void verifyFieldIsPresent(String fieldId)
	{
		try{
			if (driver.findElement(By.id(fieldId)).isDisplayed()){
				System.out.println("Field with Id"+fieldId+"is present in the page");
			}else System.out.println("Field with Id"+fieldId+"is not present in the page");
		}catch(Exception e){
			System.out.println("exception in fieldIsPresent  is"+e);
		}
	}
	
	//This method is used to verify the textbox field is cleared, pass the textbox fieldId to verify it is cleared 
	public void verifyFieldTextIsCleared(String fieldId)
	{
		try{
			String fieldText= driver.findElement(By.id(fieldId)).getText();
			if (fieldText.isEmpty()){
				System.out.println("field is cleared");
			}else System.out.println("field is not cleared");

		}catch(Exception e){
			System.out.println("exception in verifyFieldTextIsCleared  is"+e);
		}
	}

}
