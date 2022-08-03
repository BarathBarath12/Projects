package com.RunnerClass;

import org.testng.annotations.Test;

public class Description {

	@Test(description = "password pass sucessfully")
	private void password() {
		// TODO Auto-generated method stub
		System.out.println("Password");
	}

	@Test
	private void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
	}

	@Test(description = "sslc sucessfully completed")
	private void sslc() {
		// TODO Auto-generated method stub
		System.out.println("sslc");
	}

}
