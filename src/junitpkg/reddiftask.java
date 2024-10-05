package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class reddiftask {
	
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void Test()
	{
		WebElement dayelelement=(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day)]")));
        WebElement monthelement=(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
      WebElement yearelement=(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
     
	Select ob=new Select(dayelelement);
	ob.selectByVisibleText("12");
	Select ob1=new Select(monthelement);
	ob1.selectByVisibleText("JUL");
	Select ob2=new Select(yearelement);
	ob2.selectByVisibleText("1999");
			
		}
	}
// Select d= new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
//Select m= new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
//Select y = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")));
//Select d= new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day)]")));
//Select m= new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
//Select y = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
//d.selectByVisibleText("12");
//m.selectByVisibleText("JUL");
//y.selectByVisibleText("1999");