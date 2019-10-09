package com.example.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.example.qa.base.TestBase;

public class GoogleSearchPage extends TestBase {

	@FindBy(xpath = "/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input")
	WebElement searchBar;
	
	
	//Initializing the Page Objects:
	public GoogleSearchPage() {
	   PageFactory.initElements(driver, this);
	}
	
	public void searchGoogle(String key){
		
		wait.until(ExpectedConditions.visibilityOf(searchBar));
		searchBar.clear();
		searchBar.sendKeys(key + Keys.ENTER);
		
	}
	
}
