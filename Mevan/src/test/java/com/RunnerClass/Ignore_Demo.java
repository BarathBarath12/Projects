package com.RunnerClass;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Demo {
	@Test(priority = -1)
	private void username() {
		// TODO Auto-generated method stub
		System.out.println("username");
	}

	@Ignore
	@Test
	private void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}

	@Test(enabled = false)
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
