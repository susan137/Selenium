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

	public class TextboxForm {	
		WebDriver driver;

		@BeforeTest
		void bm() {
			
			System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
						
			
		}
		
		@Test
		void verifyTextboxForm() throws InterruptedException {
			
			driver.get("https://demoqa.com/text-box");
			
			
			WebElement fullname=driver.findElement(By.id("userName"));
			fullname.sendKeys("john");
		
			
			WebElement userEmail=driver.findElement(By.id("userEmail"));
			userEmail.sendKeys("test@gmial.com");
			//System.out.println(userEmail.getAttribute("value"));
			
			WebElement address=driver.findElement(By.id("currentAddress"));
			address.sendKeys("278Jacksonstreet,,petone Wellington");
			
			
			WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
			permanentAddress.sendKeys("108ApuCrescent,Lyallbay wellington");
			
			Thread.sleep(50000);
			
			WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
			submit.click();
			
			
			//Locate the Elements after Submitting the Form
			
			String name=driver.findElement(By.id("name")).getText();
			
			String email=driver.findElement(By.id("email")).getText();
			
			
			String currentAddress1=driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
		
			
			String permanentAddress1=driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
			
			
			//Verify the value we send is displayed after the form submission
			
			if(name.contains(fullname.getAttribute("value"))&&
				email.contains(userEmail.getAttribute("value"))&&
				currentAddress1.contains(address.getAttribute("value"))&&
				permanentAddress1.contains(permanentAddress.getAttribute("value")))
					{
						System.out.println("Pass");
					}
			
		}
		@AfterTest()
		void am() {
			
			driver.close();
		}

}
