package com.RunnerClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@DataProvider
	private String[][] test_Data() {
		String name[][] = { 
				{ "Starc", "Mic" }, 
				{ "Barath", "Barath@998" }, 
				{ "SharmiKutty", "Barath" } 
				};

		return name;
	}

	@Test(dataProvider = "test_Data")
	private void Credential(String email, String password) {
		System.out.println(email);
		System.out.println(password);
	}
}
