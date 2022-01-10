



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

	public class Seleniumclass3 {
		private static final boolean False = false;
		WebDriver driver;

		@BeforeTest
		void bm() {
			System.out.println("this print before test");
			System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///Users/susan/Desktop/sample.html");
			
			
		}
		
		@Test(enabled=False)
		void VerifyTable3ByClassName() {
			WebElement elemnet=driver.findElement(By.className("table2"));
			Assert.assertTrue(elemnet.isDisplayed());
			
		}
		
		@Test
		void VerifyTable1BYName() {
			WebElement elemnet=driver.findElement(By.name("table22"));
			Assert.assertTrue(elemnet.isDisplayed());
			
		}
		
		@Test
		void VerifyTableXpath() {
			WebElement elemnet=driver.findElement(By.xpath("//table[@class=' table3']"));
			Assert.assertTrue(elemnet.isDisplayed());
			
		}
		@AfterTest
		void am() {
			
			driver.close();
		}
		
	}


