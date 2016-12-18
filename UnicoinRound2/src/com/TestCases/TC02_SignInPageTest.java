package com.TestCases;

import org.testng.annotations.Test;

import com.Pages.DashboardPage;
import com.Pages.SignInPage;
import com.Pages.SuperTestNG;

public class TC02_SignInPageTest extends SuperTestNG {
	
	DashboardPage dp=new DashboardPage(driver);
	SignInPage sip=new SignInPage(driver);
	
	@Test
	private void NavigateToSignInPage(){
		dp.gotoPage("Sign In");
	}
	
	@Test
	private void TC01_verifySignInPageValidationText(){
		//More than 100 character in username
		enterFieldText("email", "lllllllllllllllllllllllllllllllllllllllllllllllll@lllllllllllllllllllllllllllllllllllllllllllllll.com");
		enterFieldText("password", "Test@1234");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("You are not a registered user on Unocoin");
		clickButton("signinmodalok");
		dp.gotoPage("Sign In");
		
		
		//Less than 8 character in password
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "1234@ab");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
		//More than 50 character in password
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "01234567890123456789012345678901234567890123456789@A");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
		//By Entering only letters for password field
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "abcdefghijk");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
		//By Entering only numbers for password field
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "123456789");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
		//By Entering only special characters for password field
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "!@#$%^&*()_");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
		//By Entering letters and numbers but not special characters for password field
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "abcd1234");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
		//By Entering letters and numbers but not special characters for password field
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "1234!@#$");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
	}
	
	@Test
	private void TC02_verifyMaxAttempts(){
		//Enter incorrect credentials invalid password for 1th time
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "Test@1234");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
		//Enter incorrect credentials invalid password for 2th time
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "Test@1234");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
		//Enter incorrect credentials invalid password for 3th time
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "Test@1234");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
		//Enter incorrect credentials invalid password for 4th time
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "Test@1234");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
		//Enter incorrect credentials invalid password for 5th time
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "Test@1234");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
			
	}
	
	@Test
	private void TC03_ValidationTextExecedingMaxCharacters(){
		
		//More than 100 character in username
		enterFieldText("email", "lllllllllllllllllllllllllllllllllllllllllllllllll@lllllllllllllllllllllllllllllllllllllllllllllll.com");
		enterFieldText("password", "Test@1234");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("You are not a registered user on Unocoin");
		clickButton("signinmodalok");
		dp.gotoPage("Sign In");
		
		//More than 50 character in password
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "01234567890123456789012345678901234567890123456789@A");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("warningok");
		
	}
	
	@Test
	private void TC04_verifyMaximumTextToEntered(){
	//Enter the text more than maximum limit, assuming max limit is 10 	
	enterFieldText("email", "Test@Test.com");
	//verifying that text store in username is of only 10 characters
	sip.verifyMaximumTextinTextbox(10, "email");
	
	//Enter the text more than maximum limit, assuming max limit is 10 	
	enterFieldText("password", "Test@1234556789");
	//verifying that text store in password is of only 10 characters
	sip.verifyMaximumTextinTextbox(10, "password");
	}

	@Test
	private void TC05_verifyPasswordIsEncriptedInAsterisks(){ 	
	enterFieldText("password", "Test@1234");
	sip.verifyPasswordIsInAsterisks("Test@123");
	}
	
	@Test
	private void TC06_verifyPasswordFieldTextIsTrimmed(){ 	
	enterFieldText("password", "     Test@1234     ");
	sip.verifyEnteredPasswordMaches("Test@1234");
	}
	
	@Test
	private void TC07_verifyForgotPasswordFieldIsPresent(){ 	
	verifyFieldIsPresent("forgotid");
	}
	
	@Test
	private void TC08_verifyForgotPasswordFieldIsPresent(){ 	
		//Invalid username, where 'Test@test.test' username does not present"
		enterFieldText("email", "Test@test.test");
		enterFieldText("password", "Test@1234");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("You are not a registered user on Unocoin");
		clickButton("signinmodalok");
		dp.gotoPage("Sign In");
		
		
		//Invalid password, where 'Test@1234' is inccorect password
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "Test@1234");
		clickButton("signin_button2");
		sip.verifySignInPageValidationText("Wrong password. Try clicking Forgot Password '?' if you are having trouble signing in.");
		clickButton("signinmodalok");
		dp.gotoPage("Sign In");
		
		//Username with blank spaces"
		enterFieldText("email", "dsantosh.das@gmail.co m");
		sip.verifyValidationTextForUsername("Please enter a valid email address");
		
	}
	
	@Test
	private void TC09_verifyPageIsRedirectedToLoginPage(){ 
		
	}
	
	@Test
	private void TC10_verifyClickingLogoutRedirectedToHomePage(){ 
		enterFieldText("email", "dsantosh.das@gmail.com");
		enterFieldText("password", "12345678s");
		clickButton("signin_button2");
		externalWait(5);
		sip.verifyPageTitle("Unocoin | Account Settings");
		clickButton("logout2");
		externalWait(5);
		sip.verifyPageTitle("Unocoin | India's Bitcoin Company");
		
	}

	@Test
	private void TC11_verifyForgotPasswordPageDisplayed(){ 
		clickButton("forgotid");
		sip.verifyFieldTextForFieldId("modalquestion title","Forgot password?");
	}
	
	@Test
	private void TC12_verifySignUpPageIsDisplayed(){ 
		sip.clickRegisterNowLink();
		sip.verifyPageTitle("Unocoin | Sign Up");	
	}
	
}
