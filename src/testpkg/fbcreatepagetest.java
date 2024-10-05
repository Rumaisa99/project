package testpkg;

import org.testng.annotations.Test;

import pagepkg.fbcreatepage;

public class fbcreatepagetest extends baseclass
{

	@Test
	public void test()
	{
		fbcreatepage ob=new fbcreatepage(driver);
		ob.createpageclick();
		ob.textverification();
		ob.signupclick();
	}

}
