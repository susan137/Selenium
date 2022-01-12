package com.obsqura.assignments;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartElements {
	WebDriver driver;

	@BeforeTest
	void bm() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
					
		
	}

	@Test
	void SearchElemnt() {
		int count=0;
		
		WebElement search=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//List<WebElement> realmeClass1=driver.findElements(By.xpath("//*[contains(text(), 'realme')]"));
		List<WebElement> realmeClass1=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		
		System.out.println(realmeClass1.size());
		
		for(int i =0;i<realmeClass1.size();i++) {
			 String elementText = realmeClass1.get(i).getText();
			 
			 if(elementText.contains("realme")) {
			 System.out.println(elementText);
				count++;
			 	}
		}
		System.out.println(count);
		
	}
	@AfterTest()
	void am() {
		
		//driver.close();
	}

	

}
