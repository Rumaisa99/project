package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginvalidation {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Parameters({"username","password"})
   @Test
   public void fblogin()
   {
		driver.findElement(By.id("email")).sendKeys("rumaisaasif99@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kadeeja");
		driver.findElement(By.name("login")).click();
		String expurl="https://www.facebook.com/profile";
		String actualurl=driver.getCurrentUrl();
		if(expurl.equals(actualurl))
		{
			System.out.println("login successfull");
		}
		else
		{
			System.out.println("invalid login");
		}

}
}