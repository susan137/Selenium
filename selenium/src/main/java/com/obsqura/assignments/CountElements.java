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
	
	@Test
	void countElements() {
		int count=1;
		String pagesource=driver.getPageSource();
		boolean check=pagesource.contains("href");
		for(int i=0;i<pagesource.length();i++) {
		if (check) {
			
			count++;
		}
		
		}
		System.out.println("The img Tag count is:  "+count);
	
		
	}
	//To Find count of Images and Hyper Links
	@Test
	void countTag() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The link count is:  "+links.size());	
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println("The count of image tag is:  "+image.size());	
		List<WebElement> table = driver.findElements(By.tagName("table"));
		System.out.println("The count of Table is:  "+table.size());
		
	}
	
	

	@AfterTest
	void am() {
		
		driver.close();
	}
	
}
