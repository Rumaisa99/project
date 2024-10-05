package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowhandling {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test() 
	{
		driver.get("http://demo.guru99.com/popup.php");
		String parentwindow=driver.getWindowHandle();  //current window
		driver.findElement(By.xpath("/html/body/p/a")).click(); 
		
		
		Set<String> allwindowhandles= driver.getWindowHandles();
		
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
	}

}
