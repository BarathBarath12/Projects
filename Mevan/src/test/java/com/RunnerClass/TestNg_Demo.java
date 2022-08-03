package com.RunnerClass;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Demo {
	@BeforeSuite
	private void chrome() {
		// TODO Auto-generated method stub
		System.out.println("Lanuching Chrome");
	}

	@BeforeTest
	private void url() {
		// TODO Auto-generated method stub
		System.out.println("url");
	}

	@BeforeClass
	private void home_Page() {
		// TODO Auto-generated method stub
		System.out.println("HomePage");
	}

	@BeforeMethod
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

	@AfterMethod
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout");
	}

	@AfterClass
	private void return_Home_Page() {
		// TODO Auto-generated method stub
		System.out.println("Return home");
	}

	@AfterTest
	private void logout_Homepage() {
		// TODO Auto-generated method stub
		System.out.println("log out home page");
	}

	@AfterSuite
	private void close_Browser() {
		// TODO Auto-generated method stub
		System.out.println("Close Browser");
	}
}
