package com.rgb.testscripts;

import org.testng.annotations.Test;

import com.rbg.pages.RGBPageActions;
import com.rgb.startup.BaseTest;

import org.testng.annotations.Test;



public class TestCase2 extends BaseTest
{
	
	@Test
	public void testMethod()
	{
		RGBPageActions rgbPageActionsObj = new RGBPageActions();
		
		
		rgbPageActionsObj.hoverOnGreen_AssertTextAndBackground();
	}

}
