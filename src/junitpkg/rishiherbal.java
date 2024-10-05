package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rishiherbal {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void test() 
	{
		 String actualtitle=  driver.getTitle();    
	        String expectedtitle="Rishi Herbal";    
	        if(actualtitle.equals(expectedtitle))
	        {
	        	System.out.println("Pass");
	        }
	        else
	        {
	        	System.out.println("fail");
	        }
	}
	@Test
	public void links()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+li.size());	
		  int expected=100; 
		 int actual=li.size();   
	         
	        if(actual==expected)
	        {
	        	System.out.println("as expected");
	        }
	        else
	        {
	        	System.out.println("not as expected");
	        }
		
	}

	@Test
	public void textverification()
	{
		String source=driver.getPageSource();
		String search="FOOD";
		if(source.contains(search))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

}
	@Test
	public void health()
	{
		driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/a")).click();
	}
}