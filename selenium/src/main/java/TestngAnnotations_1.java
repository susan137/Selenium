import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotations_1 {
	
	@BeforeMethod
	void bm() {
		System.out.println("this print before test");
		/*System.setProperty("webdriver.chrome.driver", "/Users/susan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");*/
	}
	
	@Test(priority=2)
	void test2() {
		
		System.out.println("Test2");
	}

	@Test(priority=1)
	void test1() {
		
		System.out.println("Test1");
	}
	
	@Test(enabled=false)
	void test3() {
		
		System.out.println("Test3");
	}
	
	@AfterMethod
	void am() {
		
		System.out.println("This is afermethod");
	}

}
