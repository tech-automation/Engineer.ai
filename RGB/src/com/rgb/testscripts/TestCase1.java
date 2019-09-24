package com.rgb.testscripts;

import org.testng.annotations.Test;

import com.rbg.pages.RGBPageActions;
import com.rgb.startup.BaseTest;

import org.testng.annotations.Test;



public class TestCase1 extends BaseTest
{
	
	@Test
	public void testMethod()
	{
		RGBPageActions rgbPageActionsObj = new RGBPageActions();
		
		
		rgbPageActionsObj.hoverOnRed_AssertTextAndBackground();
		
		rgbPageActionsObj.hoverOnBlue_AssertTextAndBackground();
		
		//rgbPageActionsObj.hoverOnGreen_AssertTextAndBackground();
		
	}

}
