import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumDay2 {
@Test
	
	void verifyPageTitle() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		
		String actual=driver.getTitle();
		System.out.println(actual);
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		//String expected="Obsqura Zone: Selenium Automation Trainers";
		
		//Assert.assertEquals(actual, expected,"Incorrect pagetitle");
		driver.close();
		
	}
}
