package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hardassertion {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test() 
	{
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		System.out.println("Title="+actualtitle);
		
		Assert.assertEquals(actualtitle,exptitle,"Title verified");
		System.out.println("verified");
	}

}
