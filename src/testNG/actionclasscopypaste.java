package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class actionclasscopypaste {
	ChromeDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
  @Test
  public void copypaste()
  {
	  WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	  WebElement reddifid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	  fullname.sendKeys("Rumaisa");
	  Actions ob=new Actions(driver);
	  ob.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	  ob.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	  ob.keyDown(reddifid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	  ob.perform();  
}
}
