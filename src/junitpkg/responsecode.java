package junitpkg;

import java.net.URI;
import java.net.URISyntaxException;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;

public class responsecode {
	String Link="https://www.facebook.com";
	@Test
	public void test() throws Exception 
	{
		URI ob=new URI(Link);
		HttpsURLConnection c=(HttpsURLConnection)ob.toURL().openConnection();
		System.out.println(c.getResponseCode());
	}

}
