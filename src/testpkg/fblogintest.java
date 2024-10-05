package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.fbloginpage;

public class fblogintest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test1() 
	{
		fbloginpage ob=new fbloginpage(driver);
		ob.setvalues("abc@gmail.com", "abc123");
		ob.loginclick();
	}
	
}
