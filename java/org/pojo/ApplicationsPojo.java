package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApplicationsPojo extends BaseClass {
	public ApplicationsPojo(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="inputValEnter")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement ok;
	
	public WebElement getOk() {
		return ok;
	}
	

	//@FindBy(xpath="//div[@id='corover-close-btn']")
	@FindBy(xpath="//img[@id='corover-disha-icon']")
	private WebElement ads;

	public WebElement getAds() {
	return ads;
}

	@FindBy(xpath="//span[text()='Hello, Sign in']")
	private WebElement signIn;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	private WebElement create;
	
	@FindBy(id="ap_customer_name")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='ap_phone_number']")
	private WebElement phone;
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement pass;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement cbutton;
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	public WebElement getCreate() {
		return create;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getCbutton() {
		return cbutton;
	}

	
		
//	@FindBy(xpath="//input[@type='email']")
//	private WebElement emailId;
//		
//	@FindBy(xpath="//input[@id='continue']")
//	private WebElement btnCont;
//		
//	@FindBy(xpath="//input[@type='password']")
//	private WebElement txtPass;
		
//	@FindBy(xpath="//input[@id='signInSubmit']")
//	private WebElement sumimt;

	@FindBy(xpath="//span[@class='ng-tns-c58-8 ui-autocomplete ui-widget']")
	private WebElement from;
			
	@FindBy(xpath="//span[@class='ng-tns-c58-9 ui-autocomplete ui-widget']")
	private WebElement to;
		
	@FindBy(xpath="//span[@class='ng-tns-c59-10 ui-calendar']")
	private WebElement date;
	
	@FindBy(xpath="//span[@class='ng-tns-c66-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")
	private WebElement classes;
	
	@FindBy(xpath="//div[@class='ng-tns-c66-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")
	private WebElement general;
	@FindBy(xpath="//button[@label='Find Trains']")
	private WebElement findBtn;
		
	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getClasses() {
		return classes;
	}

	public WebElement getGeneral() {
		return general;
	}

	public WebElement getFindBtn() {
		return findBtn;
	}

		

//		public WebElement getEmailId() {
//			return emailId;
//		}
//
//		public WebElement getBtnCont() {
//			return btnCont;
//		}
//
//		public WebElement getTxtPass() {
//			return txtPass;
//		}
//
//		public WebElement getSumimt() {
//			return sumimt;
//		}

}
		