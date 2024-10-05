package testNG;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowdetails {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
@Test
public void test() 
{
	System.out.println("title of google"+driver.getTitle());
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.facebook.com");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.ebay.com");
	System.out.println(driver.getTitle());
//	driver.findElement(By.xpath("//*[@id=\"v1-flyout-nav\"]u1/li/[1]/a")).click();
	
	ArrayList<String>windowdetails=new ArrayList<>(driver.getWindowHandles());
	
	driver.switchTo().window(windowdetails.get(1));
	System.out.println(driver.getTitle());
}
}
