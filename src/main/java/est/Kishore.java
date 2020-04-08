package est;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Home;

public class Kishore {
	WebDriver driver;
	Home home=new Home(driver);
	
	public static final By Interation=By.xpath("//a[contains(text(),'Sortable')]");
	@BeforeClass
	public void start(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://demoqa.com");
		
		
	}
	
	@Test
	
	public void Test11(){
		home.ClickElement(driver, Interation);
		
	}
//	@Test 
//	public void Test1() throws InterruptedException, AWTException{
//		 driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//*[@class='preload-me lazyloading']"));
//		String a=driver.getTitle();
//		System.out.println(a.contains("ToolsQA"));
//	
//
//		driver.findElement(By.xpath("//h3[contains(text(),'Widgets')]/../ul/li")).click();
//		driver.findElement(By.xpath("//*[contains(text(),'New Browser Window')]")).click();
//		String window=driver.getWindowHandle();
//		Set<String> child=driver.getWindowHandles();
//		Iterator<String> itr= child.iterator();
//		while(itr.hasNext()){
//			String childWindow=itr.next();
//			if(!window.equals(childWindow)){
//			driver.switchTo().window(childWindow);			
//			Thread.sleep(3000);	
//			 driver.manage().window().maximize();
//			 Thread.sleep(3000);	
//			 
//			WebElement Home = driver.findElement(By.xpath("//header[@class='header-bar']/nav/ul/li[1]/a/*/*"));
//			if(Home.isDisplayed()!=false){
//			Home.click();
//			}
//			}	
//			 Thread.sleep(3000);
//			driver.switchTo().defaultContent();
//			System.out.println("Parent Tile" +driver.getTitle());
//		}
//			}
//		
//				//Top menu
////		WebElement home=driver.findElement(By.xpath("//*[contains(.,'Home') and @id='menu-top']"));
////		home.click();
////		WebElement Interactions=driver.findElement(By.xpath("//*[contains(.,'Interactions') and @id='menu-top']"));
////		Interactions.click();
////		WebElement Widgets=driver.findElement(By.xpath("//*[contains(.,'Widgets') and @id='menu-top']"));
////		Widgets.click();
////		WebElement Tooltip=driver.findElement(By.xpath("//*[contains(.,'Tooltip and Double click') and @id='menu-top']"));
////		Tooltip.click();
////		
////	//Side bar
////		WebElement [] sidebar=driver.findElements(By.xpath("//h3[contains(text(),'Interactions')]/../ul/li/a"));
////		//h3[contains(text(),'Widgets')]/../ul/li
////		
////		//h3[contains(text(),'Widgets')]/../ul/li
////		System.out.println(sidebar.size());
////		
////		for(WebElement side:sidebar){
////			
////			
////				try {
////					side.click();
////				} catch (StaleElementReferenceException e) {
////					
////					// TODO: handle exception
////					e.printStackTrace();
////					driver.get(driver.getCurrentUrl());
////					side.click();
////				}
////				
////				
////			
////				
////			
////		}
////		
////		
//		
//////		Page.click();
////		source.sendKeys("BLR");
////		Roboclick();
////
////
//////		source.sendKeys(Keys.ARROW_DOWN);
//////		source.sendKeys(Keys.ENTER);
//////		
////		Thread.sleep(1000);
////		WebElement dest=driver.findElement(By.xpath("//*[@placeholder='Destination']")); 
////		dest.sendKeys("MAA");
//////		dest.sendKeys(Keys.ENTER);
//////		Robot robot=new Robot();
////		Roboclick();
////
////
////		Thread.sleep(1000);
////
////		WebElement departure=driver.findElement(By.xpath("//*[@placeholder='Departure']"));
////		departure.click();		
////		Thread.sleep(2000);
////
////		WebElement fromdate = driver.findElement(By.xpath("//div[contains(.,'23') and @id='fare_20200323']"));
////		fromdate.click();
////		Thread.sleep(1000);
////		
////		WebElement return1=driver.findElement(By.xpath("//*[@placeholder='Return']"));
////		return1.click();		
////		Thread.sleep(2000);
////		WebElement returndate = driver.findElement(By.xpath("//div[contains(.,'25') and @id='fare_20200325']"));
////		returndate.click();
////		Thread.sleep(2000);
////		WebElement peoples = driver.findElement(By.xpath("//*[@id='pax_link_common']"));
////		peoples.click();
////		Thread.sleep(1000);
////		((JavascriptExecutor)driver).executeScript("arguments[0].value='3';",driver.findElement(By.xpath("//*[@id='adultPaxBox']")));
////		Thread.sleep(1000);
////		
////		WebElement search = driver.findElement(By.xpath("//*[@id='gi_search_btn']"));
////		search.click();
////		Thread.sleep(3000);
////		
////		WebElement alert = driver.findElement(By.xpath("//div[@class='fltHpyResults intRnd']/*[contains(.,'Sorry, we could not find any flights for this route')]/div[2]/*/div/*[1]"));
////		String actual=alert.getText();
////		//System.out.println(actual);
////		String expected="Sorry, we could not find any flights for this route1";
////		Assert.assertEquals(actual, expected);
////		
////	}
////
////	public Robot Roboclick() throws InterruptedException, AWTException {
////		Thread.sleep(1000);
////		Robot robot=new Robot();
////		robot.keyPress(KeyEvent.VK_DOWN);
////		robot.keyRelease(KeyEvent.VK_DOWN);
////		Thread.sleep(1000);
////		robot.keyPress(KeyEvent.VK_ENTER);
////		robot.keyRelease(KeyEvent.VK_ENTER);
////		return robot;
//		
//	
	
	@AfterClass
	public void Ter(){
		driver.quit();
	}
}