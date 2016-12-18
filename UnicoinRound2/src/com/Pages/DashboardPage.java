package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends SuperTestNG {
	
	@FindBy(xpath="//a[text()='Vedios']")
	private WebElement vediosmenu;
	
	@FindBy(xpath="//a[text()='Merchants']")
	private WebElement merchantsmenu;
	
	@FindBy(xpath="//a[text()='Resources ']")
	private WebElement resourcesmenu;
	
	@FindBy(xpath="//a[text()='About']")
	private WebElement aboutmenu;
	
	@FindBy(xpath="//a[text()='Support']")
	private WebElement supportmenu;
	
	@FindBy(xpath="//a[text()='SignUp']")
	private WebElement signupmenu;
	
	@FindBy(xpath="//a[text()='SignUp']")
	private WebElement signinmenu;
	
	@FindBy(xpath="//a[text()='FAQs']")
	private WebElement faqssubmenu;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void gotoPage(String menuPage){
		driver.findElement(By.xpath("//*[text()='"+menuPage+"']")).click();
	}
	
	public void gotoPage(String menuPage,String subMenuPage){
			driver.findElement(By.xpath("//*[text()='"+menuPage+"']")).click();
			externalWait(2);
			driver.findElement(By.xpath("//*[text()='"+subMenuPage+"']")).click();
	}
}
