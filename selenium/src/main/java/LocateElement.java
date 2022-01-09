import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocateElement {
	WebDriver driver;
	
	@BeforeMethod
	void bm() {
		System.out.println("this print before test");
		
		System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
	}
	
	@Test
	
	void findImg() {
	
	WebElement element=driver.findElement(By.tagName("img"));
	List<WebElement> imgtag=driver.findElements(By.tagName("img"));
	
	
	//Assert.assertEquals(true, element.isDisplayed(),"Element not present");
	
	}
	
	@AfterMethod
	void am() {
		driver.close();
	}


}
