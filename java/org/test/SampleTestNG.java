package org.test;

import org.base.BaseClass;
import org.testng.annotations.Test;

public class SampleTestNG extends BaseClass {
	
@Test(priority=-11)
	private void tc1() {
		
		System.out.println("Test 1");
	}
	
@Test(priority = 8)
private void tc2() {
	System.out.println("Test 2");
}

@Test(priority = 3)
private void tc3() {
	System.out.println("Test 3");
}

@Test(priority = -15)
private void tc4() {
	System.out.println("Test 4");
}

}
