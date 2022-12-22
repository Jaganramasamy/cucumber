package com.pageobjectmodel;

import org.commonactions.CommonAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPom extends CommonAction {
	CommonAction co = new CommonAction();
	
	public FacebookPom(){
		PageFactory.initElements(co.driver, this);
	}
	
	@FindBy(xpath="(//*[@role='button'])[2]")
    private WebElement signup;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement fname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement lname;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement passwd;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement mle;
	
	@FindBy(xpath="(//*[text()='Sign Up'])[3]")
	private WebElement submit;

	@FindBy(name="reg_email__")
    private WebElement mbl;
	

	

public WebElement getMbl() {
	return mbl;
}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMle() {
		return mle;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
}
