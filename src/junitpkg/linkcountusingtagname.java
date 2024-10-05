package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcountusingtagname {
	
	ChromeDriver driver;
	@Before
		public void setup()
		{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		}
	@Test
	public void test()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+li.size());
		
	for(WebElement link:li)
	{
		System.out.println("Link:"+link.getAttribute("href"));
		System.out.println("Link:"+link.getText());
		//String link=ele.getattribute("href");
		//String linktext=ele.gettext();
		//syso.....println("link+......+linktext);	

		
		
		
		
		
}
}
}