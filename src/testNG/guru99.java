package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class guru99 {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
    driver=new ChromeDriver();
   
}
	@BeforeMethod
	public void urlloading()
	{
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test()
	{
		
	 WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span")); 		
	 WebElement edit=(driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")));		
	   WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button")); 
		 
		 Actions ob=new Actions(driver);
		 ob.contextClick(rightclick).perform();
		 edit.click();
		 driver.switchTo().alert().accept();
		 ob.doubleClick(doubleclick).perform();
		 Alert a=driver.switchTo().alert();
		 System.out.println(a.getText());
		 a.accept();
		 
	}
	

}
 