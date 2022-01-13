package org.test;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.pojo.LoginPojoFb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SampleTestNG1 extends BaseClass {
	
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

@Test
private void tc1() throws IOException {
	
	LoginPojoFb l= new LoginPojoFb();
	toInput(l.getTxtUser(), excelRead(1, 0));
	toInput(l.getTxtPass(), excelRead(1, 1));
	btnClick(l.getBtnClick());
	
}

@Test
private void tc3() throws IOException, InterruptedException {
	LoginPojoFb l3= new LoginPojoFb();
	toInput(l3.getTxtUser(), excelRead(16, 0));
	toInput(l3.getTxtPass(), excelRead(16, 1));
	btnClick(l3.getBtnClick());
	Thread.sleep(2000);
}

@Test
private void tc2() throws IOException, InterruptedException {
	LoginPojoFb l2= new LoginPojoFb();
	toInput(l2.getTxtUser(), excelRead(17, 0));
	toInput(l2.getTxtPass(), excelRead(17, 1));
	btnClick(l2.getBtnClick());
	Thread.sleep(2000);
	
}


}
