package com.RunnerClass;

import org.testng.annotations.Test;

public class Always_Run {
	@Test
	private void logout() {
		// TODO Auto-generated method stub
		System.out.println(10/0);
	}

	@Test(dependsOnMethods = "logout", alwaysRun = true)
	private void orange() {
		// TODO Auto-generated method stub
		System.out.println("orange");
	}

	@Test
	private void eee() {
		// TODO Auto-generated method stub
		System.out.println("eee");
	}
}
