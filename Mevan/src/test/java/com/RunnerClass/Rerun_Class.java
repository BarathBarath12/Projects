package com.RunnerClass;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun_Class implements IRetryAnalyzer {
	int start = 1;
	int end = 2;

	public boolean retry(ITestResult result) {
		if (start <= end) {
			start++;
			return true;
		}

		return false;
	}

}
