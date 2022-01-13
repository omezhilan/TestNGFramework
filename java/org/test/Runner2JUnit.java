package org.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.testng.annotations.Test;

public class Runner2JUnit {

@Test
public void test() {
	
	Result r = JUnitCore.runClasses(A.class,B.class,C.class);
	
	System.out.println("My failure Count is :"+ r.getFailureCount());
	System.out.println("My Ignore Count is :"+r.getIgnoreCount());
	System.out.println("My Total RunCount is :"+r.getRunCount());
	System.out.println("My Run Time Count is :"+r.getRunTime());
	
	List<Failure> failures = r.getFailures();
	
	for (Failure f : failures) {
		System.out.println(f);
	}
	
}
	
	
}
