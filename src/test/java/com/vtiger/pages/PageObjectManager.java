package com.vtiger.pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.stepdefinitions.BaseDefinitions;

public class PageObjectManager extends BaseDefinitions {
	
	public LoginPage lp;
	public HomePage hp;
	public HeaderPage hdp;
	public LeadPage ldp;
	
	
	
	public void getPageObject()
	{
		if(lp==null)
		{
			lp = new LoginPage(driver,logger);
		}
		
		if(hp==null)
		{
			hp = new HomePage(driver,logger);
		}

		if(hdp==null)
		{
			hdp = new HeaderPage(driver,logger);
		}
		
		if(ldp==null)
		{
			ldp = new LeadPage(driver,logger);
		}
	}

}
