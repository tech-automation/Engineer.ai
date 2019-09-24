package com.rgb.testscripts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestScript1_1_3
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
		

		try
		{
			
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://rrrgggbbb.com/");
			Thread.sleep(5000);

			Actions actions = new Actions(driver);

			WebElement red =driver.findElement(By.id("R-fill"));
			WebElement blue =driver.findElement(By.id("B-fill"));
			WebElement elementT=driver.findElement(By.linkText("T"));


			String beforeHoverR=red.getAttribute("fill");
			
			String beforeHoverB=blue.getAttribute("fill");


			System.out.println("beforeHover Red"+beforeHoverR);
			
			System.out.println("beforeHover Blue"+beforeHoverB);


			actions.moveToElement(red).build().perform();

			Thread.sleep(1000);

			String val1=red.getCssValue("fill");

			System.out.println("afterHover Red is -"+val1);

			//String rHoverbgColor=red.getCssValue("background");

			WebElement bodyElement = driver.findElement(By.xpath("//body"));

			String bodyColorR= bodyElement.getCssValue("background");

			//System.out.println("rHoverbgColor--"+rHoverbgColor);
			System.out.println("bg Color on Red Hover--"+bodyColorR.trim());

			Assert.assertEquals("Fail to Assert Background", "rgb(255, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box", bodyColorR);
			
			Assert.assertEquals("Fail to Assert Red on Hover", "rgb(0, 0, 0)", val1);
			
			Thread.sleep(7000);

			System.out.println("-----------------------------------");
			actions.moveToElement(elementT).build().perform();

			Thread.sleep(1000);

			actions.moveToElement(blue).build().perform();

			String val2=blue.getCssValue("fill");

			System.out.println("After hover blue-"+val2);

			Thread.sleep(1000);

			WebElement bodyElement1 = driver.findElement(By.xpath("//body"));

			String bodyColorB= bodyElement1.getCssValue("background");


			System.out.println("bg Color on Blue Hover--"+bodyColorB);
			
			Assert.assertEquals("Fail to Assert Background", "rgb(0, 0, 255) none repeat scroll 0% 0% / auto padding-box border-box", bodyColorB);
			
			Assert.assertEquals("Fail to Assert Blue on Hover", "rgb(0, 0, 0)", val2);
			

			System.out.println("-----------------------------------");

			Thread.sleep(7000);
			/*driver.navigate().refresh();
			Thread.sleep(2000);
			WebElement green =driver.findElement(By.id("G-fill"));
			
			String beforeHoverG=green.getAttribute("fill");
			System.out.println("beforeHover Green"+beforeHoverG);
			Thread.sleep(4000);
			Actions act = new Actions(driver);
			
			//act.moveToElement(green).perform();
			act.moveByOffset(644,244).build().perform();
			
			
			String val3=green.getCssValue("fill");
			System.out.println("After hover green- "+val3);
			Thread.sleep(1000);

			WebElement bodyElement2 = driver.findElement(By.xpath("//body"));
			String bodyColorG= bodyElement2.getCssValue("background");
			System.out.println("bg Color on Green Hover--"+bodyColorG);*/


			System.out.println("Successfull");
			driver.manage().deleteAllCookies();
			driver.quit();

		}
		catch(Exception e)
		{
			System.out.println("Exception on script-"+e.getLocalizedMessage());
			Thread.sleep(2000);
			/*driver.manage().deleteAllCookies();
			driver.quit();*/
		}

	}

}

