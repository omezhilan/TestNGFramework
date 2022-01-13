package org.pojo;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPojo extends BaseClass{
	
	public BookingConfirmationPojo() {
		
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@id='order_no']")
private WebElement orderNum;
	
public WebElement getOrderNum() {
	return orderNum;
}

}



