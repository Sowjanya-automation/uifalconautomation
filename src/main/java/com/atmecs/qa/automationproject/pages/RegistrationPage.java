package com.atmecs.qa.automationproject.pages;

import java.util.Properties;
import org.openqa.selenium.WebElement;
import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.atmecs.qa.automationproject.utility.AppConstants;
import com.atmecs.qa.automationproject.utility.CommonUtils;

public class RegistrationPage {
	
	private ReportLogService report = new ReportLogServiceImpl(RegistrationPage.class);
	public static Properties props = CommonUtils.loadProperty(AppConstants.REGISTRATION_PROPERTIES_FILE);	
	Browser browser;
	public RegistrationPage(Browser browser) {
		this.browser = browser;	
	}

		
	private WebElement getEmailAddress() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtemailAddress"));		
	}
	
	private WebElement getCreateAccountButton() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("btnCreateAnAccount"));		
	}
	
	private WebElement getGender() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("rdGender"));		
	}
	private WebElement getCustomerFirstName() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtCustomerFirstname"));		
	}
	
	private WebElement getCustomerLastName() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtCustomerLastname"));		
	}

	private WebElement getPassword() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtPassword"));		
	}

	
	private WebElement getAddress1() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtAddress1"));		
	}
	
	
	private WebElement getCity() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtCity"));		
	}
	
	
	private WebElement getPostCode() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtPostCode"));		
	}
	
	
	private WebElement getMobileNumber() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtMobilenumber"));		
	}
	
	private WebElement getAlias() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("txtAlias"));		
	}
	
	private WebElement getRegister() {
		return browser.getFindFromBrowser().findElementByXpath(props.getProperty("btnRegister"));		
	}

public void enterEmailAddress(String emailAddress) {
	report.info("Enter Email Address");
	browser.getWait().implicitWait(20000);
	getEmailAddress().sendKeys(emailAddress);
}

public void clickOnCreateAccountButton() {
	report.info("Click on create button");
	browser.getWait().implicitWait(20000);
	getCreateAccountButton().click();
}

public void clickGenderRadioButton() {
	report.info("Click on create button");
	browser.getWait().implicitWait(20000);
	getGender().click();
}

public void enterCustomerFirstName(String firstname) {
	report.info("Enter Customer First name");
	browser.getWait().implicitWait(20000);
	getCustomerFirstName().sendKeys(firstname);
}

public void enterCustomerLastName(String lastname) {
	report.info("Enter Customer Last name");
	browser.getWait().implicitWait(20000);
	getCustomerLastName().sendKeys(lastname);
}

public void enterPassword(String password) {
	report.info("Enter Customer Password");
	browser.getWait().implicitWait(20000);
	getPassword().sendKeys(password);
}

public void selectDays() {
	report.info("Select Day");
	browser.getWait().implicitWait(20000);
	browser.getSelectDropDown().selectByIndex(LocatorType.ID, "days", 4);

}

public void selectMonths() {
	report.info("Select Month");
	browser.getWait().implicitWait(20000);
	browser.getSelectDropDown().selectByIndex(LocatorType.ID, "months", 4);

}

public void selectYears() {
	report.info("Select Year");


browser.getSelectDropDown().selectByIndex(LocatorType.ID, "years", 4);

}


public void enterAddress1(String address) {
	report.info("Enter Address1");
	browser.getWait().implicitWait(20000);
	getAddress1().sendKeys(address);
}


public void enterCity(String city) {
	report.info("Enter City");
	browser.getWait().implicitWait(20000);
	getCity().sendKeys(city);
}

public void enterState() {
	report.info("Enter State");
	browser.getWait().implicitWait(20000);
	browser.getSelectDropDown().selectByIndex(LocatorType.ID, "id_state", 3);
}

public void enterCountry() {
	report.info("Enter Country");
	browser.getWait().implicitWait(20000);
	browser.getSelectDropDown().selectByIndex(LocatorType.ID, "id_country", 1);	
}

public void enterMobileNumber(String mobilenumber) {
	report.info("Enter Mobile number");
	browser.getWait().implicitWait(20000);
	getMobileNumber().sendKeys(mobilenumber);
}

public void enterPostCode(String postcode) {
	report.info("Enter Post coder");
	browser.getWait().implicitWait(20000);
	getPostCode().sendKeys(postcode);
}

public void enterAlias(String alias) {
	report.info("Enter Alias");
	browser.getWait().implicitWait(20000);
	getAlias().sendKeys(alias);
}

public void clickOnRegisterButton() {
	report.info("Enter Register Button");
	browser.getWait().implicitWait(20000);
	getRegister().click();
}








}
