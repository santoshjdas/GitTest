package com.TestCases;

import org.testng.annotations.Test;
import com.Pages.DashboardPage;
import com.Pages.SignUpPage;
import com.Pages.SuperTestNG;

public class TC01_SignUpPageTest extends SuperTestNG{

	@Test
	private void NavigateToSignUpPage(){
		DashboardPage dp=new DashboardPage(driver);
		dp.gotoPage("Sign Up");
	}
	
	@Test
	private void TC01_ToVerifyFieldsArePresent(){
		SignUpPage sup=new SignUpPage(driver);
		sup.verifyFieldIsPresent("email");
		sup.verifyFieldIsPresent("password");	
	}
	
	@Test
	private void TC02_VerifyMandoryfieldsHavingAsterisks(){
		SignUpPage sup=new SignUpPage(driver);
		sup.verifyMandatoryField("email");
	}
	
	@Test
	private void TC03_VerfyingEnteredDataInDatabase(){
		SignUpPage sup=new SignUpPage(driver);
		sup.verifyfieldPresentInDatabase("UserNameColumnName", "Test@Test.com");
	}
	
	@Test
	private void TC04_VerifyfieldsAreReset(){
		SignUpPage sup=new SignUpPage(driver);
		sup.enterFieldText("email", "test@test.com");
		sup.enterFieldText("password", "Test@1234");
		sup.clickButton("resetBtn");
		sup.verifyFieldTextIsCleared("email");
		sup.verifyFieldTextIsCleared("password");
	}
	
	@Test
	private void TC05_VerifyTheFieldSizeIndatabase(){
		SignUpPage sup=new SignUpPage(driver);
		sup.enterFieldText("email", "test@test.com");
		sup.enterFieldText("password", "Test@1234");
		sup.clickButton("signin_button1");
		sup.verifyfieldSizeInDatabase("UserNameColumnName", "test@test.", 10);
	}
	
	@Test
	private void TC06_VerifyingValidationMessagesForBlanKManadatoryFields(){
		SignUpPage sup=new SignUpPage(driver);
		sup.enterFieldText("email", "test@test.com");
		externalWait(30);
		sup.clickButton("signin_button1");
		externalWait(2);
		sup.verifySignUpPageValidationText("Missing email or password");
		sup.clickButton("registerok");
		externalWait(2);
		sup.clearText("email");
		sup.enterFieldText("password", "Test@1234");
		externalWait(30);
		sup.clickButton("signin_button1");
		externalWait(2);
		sup.verifySignUpPageValidationText("Missing email or password");
		sup.clickButton("registerok");
		externalWait(2);
		sup.enterFieldText("email", "test@test.com");
		sup.enterFieldText("password", "Test@1234");
		externalWait(30);
		sup.clickButton("signin_button1");
		externalWait(2);
		sup.verifySignUpPageValidationText("Please check the captcha form.");
	}
	
	@Test
	private void TC07_UserIsAbleToCreateAccountWithoutEnteringNonMandatoryFields(){
		SignUpPage sup=new SignUpPage(driver);
		sup.enterFieldText("email", "test@test.com");
		sup.enterFieldText("password", "Test@1234");
		externalWait(30);
		sup.clickButton("signin_button1");
		externalWait(2);
		sup.verifySignUpPageValidationText("Thank you. Confirm your registration by clicking on the link sent to your email. Please check your spam folder if this email does not reach your inbox with in next 3 minutes.");
		externalWait(2);
		sup.clickButton("registerok");
	}
	
	@Test
	private void TC08_ToCheckUpperLimitOfField(){
		SignUpPage sup=new SignUpPage(driver);
		sup.enterFieldText("email", "test@test.com");
		sup.verifyEnteredFieldText("email", "Test@test.");
		sup.enterFieldText("password", "Test@123456");
		sup.verifyEnteredFieldText("password", "Test@12345");
	}
	
	@Test
	private void TC09_ToValidateEmailAddress(){
		SignUpPage sup=new SignUpPage(driver);
		sup.enterFieldText("email", "testTest.com");
		sup.enterFieldText("password", "Test@1234");
		externalWait(30);
		sup.clickButton("signin_button1");
		externalWait(2);
		sup.verifySignUpPageValidationText("Invalid email address");
		sup.clickButton("registerok");
		
		sup.enterFieldText("email", "test@Testcom");
		sup.enterFieldText("password", "Test@1234");
		externalWait(30);
		sup.clickButton("signin_button1");
		externalWait(2);
		sup.verifySignUpPageValidationText("Invalid email address");
		sup.clickButton("registerok");
	}

	@Test
	private void TC10_ToValidatePassword(){
		
		SignUpPage sup=new SignUpPage(driver);
		sup.enterFieldText("email", "test@Test.com");
		sup.enterFieldText("password", "Testing@");
		externalWait(30);
		sup.clickButton("signin_button1");
		externalWait(2);
		sup.verifySignUpPageValidationText("Password should contain atleast 1 number. # and & are not allowed in passwords.");
		sup.clickButton("registerok");

	}
	
	@Test
	private void TC11_ToTrimTheEnteredText(){
		
		SignUpPage sup=new SignUpPage(driver);
		sup.enterFieldText("email", "    test@Test.com    ");
		sup.enterFieldText("password", "   Testing@123   ");
		sup.verifyEnteredFieldText("email", "test@Test.com");
		sup.verifyEnteredFieldText("password", "Testing@123");
	}
	
	@Test
	private void TC12_ToValidateBlanksSpacesInUsername(){
		
		SignUpPage sup=new SignUpPage(driver);
		sup.enterFieldText("email", "test @Test.com");
		sup.enterFieldText("password", "Testing@");
		externalWait(30);
		sup.clickButton("signin_button1");
		externalWait(2);
		sup.verifySignUpPageValidationText("Invalid email address");
		sup.clickButton("registerok");

	}
	
}
