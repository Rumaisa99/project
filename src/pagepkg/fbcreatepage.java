package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbcreatepage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"reg_pages_msg\"]/a")
	WebElement createpagelink;
	@FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
	WebElement signup;
	
	public fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
     }
	
	public void createpageclick() 
	{
		createpagelink.click();
	}
	public void textverification() 
	{
		String src=driver.getPageSource();
		if(src.contains(("Create a page")))
				{
			System.out.println("pass");
				}
		else
		{
			System.out.println("fail");
		}
	}
	public void signupclick()
	{
		signup.click();
	}
}