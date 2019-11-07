package com.muralitechnologies.ecommerce.flipkartautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	// constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// locators
	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	private WebElement _btnClose;

	// action methods
	public HomePage clickOnCloseBtn() {
		_btnClose.click();
		return new HomePage(getDriver());

	}
}

