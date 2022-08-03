package com.RunnerClass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit_Demo {
	@Before
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}

	@Test
	public void username() {
		// TODO Auto-generated method stub
		System.out.println("username");
	}

	@Test
	public void password() {
		// TODO Auto-generated method stub
		System.out.println("password");
	}

	@After
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
	}
}
