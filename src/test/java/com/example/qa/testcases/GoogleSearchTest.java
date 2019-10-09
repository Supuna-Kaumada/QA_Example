package com.example.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.qa.base.TestBase;
import com.example.qa.pages.GoogleSearchPage;

public class GoogleSearchTest extends TestBase{
	GoogleSearchPage googleSearchPage;
	
	public GoogleSearchTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
    initialization();
    googleSearchPage = new GoogleSearchPage(); 
	}
	
	@Test(priority=1)
	public void loginTest(){    
		googleSearchPage.searchGoogle("Selenium");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
