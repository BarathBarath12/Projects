package com.RunnerClass;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	private void credentials() {
		String actual = "Barath";
		String expected = "arath";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		soft.assertAll();
		System.out.println("Expected meets actual");
	}
	@Test
	private void credentials1() {
		String actual = "Barath";
		String expected = "arath";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
	
		System.out.println("Expected meets actual");
	}
}
