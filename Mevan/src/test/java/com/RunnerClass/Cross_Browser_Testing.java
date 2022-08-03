package com.RunnerClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Cross_Browser_Testing extends UtilityFiles1 {
	public static WebDriver driver;

	@Test
	private void adactin() {
		// TODO Auto-generated method stub
		driver = getBrowser("Chrome");
		getUrl("https://adactinhotelapp.com/index.php");
	}

	@Test
	private void facebook() {
		// TODO Auto-generated method stub
		driver = getBrowser("edge");
		getUrl("https://www.facebook.com/login/");
	}
}
