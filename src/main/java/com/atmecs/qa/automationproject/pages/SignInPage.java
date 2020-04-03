package com.atmecs.qa.automationproject.pages;


import java.util.Properties;
import org.openqa.selenium.WebElement;
import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.atmecs.qa.automationproject.utility.AppConstants;
import com.atmecs.qa.automationproject.utility.CommonUtils;


public class SignInPage {
	
	private ReportLogService report = new ReportLogServiceImpl(SignInPage.class);
	public static Properties props = CommonUtils.loadProperty(AppConstants.SIGNINPAGE_PROPERTIES_FILE);
	public static Properties testdata = CommonUtils.loadProperty(AppConstants.TESTDATA_FILE_PATH);


	Browser browser;

	public SignInPage(Browser browser) {
		this.browser = browser;
	
	}
	
	private WebElement getUsername() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtemailAddress"));		

	}
	
	private WebElement getPassword() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtpassword"));		

	}
	
	private WebElement getSigninButton() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("btnsignIn"));		

	}
	
	private WebElement getWomen() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("women"));		

	}

	public void enterUsername() {
		report.info("Enter Username");
		browser.getWait().implicitWait(60000);
		getUsername().sendKeys(testdata.getProperty("username"));		
	}
	
	public void enterPassword() {
		report.info("Enter Password");
		browser.getWait().implicitWait(60000);
		getPassword().sendKeys(testdata.getProperty("password"));
	}
	
	public void clickonSignin() {
		report.info("Click on signin button");
		browser.getWait().implicitWait(30000);
		getSigninButton().click();
		browser.getWait().implicitWait(60000);
	}
	
	public void clickonWomenTab() {
		report.info("Click on Women button");
		browser.getWait().implicitWait(30000);
		getWomen().click();
		browser.getWait().implicitWait(60000);
	}
	
}
