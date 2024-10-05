package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class reddifpgrm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
  @Test
  public void logo()
  {
	  WebElement logo=(driver.findElement(By.xpath("//img[@title='Rediff.com']")));
	 boolean b= logo.isDisplayed();
	 if(b)
	 {
		  System.out.println("logo is displaying");
	 }
	 else
	 {
		  System.out.println("logo is not displaying");
	 }
	  
  }
  @Test
  public void radiobutton()
  {
	  WebElement radiobutton=(driver.findElement(By.xpath("//input[@type='radio']")));
	  boolean s=radiobutton.isSelected();
	  if(s)
	  {
		  System.out.println("radio button can be selected "); 
	  }
	  else
	  {
		  System.out.println("radio button cannot be selected "); 
	  }
  }
  @Test
  public void createmyaccount()
  {
	  WebElement createmyaccount=(driver.findElement(By.xpath("//input[@type='submit']")));
	  boolean r=createmyaccount.isEnabled();
	  if(r)
	  {
		  System.out.println("account is enabled");  
	  }
	  else
	  {
		  System.out.println("account is not enable");
	  }
  }
}
