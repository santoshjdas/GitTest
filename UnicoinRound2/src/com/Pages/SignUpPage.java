package com.Pages;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class SignUpPage extends SuperTestNG {
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}

	public void verifyMandatoryField(String fieldId)
	{
		try{
			String fieldText= driver.findElement(By.id(fieldId)).getAttribute("placeholder");
			if (fieldText.startsWith("*")){
				System.out.println("field is Mandatory field");
			}else System.out.println("field is non Mandatory field");
		}catch(Exception e){
			System.out.println("exception in fieldIsPresent  is"+e);
		}
	}
	
	
    public void verifyfieldPresentInDatabase(String columnName, String fieldValue) {
    	try{
		Connection connectionString=null;
		Statement statementString;
	    String DB_URL = "jdbc:mysql://localhost:3306/unicoin";   
	    String DB_USER = "root";
	    String DB_PASSWORD = "root";
		
		connectionString = (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		statementString = (Statement) connectionString.createStatement();
    		
    	String query = "select * from UnocoinUsers where username="+columnName;
    	ResultSet queryresults =(ResultSet) statementString.executeQuery(query);
    	
    	if (queryresults.toString().equals(fieldValue)){
    		System.out.println("entered data has displayed in database");
    	}else
    		System.out.println("entered data has not displayed in database");
    	
    	} catch (Exception e){
    		e.printStackTrace();
        }
    	
    }

    
    public void verifyfieldSizeInDatabase(String columnName, String fieldValue,int fieldsize) {
    	try{
		Connection connectionString=null;
		Statement statementString;
	    String DB_URL = "jdbc:mysql://localhost:3306/unicoin";   
	    String DB_USER = "root";
	    String DB_PASSWORD = "root";
		
		connectionString = (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		statementString = (Statement) connectionString.createStatement();
    		
    	String query = "select * from UnocoinUsers where username="+columnName;
    	ResultSet queryresults =(ResultSet) statementString.executeQuery(query);
    	
    	if ((queryresults.toString().length())<=fieldsize){
    		System.out.println("fieldsize is matches");
    		if(queryresults.toString().equals(fieldValue)){
    		System.out.println("Correct fieldValue is displayed");
    		}else{System.out.println("InCorrect fieldValue is displayed");
    		}
    	}else
    		System.out.println("fieldsize does not matches");
    	
    	} catch (Exception e){
    		e.printStackTrace();
        }
    	
    }
    
    public void verifySignUpPageValidationText(String validationText)
	{
		try{
			String fieldText= driver.findElement(By.id("myModalLabel")).getText();
			if (fieldText.equals(validationText)){
				System.out.println("Correct Validation Text is displayed");
			}else System.out.println("Incorrect Validation Text is displayed");

		}catch(Exception e){
			System.out.println("exception in fieldAreCleared  is"+e);
		}
	}
	
    public void verifyEnteredFieldText(String fieldId, String validationText)
	{
		try{
			String fieldtext= getEnteredText(fieldId);
			if (fieldtext.equals(validationText)){
				System.out.println("Entered filedtext is matching");
			}else
				System.out.println("Entered filedtext is not matching");
			
		}catch(Exception e){
			System.out.println("exception in verifyEnteredFieldText  is"+e);
		}
	}
    

}
