package org.test;

import org.testng.annotations.DataProvider;

public class DataProviderTestNG {
	
	@DataProvider(name="Sampledata")
	public String[][] data() {
		return new String[][] {
			
			{"java","java@123"},{"phython","phython@123"},{"selenium","selenium@123"}
			
		};
		
	}


}
