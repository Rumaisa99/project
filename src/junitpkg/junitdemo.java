package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equals(expectedtitle))
		{
		System.out.println("pass");	
		}
		else
		{
			System.out.println("fail");
		}
	}
		@Test
		public void textverification() 
		{
			String source=driver.getPageSource();
			String search="images";
			if(source.contains(search))
			{
				System.out.println("text present");
			}
			else
			{
				System.out.println("not present");
			}
		}
		@After
		public void close()
		{
			driver.quit();
		}
	}
	
	
