package org.maveric.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioButtonTest {
	
	@Test
	public void radioButtonTest(){
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		
		List<WebElement> element = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(element.size());
		element.get(1).click();
	}

}
