package com.atmecs.qa.automationproject.pages;

import java.util.Properties;
import org.openqa.selenium.WebElement;
import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.atmecs.qa.automationproject.testsuite.SampleTestSuiteBase;
import com.atmecs.qa.automationproject.utility.AppConstants;
import com.atmecs.qa.automationproject.utility.CommonUtils;

public class HomePage extends SampleTestSuiteBase{
	
	private ReportLogService report = new ReportLogServiceImpl(HomePage.class);
	public static Properties props = CommonUtils.loadProperty(AppConstants.HOMEPAGE_PROPERTIES_FILE);

	Browser browser;

	public HomePage(Browser browser) {
		this.browser = browser;
	}
	
	private WebElement getLogin() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("btnsignin"));		

	}
	
	private WebElement getStoreLogo() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("storeLogo"));		

	}
	
	private WebElement getSignout() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("btnsignout"));		

	}
		
	
	public boolean validateStoreLogo() {
		report.info("Verify Page Logo");
		browser.getWait().implicitWait(60000);
		return getStoreLogo().isDisplayed();
	}
	
	public void clickOnSignIn() {
		report.info("Click on Sign in");
		browser.getWait().HardPause(60000);
		System.out.println(props.getProperty("btnsignin"));
		getLogin().click();
		browser.getWait().HardPause(30000);
		report.info("Scroll page down");
		browser.getPageScroll().down(400);
		browser.getWait().HardPause(30000);
	   
	}
	
	public void clickOnSignout() {
		report.info("Click on Signout");
		browser.getWait().HardPause(60000);
		getSignout().click();
		browser.getWait().HardPause(30000);
	}
	
	

}
