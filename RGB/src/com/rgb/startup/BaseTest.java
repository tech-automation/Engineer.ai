package com.rgb.startup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst
{
	public static WebDriver driver;

	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}

	@BeforeMethod(alwaysRun = true)
	public void launchApplication() throws IOException, InterruptedException
	{
		System.out.println("Execution Started : Opening the browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);

	}

	@AfterMethod
	public void closeApplication(ITestResult iTestResult) throws InterruptedException, IOException
	{

		driver.manage().deleteAllCookies();
		driver.quit();
		System.out.println("Test Execution Completed : Closing the browser");
	}


}

