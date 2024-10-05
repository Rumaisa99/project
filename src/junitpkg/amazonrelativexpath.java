package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonrelativexpath {

   ChromeDriver driver;
   @Before
   public void amazon()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.amazon.in/");
   }
   @Test
   public void xpath() 
   {
	   WebElement searchfield=driver.findElement(By.name("field-keywords"));
		searchfield.sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div[1]/a[5]")).click();
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
		
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='nav-left']/a[1]")).click();
   }
}