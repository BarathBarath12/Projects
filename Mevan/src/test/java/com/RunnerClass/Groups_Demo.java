package com.RunnerClass;

import org.testng.annotations.Test;

public class Groups_Demo {
	@Test(groups = "zusic")
	private void password() {
		// TODO Auto-generated method stub
		System.out.println("Password");
	}

	@Test(groups = "zusic")
	private void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
	}

	@Test
	private void sslc() {
		// TODO Auto-generated method stub
		System.out.println("sslc");
	}

	@Test
	private void hsslc() {
		// TODO Auto-generated method stub
		System.out.println("hsslc");
	}
	@Test(groups = "starc")
	private void visa() {
		System.out.println("visa");
	}
	@Test(groups = "starc")
	private void studio() {
		System.out.println("studio");
	}
}
