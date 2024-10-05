package testNG;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


	
public class autoit {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	@SuppressWarnings("deprecation")
	@Test
	public void file() throws AWTException, IOException, Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("\"C:\\Users\\asifa\\Desktop\\LUMINAR WORKS\\T4.exe\"");
		Thread.sleep(4000);
	}
}
