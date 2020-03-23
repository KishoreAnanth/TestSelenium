package est;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Kishore {
	WebDriver driver;
	
	@BeforeClass
	public void Before(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.goibibo.com/flights/");
		 driver.manage().window().maximize();
		
		
		
		
		
	}
	
	@Test 
	public void Test1() throws InterruptedException, AWTException{

		WebElement source=driver.findElement(By.id("gosuggest_inputSrc"));
//		Page.click();
		source.sendKeys("BLR");
		Roboclick();


//		source.sendKeys(Keys.ARROW_DOWN);
//		source.sendKeys(Keys.ENTER);
//		
		Thread.sleep(1000);
		WebElement dest=driver.findElement(By.xpath("//*[@placeholder='Destination']")); 
		dest.sendKeys("MAA");
//		dest.sendKeys(Keys.ENTER);
//		Robot robot=new Robot();
		Roboclick();


		Thread.sleep(1000);

		WebElement departure=driver.findElement(By.xpath("//*[@placeholder='Departure']"));
		departure.click();		
		Thread.sleep(2000);

		WebElement fromdate = driver.findElement(By.xpath("//div[contains(.,'23') and @id='fare_20200323']"));
		fromdate.click();
		Thread.sleep(1000);
		
		WebElement return1=driver.findElement(By.xpath("//*[@placeholder='Return']"));
		return1.click();		
		Thread.sleep(2000);
		WebElement returndate = driver.findElement(By.xpath("//div[contains(.,'25') and @id='fare_20200325']"));
		returndate.click();
		Thread.sleep(2000);
		WebElement peoples = driver.findElement(By.xpath("//*[@id='pax_link_common']"));
		peoples.click();
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("arguments[0].value='3';",driver.findElement(By.xpath("//*[@id='adultPaxBox']")));
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.xpath("//*[@id='gi_search_btn']"));
		search.click();
		Thread.sleep(3000);
		
		WebElement alert = driver.findElement(By.xpath("//div[@class='fltHpyResults intRnd']/*[contains(.,'Sorry, we could not find any flights for this route')]/div[2]/*/div/*[1]"));
		String actual=alert.getText();
		//System.out.println(actual);
		String expected="Sorry, we could not find any flights for this route1";
		Assert.assertEquals(actual, expected);
		
	}

	public Robot Roboclick() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		return robot;
	}
	@AfterClass
	public void After(){
	
		driver.close();
		
		
	}
	
}