package executionEngine;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {
		private static WebDriver driver = null;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();;
		driver.findElement(By.id("log")).sendKeys("matt_test");
		driver.findElement(By.id("pwd")).sendKeys("TE4NFmtsVpBG");
		driver.findElement(By.id("login")).click();		
		driver.findElement(By.xpath(".//*[@id='account_logout']/a"));
		driver.quit();
	}

}
