package com.rbg.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RGBPageElements
{
WebDriver driver;
	
	public void RGBPageElements(WebDriver driver)
	{ 
		this.driver=driver; 
	}

	@FindBy(id="R-fill")
	public WebElement letterR;
	

	@FindBy(id="G-fill")
	public WebElement letterG;
	
	@FindBy(id="B-fill")
	public WebElement letterB;
	
	
	@FindBy(xpath="//body")
	public WebElement body;
}
