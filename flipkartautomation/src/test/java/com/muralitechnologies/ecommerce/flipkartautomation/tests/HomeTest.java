package com.muralitechnologies.ecommerce.flipkartautomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.muralitechnologies.ecommerce.flipkartautomation.utils.ExcelUtility;

public class HomeTest {
	WebDriver driver;
	
	@DataProvider(name ="dataset")
	public Object[][] data(){
		return new Object[][]{{"iphone"},{"ipad"},{"tv"}};
	}
	
	@Test(dataProvider="dataset", enabled=true)
	//@Test(priority=1)
	public void test_login(String Data) throws InterruptedException{
	
		driver.findElement(By.className("LM6RPg")).clear();
		driver.findElement(By.className("LM6RPg")).sendKeys(Data+Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Login test");
		
	}
	
	@Test()
	public void test_search_ExcelData() throws Exception{
		driver.findElement(By.className("LM6RPg")).clear();
		driver.findElement(By.className("LM6RPg")).sendKeys(ExcelUtility.getCellData(1, 0)+Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Search test");
		
	}
	
	@Test()
	@Parameters({"item"})
	public void test_search_parameter(String Data) throws InterruptedException{
	
		driver.findElement(By.className("LM6RPg")).clear();
		driver.findElement(By.className("LM6RPg")).sendKeys(Data+Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Search test");
		
	}
	@Test(priority=2)
	public void test_home(){
	
		System.out.println("home test");
		
	}
	
	/*@BeforeSuite
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "E:\\Java&Eclipse\\Maven_Projects\\flipkartautomation\\src\\test\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	}
	
	
	
	@AfterSuite
	public void teardown(){
		driver.quit();
	}
*/
}
