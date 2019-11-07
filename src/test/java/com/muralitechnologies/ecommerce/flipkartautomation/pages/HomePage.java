package com.muralitechnologies.ecommerce.flipkartautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	//constructor
	public HomePage(WebDriver driver){
		super(driver);
	}
	//locator
	@FindBy(className = "LM6RPg")
	private WebElement _txtSearchBox;
	
	@FindBy(xpath="//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/a")
	private WebElement _lnkLogin;
	
	//action methods
	public SearchResultsPage enterSearchText(String searchItem){
		_txtSearchBox.clear();
		_txtSearchBox.sendKeys(searchItem+ Keys.ENTER);
		return new SearchResultsPage();
	}

	public String getText() {
		return _lnkLogin.getText();
		
	}
	
}
