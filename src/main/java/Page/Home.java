package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	WebDriver driver;

	public Home(WebDriver driver){
		this.driver=driver;
	}
	
	public Home ExplicitWait(WebDriver driver, int a, By by){
		
		new WebDriverWait(driver,a).until(ExpectedConditions.presenceOfElementLocated(by));
		return this;
	}
	
	public String getHeading(WebDriver driver,By Byxpath){
		
		return driver.findElement(Byxpath).getText();
		
		
		
	}
	
	public Home ClickElement(WebDriver driver,By Byxpath){
		
		
		this
		.ExplicitWait(driver, 45, Byxpath);
		driver.findElement(Byxpath).click();
		
		return this;
		
		
		
	}
	
}
