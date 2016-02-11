package org.maveric.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckboxTest {

	@Test
	public void checkboxTest(){
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		
		WebElement elements = driver.findElement(By.name("ctl00$mainContent$chk_VoucherDiscount"));
		elements.click();
		System.out.println(elements.isSelected());
	}
}
