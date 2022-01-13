package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPojo extends BaseClass{
	
	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
		}
	

@FindBy(id="username")
private WebElement txtUser;

@FindBy(id="password")
private WebElement txtPass;

@FindBy(id="login")
private WebElement btnClick;

public WebElement getTxtUser() {
	return txtUser;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnClick() {
	return btnClick;
}




}

