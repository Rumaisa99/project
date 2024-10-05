package testNG;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreports {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentSparkReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void bfrtest()
	{
		reporter=new ExtentSparkReporter("./reports/myreport.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("Functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Hostname","Local host");
		extent.setSystemInfo("os", "windows 10");
		extent.setSystemInfo("Testername","Rumaisa");
		extent.setSystemInfo("Browsername","Chrome");
		driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void setup() {
		driver.get(baseurl);
	}
 @Test
 public void fbtitleverification()
 {
	 test=extent.createTest("fbtitleverification");
	 String exp="facebook";
	 String actual=driver.getTitle();
	 Assert.assertEquals(exp, actual);
 }
@Test
public void buttontextverification()
{
	 test=extent.createTest("buttontextverification");
	WebElement a=driver.findElement(By.name("login"));
	String expb=a.getText();
	String actualb="Log in";
	Assert.assertEquals(expb,actualb);
	
}
@AfterTest
public void teardown()
{
	extent.flush();
}
@AfterMethod
public void browserclose(ITestResult result) throws IOException 
{
if(result.getStatus()==ITestResult.FAILURE)
{
	test.log(Status.FAIL,"test case failed is"+result.getName());
	test.log(Status.FAIL, "test case failed is"+result.getThrowable());
	String screenshortpath=screenshortmethod(driver,result.getName());
	test.addScreenCaptureFromPath(screenshortpath);
	}
else if(result.getStatus()==ITestResult.SKIP)
{
	test.log(Status.SKIP, "test case skipped is"+result.getName());	
}
else if(result.getStatus()==ITestResult.SUCCESS);
{
	test.log(Status.PASS, "test case passed is"+result.getName());
}
}

private String screenshortmethod(WebDriver driver, String screenshortname) throws IOException 
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String destination="./screenshort/"+screenshortname+"png";
	File finaldestination=new File(destination);
	FileHandler.copy(src, finaldestination);
	FileHandler.copy(src, new File(destination));
	return destination;
}
}
