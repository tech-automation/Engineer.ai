package com.rbg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rbg.pageobjects.RGBPageElements;
import com.rgb.startup.BaseTest;

public class RGBPageActions extends BaseTest
{
	RGBPageElements pageElements = PageFactory.initElements(driver, RGBPageElements.class);
	Actions actions = new Actions(driver);
	
	
	public void hoverOnRed_AssertTextAndBackground()
	{
		try
		{
			Thread.sleep(2000);
			String beforeHoverR=pageElements.letterR.getAttribute("fill");
			System.out.println("beforeHover on Letter-R color is - "+beforeHoverR);
			
			
			actions.moveToElement(pageElements.letterR);
			Thread.sleep(1000);
			String val1=pageElements.letterR.getCssValue("fill");
			System.out.println("afterHover on Letter-R color is - "+val1);
			
			
			WebElement bodyElement = driver.findElement(By.xpath("//body"));
			String bodyColorR= bodyElement.getCssValue("background");
			System.out.println("bg Color on R Hover--"+bodyColorR);

			

			///Assert Background is red
			Assert.assertEquals(bodyColorR, redColor);
			
			//Assert text is black
			Assert.assertEquals(val1, blackColor);
			
			Assert.assertTrue(true);
			
			Thread.sleep(7000);
		}
		catch(Exception e)
		{
			System.out.println("Exception on hoverOnRed_AssertRedAndBackground method"+e.getLocalizedMessage());
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public void hoverOnGreen_AssertTextAndBackground()
	{
		
	}
	
	public void hoverOnBlue_AssertTextAndBackground()
	{
		try
		{
			Thread.sleep(1000);
			String beforeHoverB=pageElements.letterB.getAttribute("fill");
			System.out.println("beforeHover letter-B color is "+beforeHoverB);
			
			
			actions.moveToElement(pageElements.letterB).build().perform();
			Thread.sleep(1000);
			String val2=pageElements.letterB.getCssValue("fill");
			System.out.println("After hover letter B color is "+val2);
			
			WebElement bodyElement = driver.findElement(By.xpath("//body"));
			String bodyColorB= bodyElement.getCssValue("background");
			System.out.println("bg Color on B Hover--"+bodyColorB);
			
			
			///Assert Background is blue
			Assert.assertEquals(bodyColorB, blueColor);
			
			//Assert text is black
			Assert.assertEquals(val2, blackColor);
			
			Assert.assertTrue(true);
			
			Thread.sleep(7000);
		}
		catch(Exception e)
		{
			System.out.println("Exception on hoverOnBlue_AssertTextAndBackground method"+e.getLocalizedMessage());
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	
}
