package webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String source=driver.getPageSource();
		String search="images";
		if(source.contains(search))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
}
}