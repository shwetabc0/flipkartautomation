package com.muralitechnologies.ecommerce.flipkartautomation.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.muralitechnologies.ecommerce.flipkartautomation.pages.HomePage;
import com.muralitechnologies.ecommerce.flipkartautomation.pages.LoginPage;
import com.muralitechnologies.ecommerce.flipkartautomation.pages.SearchResultsPage;
import com.muralitechnologies.ecommerce.flipkartautomation.utils.BaseTest;

public class LoginTest extends BaseTest{
	LoginPage lPage;
	HomePage hPage;
	SearchResultsPage srPage;
	private static final Logger log = LogManager.getLogger(LoginTest.class);
	
	@DataProvider(name ="dataset")
	public Object[][] data(){
		return new Object[][]{{"iphone"},{"ipad"},{"tv"}};
	}
	
	@Test(dataProvider="dataset")
	public void test_validateLogin(String searchItem) throws InterruptedException{
	//	hPage = lPage.clickOnCloseBtn();
		log.info("Test Started");
		srPage = hPage.enterSearchText(searchItem);
		log.info("Test Executed Successfully");
		Thread.sleep(4000);
		
	}
	
	@Test()
	public void test_Assertion() throws InterruptedException{
		log.info("Test Started");
		String Text = hPage.getText();
		System.out.println("Text Value = " +Text);
		Assert.assertEquals(Text, "Login & Signup");
		srPage = hPage.enterSearchText("iphone");
		log.info("Test Executed Successfully");
		Thread.sleep(4000);
		
	}
	
	@Test
	public void verify(){
		SoftAssert sAssert = new SoftAssert();
		System.out.println("Step 1");
		sAssert.assertEquals("Hello", "Hello");
		System.out.println("Step 2");
		System.out.println("Step 3");
		System.out.println("Step 4");
		sAssert.assertAll();
		
	}
	
	
	
	@BeforeClass
	public void setup(){
		//lPage = new LoginPage(getDriver());
		hPage = new HomePage(getDriver());
	}
	

}
