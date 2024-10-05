package webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverdemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver(); //open browser
		driver.get("https://www.google.co.in/"); //open google
    String actualtitle=  driver.getTitle();    // to get actual title of application
        String expectedtitle="Google";    // to get expected title of application
        if(actualtitle.equals(expectedtitle))
        {
        	System.out.println("Pass");
        }
        else
        {
        	System.out.println("fail");
        }
		driver.close();  // to quit current tab
		driver.quit();  // to quit entire browser
		
	}

}
