package com.firstwebapp.MyFirstWebApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebAppTest {

	WebDriver wb;
	
	@Test
	public void testTwo()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Firefox Driver\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		wb=new FirefoxDriver();
		wb.get("https://www.google.com");
		String actualt=wb.getTitle();
		String etitle="Google";
		if(actualt.equals(etitle)) 
		{
			
			System.out.println("Passed");
		}
		else 
		{
			
			System.out.println("Failed");
		}
		
	}



}
