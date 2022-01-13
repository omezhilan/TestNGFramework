package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPojo extends BaseClass{

	public BookHotelPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(xpath="//input[@id='first_name']")
private WebElement fName;

@FindBy(id="last_name")
private WebElement lName;

@FindBy(id="address")
private WebElement addres;

@FindBy(id="cc_num")
private WebElement cCardNum;

@FindBy(id="cc_type")
private WebElement ccType;

@FindBy(id="cc_exp_month")
private WebElement expMonth;

@FindBy(id="cc_exp_year")
private WebElement expYear;

@FindBy(id="cc_cvv")
private WebElement ccvNum;

@FindBy(id="book_now")
private WebElement btnBook;

public WebElement getfName() {
	return fName;
}

public WebElement getlName() {
	return lName;
}

public WebElement getAddres() {
	return addres;
}

public WebElement getcCardNum() {
	return cCardNum;
}

public WebElement getCcType() {
	return ccType;
}

public WebElement getExpMonth() {
	return expMonth;
}

public WebElement getExpYear() {
	return expYear;
}

public WebElement getCcvNum() {
	return ccvNum;
}

public WebElement getBtnBook() {
	return btnBook;
}


}


