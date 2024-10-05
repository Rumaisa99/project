package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	
	ChromeDriver driver;
	@Before
	public void locator()
	{
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
  public void fb()
  {
		driver.findElement(By.id("email")).sendKeys("Rumaisa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
  }
	

}
