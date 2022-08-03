package com.RunnerClass;

import org.testng.annotations.Test;

public class Priority_Attribute {
	@Test(priority = -1)
	private void username() {
		// TODO Auto-generated method stub
		System.out.println("username");
	}

	@Test(priority = 1)
	private void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}

	@Test(priority = 2)
	private void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
	}

	@Test(priority = 1)
	private void password() {
		// TODO Auto-generated method stub
		System.out.println("password");
	}
}
