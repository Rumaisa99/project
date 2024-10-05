package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandling {
	ChromeDriver driver;
	@Before
	
		public void setup()
		{
		driver =new ChromeDriver();
		driver.get("file:///C:/Users/asifa/Desktop/LUMINAR%20WORKS/.html");	
	}
   @Test
   public void firstname()
   {	   
	   driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
	   Alert a=driver.switchTo().alert();
	   String alertext=a.getText();
	   System.out.println(alertext);
	   a.accept();
	   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rumaisa");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rafeek");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
   }
   
}
