package com.RunnerClass;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Invocation_Count {
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

	@Test(invocationCount = 8, invocationTimeOut = 3)
	private void password() {
		// TODO Auto-generated method stub
		System.out.println("password");
	}

	@Test(priority =1)
	private void hotel() {
		// TODO Auto-generated method stub
		System.out.println("star hotel");
	}

	@Test
	private void room() {
		// TODO Auto-generated method stub
		System.out.println("single");
	}
}
