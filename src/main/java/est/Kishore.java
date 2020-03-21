package est;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Kishore {
	WebDriver driver;
	
	@BeforeClass
	public void Before(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java1\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		
		
		
		
		
	}
	
	@Test 
	public void Test1(){
		driver.get("https://www.goibibo.com/flights/");
		WebElement Page=driver.findElement(By.id("gosuggest_inputSrc"));
		Page.click();
		Page.sendKeys("BLR");
		
	}
	@AfterClass
	public void After(){
	
		driver.close();
		
	}
	
}