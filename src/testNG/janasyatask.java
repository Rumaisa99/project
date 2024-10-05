package testNG;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class janasyatask {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.janasya.com");
	}
@Test

	public void title()
	   {
		   {
				 String actualtitle=driver.getTitle();
				 String expectedtitle="Janasya";
			     if(actualtitle.equals(expectedtitle))
			      {
				  System.out.println("Pass");
			      }
			      else
			      {
			    	  System.out.println("Fail");
			      }
				}
	   }

	   @Test
	   public void links()
	   {
		   List<WebElement> li=driver.findElements(By.tagName("a"));
			 if (li.size() <= 400) {
	               System.out.println("Test Passed: Number of links is less than 400.");
	           } else {
	               System.out.println("Test Failed: Number of links is 400 or more.");
	           }   
	   }
	@Test
	public void screeshort() throws IOException 
	{
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(src, new File("C:\\Users\\asifa\\Pictures\\Screenshots.png"));
	}
	
		
}

