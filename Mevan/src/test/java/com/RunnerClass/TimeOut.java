package com.RunnerClass;

import org.testng.annotations.Test;

public class TimeOut {
	@Test(timeOut = 7000)
	private void usename() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		System.out.println("Username");
		Thread.sleep(2000);
		System.out.println("hotel");
		Thread.sleep(2000);
		System.out.println("Page load");
		
}
}