package org.maveric.com;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest {
	
	@Test
	public void dropdowntest(){
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
		select.selectByVisibleText("5 Adults");
	}

}
