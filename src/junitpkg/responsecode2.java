package junitpkg;

import java.net.URI;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class responsecode2 {
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
		
	for(WebElement ele:li)
	{
		String link=ele.getAttribute("href");
		verifylink (link);
}
}

	private void verifylink( String link) {

    try
    {
    	URI ob=new URI(link);
    	HttpsURLConnection c=(HttpsURLConnection)ob.toURL().openConnection();
    if(c.getResponseCode()==200)
    {
    	System.out.println("successfull response code is 200"+link);
    }
    else if(c.getResponseCode()==400)
    {
    	System.out.println("broken link response is 404"+link);
    }
	}
    catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}