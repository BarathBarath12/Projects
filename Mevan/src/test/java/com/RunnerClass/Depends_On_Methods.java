package com.RunnerClass;

import org.testng.annotations.Test;

public class Depends_On_Methods {
	@Test(priority = 4)
	private void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
	}

	@Test(dependsOnMethods = "logout")
	private void orange() {
		// TODO Auto-generated method stub
		System.out.println("orange");
	}

	@Test(priority = -1)
	private void eee() {
		// TODO Auto-generated method stub
		System.out.println("eee");
	}

}
