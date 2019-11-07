package com.muralitechnologies.ecommerce.flipkartautomation.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@DataProvider(name ="dataset")
	public Object[][] data(){
		return new Object[][]{{"iphone"},{"ipad"},{"tv"}};
	}
	
	@Test(dataProvider="dataset")
	public void m1(String Data){
		System.out.println(" Method 1: Test" + Data);
		//source // access // use
	}

	@BeforeSuite
	public void m2(){
		System.out.println(" Method 2: Before Suite");
	}

	@AfterSuite
	public void m3(){
		System.out.println(" Method 3: AfterSuite");
	}

	@BeforeClass
	public void m4(){
		System.out.println(" Method 4: BeforeClass");
	}

	@AfterClass
	public void m5(){
		System.out.println(" Method 5: AfterClass");
	}

	@BeforeTest
	public void m6(){
		System.out.println(" Method 6: BeforeTest");
	}

	@AfterTest
	public void m7(){
		System.out.println(" Method 7: AfterTest");
	}

	
}

