package Deflt;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG {
	@BeforeSuite
	public void BeforeSuit(){
		System.out.println("After Suite");
	}
@AfterSuite
public void AfterSuit(){
	System.out.println("After Suite");
}
@org.testng.annotations.BeforeClass
public void BeforeClass(){
	System.out.println("Before class");
}
@org.testng.annotations.AfterClass
public void Afterclass(){
	System.out.println("After class");
}
@org.testng.annotations.BeforeMethod
public void BeforeMethod(){
	System.out.println("Before method");
}
@org.testng.annotations.AfterMethod
public void AfterMethod(){
	System.out.println("After method");
}
@BeforeTest
public void BeforeTest(){
	System.out.println("Before test");
}
@AfterTest
public void AfterTest(){
	System.out.println("After test");
}
@org.testng.annotations.Test
public void Test(){
	System.out.println("Test Suite");
}
@org.testng.annotations.BeforeGroups
public void BeforeGroups(){
	System.out.println("Before groups");
}
@org.testng.annotations.AfterGroups
public void AfterGroups(){
	System.out.println("After groups");
}
}
