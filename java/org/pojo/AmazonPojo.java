package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass {
	public AmazonPojo(){
		PageFactory.initElements(driver, this);
	}
	
	
	

	@FindBy(xpath="//span[text()='Hello, Sign in']")
	private WebElement signIn;
		
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailId;
		
	@FindBy(xpath="//input[@id='continue']")
	private WebElement btnCont;
		
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPass;
		
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement sumimt;
	
	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getBtnCont() {
		return btnCont;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getSumimt() {
		return sumimt;
	}



}
