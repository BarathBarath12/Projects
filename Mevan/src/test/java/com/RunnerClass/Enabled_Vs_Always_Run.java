package com.RunnerClass;

import org.testng.annotations.Test;

public class Enabled_Vs_Always_Run {
	@Test(alwaysRun = true, enabled = false)
	private void orange() {
		// TODO Auto-generated method stub
		System.out.println("orange");
	}
}
