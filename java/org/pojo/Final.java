package org.pojo;

import java.io.IOException;

import org.base.BaseClass;

public class Final extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		passUrl("http://adactinhotelapp.com/index.php");
		maxBrowser();
		toWait();	
		
		//Login Page
		LoginPojo l = new LoginPojo();
		toInput(l.getTxtUser(),excelRead(1,0));
		toInput(l.getTxtPass(),excelRead(1,1));
		btnClick(l.getBtnClick());
		
		//Search Hotel Page 
		SearchHotelPojo s= new SearchHotelPojo();
		toInput(s.getLocation(),excelRead(3, 0));
		toInput(s.getHotel(), excelRead(3, 1));
		toInput(s.getRoomType(), excelRead(3, 2));
		toInput(s.getNumberOfRoom(), excelRead(3, 3));
		toInput(s.getCheckIn(), excelRead(3, 4));
		toInput(s.getCheckOut(), excelRead(3, 5));
		toInput(s.getAdults(), excelRead(3, 6));
		toInput(s.getChildren(), excelRead(3, 7));
		btnClick(s.getBtnClick());
		radioBtnClick(s.getRadio());
		btnClick(s.getBtncontinue());
		
		//To book a Hotel
		BookHotelPojo b=new BookHotelPojo();
		toInput(b.getfName(), excelRead(5,0));
		toInput(b.getlName(), excelRead(6, 1));
		toInput(b.getAddres(), excelRead(6, 2));
		toInput(b.getcCardNum(), excelRead(6, 3));
		toInput(b.getCcType(), excelRead(6, 4));
		toInput(b.getExpMonth(), excelRead(6, 5));
		toInput(b.getExpYear(), excelRead(6, 6));
		toInput(b.getCcvNum(), excelRead(6, 7));
		btnClick(b.getBtnBook());
		
		//Booking Confirmation Pa
		BookingConfirmationPojo c=new BookingConfirmationPojo();
		
		getValue(c.getOrderNum());

		
		
	}

	
		
	

}
