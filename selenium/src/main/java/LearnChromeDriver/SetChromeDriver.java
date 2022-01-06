package LearnChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SetChromeDriver {


	
	@Test
	
	void verifyPageTitle() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		
		String actual=driver.getTitle();
		
		String expected="Obsqura Zone: Selenium Automation Trainers";
		
		Assert.assertEquals(actual, expected,"Incorrect pagetitle");
		driver.close();
		
	}
	
	//System.out.println("The url is:"+driver.getCurrentUrl());
	//System.out.println("The pagesource is:"+driver.getPageSource());
	
	
	@Test
	void findTagCount() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		
		List<WebElement> imgtag=driver.findElements(By.tagName("img"));
	  
	        System.out.println(imgtag.size());
	}
		
		
	}
	
	
	
	
	
	
		
	


