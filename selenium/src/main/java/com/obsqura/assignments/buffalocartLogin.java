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

	public class buffalocartLogin {
	
		WebDriver driver;

		@BeforeTest
		void bm() {
			
			System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://buffalocart.com/demo/crm");
			
			
		}

		@Test
		void LoginPage() {
			
			WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
			username.sendKeys("admin@admin.com");
			
			WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("123456");
			
			WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			
			//verify the Title
			String actualtitle=driver.getTitle();
			String expectedtitle="Dashboard | Demo- Project Manager";
			Assert.assertEquals(actualtitle, expectedtitle,"Incorrect title");
			
			
			//Verify ProfileName
			
			String profilename=driver.findElement(By.xpath("//span[text()='Ajith KS']")).getText();
			String expectedname="Ajith KS";
			Assert.assertEquals(profilename, expectedname,"Incorrect Name");
			
		}
		@AfterTest()
		void am() {
			
			//driver.close();
		}

		

	}



