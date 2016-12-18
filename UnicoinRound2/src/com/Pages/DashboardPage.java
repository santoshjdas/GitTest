package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends SuperTestNG {
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void gotoPage(String menuPage){
		if (menuPage.equalsIgnoreCase("Sign Up")){
		driver.findElement(By.xpath("//a[text()='SignUp']")).click();
		}else if(menuPage.equalsIgnoreCase("Sign Up")){
			driver.findElement(By.xpath("//a[text()='SignIn']")).click();
		}
	}
}
