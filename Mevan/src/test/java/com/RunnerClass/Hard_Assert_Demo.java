package com.RunnerClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Demo {
	@Test
	private void credentials() {
		String actual = "Barath";
		String expected = "Barath";
		Assert.assertEquals(actual, expected);
		System.out.println("Expected meets actual");
	}
	@Test
	private void credentials1() {
		String actual = "Barath";
		String expected = "arath";
		Assert.assertNotEquals(actual, expected);
		System.out.println("Expected meets actual");
	}
	@Test
	private void credentials2() {
		String actual = "Barath";
		String expected = "Barath";
		Assert.assertSame(actual, expected);
		System.out.println("Expected meets actual");
	}
}
