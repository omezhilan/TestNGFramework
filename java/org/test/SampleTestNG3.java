package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.pojo.LoginPojoFb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestNG3 extends BaseClass {
	
	@BeforeClass
	private void browserLaunch() {
		
		launchBrowser();
		maxBrowser();	

	}

	@AfterClass
	private void browserClose() {

		closeBrowser();
	}

	@BeforeMethod
	private void startsTime() {
		passUrl("https://www.facebook.com/");
		Date d= new Date();
		System.out.println(d);
		
	}

	@AfterMethod
	private void endsTime() throws InterruptedException {
		Date d= new Date();
		System.out.println(d);
		Thread.sleep(3000);
	}
	
//	@Parameters({"username","password"})
//	@Test
//	private void tc1(String user, String pass) {
//		
//		LoginPojoFb l= new LoginPojoFb();
//		
//		toInput(l.getTxtUser(), user);
//		toInput(l.getTxtPass(), pass);
//		btnClick(l.getBtnClick());
//		
//	}
//*************************or*****************************//	
//	@DataProvider(name="Sampledata")
//	public String[][] data() {
//		return new String[][] {
//			
//			{"java","java@123"},{"phython","phython@123"},{"selenium","selenium@123"}
//			
//		};
//		
//	}
		
	@Test(dataProvider="Sampledata", dataProviderClass = DataProviderTestNG.class)
	
		private void tc1(String user, String pass) {
		
		LoginPojoFb l= new LoginPojoFb();
		
		toInput(l.getTxtUser(), user);
		toInput(l.getTxtPass(), pass);
		btnClick(l.getBtnClick());
		
	}


}
