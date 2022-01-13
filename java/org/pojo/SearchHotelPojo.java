package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPojo extends BaseClass {
	
	
public SearchHotelPojo() {
		
		PageFactory.initElements(driver, this);
		}
	
@FindBy(xpath="//select[@id='location']")
private WebElement location;

@FindBy(id="hotels")
private WebElement hotel;

@FindBy(id="room_type")
private WebElement roomType;

@FindBy(id="room_nos")
private WebElement numberOfRoom;

@FindBy(id="datepick_in")
private WebElement checkIn;

@FindBy(id="datepick_out")
private WebElement checkOut;

@FindBy(id="adult_room")
private WebElement adults;

@FindBy(id="child_room")
private WebElement children;

@FindBy(id="Submit")
private WebElement btnClick;

@FindBy(id="radiobutton_0")
private WebElement radio;

@FindBy(id="continue")
private WebElement btncontinue;



public WebElement getBtncontinue() {
	return btncontinue;
}

public WebElement getRadio() {
	return radio;
}

public WebElement getLocation() {
	return location;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getNumberOfRoom() {
	return numberOfRoom;
}

public WebElement getCheckIn() {
	return checkIn;
}

public WebElement getCheckOut() {
	return checkOut;
}

public WebElement getAdults() {
	return adults;
}

public WebElement getChildren() {
	return children;
}

public WebElement getBtnClick() {
	return btnClick;
}







}
