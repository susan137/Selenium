package com.obsqura.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountElements {
	WebDriver driver;

	@BeforeTest
	void bm() {
		System.out.println("this print before test");
		System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		
	}
	//Count the no of Hyperlinks using normal java code from pagesource
	@Test
	void countElements() {
		int count=1;
		String pagesource=driver.getPageSource();
		for(int i=0;i<pagesource.length();i++) {
			
		if (pagesource.contains("a href")) {
			
			count++;
		
		}
		
		
		
		}
		
	System.out.println(count);
		
	}
	//To Find count of Images and Hyper Links
	@Test
	void countTag() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The link count is:  "+links.size());	
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println("The count of image tag is:  "+image.size());	
		
	}
	
	//tr[@class='odd']

	@AfterTest
	void am() {
		
		driver.close();
		
	
	}
	
	
}
