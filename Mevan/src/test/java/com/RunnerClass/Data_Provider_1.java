package com.RunnerClass;

import org.testng.annotations.DataProvider;

public class Data_Provider_1 {
	@DataProvider
	public String[][] test_Data() {
		String name[][] = { 				
				{ "12/10/2022", "12/17/2022" }, 
			
				};

		return name;
	}
	@DataProvider
	public String[][] test_Data1() {
		String name[][] = { 				
				{"123"}, 
			
				};

		return name;
	}
}
