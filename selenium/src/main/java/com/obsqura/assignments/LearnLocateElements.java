package com.obsqura.assignments;

	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class LearnLocateElements  {
		private static final boolean False = false;
		WebDriver driver;

		@BeforeTest
		void bm() {
			
			System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/elements");
			
			
		}
		
		@Test
		void verifyTextboxMenuElements() {
			
			driver.get("https://demoqa.com/text-box");
			//driver.findElement(By.xpath("//span[text()='Text Box']")).click();
			
			WebElement fullname=driver.findElement(By.id("userName"));
			Assert.assertTrue(fullname.isDisplayed());
			
			
			WebElement userEmail=driver.findElement(By.id("userEmail"));
			Assert.assertTrue(userEmail.isDisplayed());
			
			WebElement address=driver.findElement(By.id("currentAddress"));
			Assert.assertTrue(address.isDisplayed());
			
			
			WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
			Assert.assertTrue(permanentAddress.isDisplayed());
			
			WebElement submit=driver.findElement(By.id("permanentAddress"));
			Assert.assertTrue(submit.isDisplayed());
			
			
		}
		@Test
		void verifyButtonMenuElements() {
			
			
			driver.get("https://demoqa.com/buttons");
			//driver.findElement(By.xpath("//span[text()='Buttons']")).click();
			
			WebElement doubleClickBtn=driver.findElement(By.id("doubleClickBtn"));
			Assert.assertTrue(doubleClickBtn.isDisplayed());
			
			
			WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));
			Assert.assertTrue(rightClickBtn.isDisplayed());
			
			WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
			Assert.assertTrue(click.isDisplayed());
		
			
		}
		
		@Test
		void verifyWebtableMenu() {
			
			
			driver.get("https://demoqa.com/webtables");
			
			List<WebElement> imgtag=driver.findElements(By.className("rt-tr-group"));
			System.out.println("No of Rows:  "+imgtag.size());
			
		
			
		}

		@AfterTest()
		void am() {
			
			driver.close();
		}
		
	}



