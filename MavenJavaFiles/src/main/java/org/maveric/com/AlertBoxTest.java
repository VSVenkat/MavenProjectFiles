package org.maveric.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertBoxTest {
	
	@Test
	public void testofAlert(){
		
		System.out.println("Just a test for the maven dependency for selenium");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement firdFlight = driver.findElement(By.name("ctl00$mainContent$btn_FindFlights"));
		firdFlight.click();
		
		Alert al = driver.switchTo().alert();
		al.accept();
				
	}

}
