package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPojoFb extends BaseClass{
	
	
	public LoginPojoFb() {
		
		PageFactory.initElements(driver, this);
		}
	

@FindBy(id="email")
private WebElement txtUser;

@FindBy(id="pass")
private WebElement txtPass;

@FindBy(name="login")
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

