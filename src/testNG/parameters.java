package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {
    @Parameters("v")
	@Test
	public void setup(String v)
	{
		System.out.println("v="+v);
	}
}
