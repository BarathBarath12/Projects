package com.RunnerClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Data_Provider_2 extends UtilityFiles1 {
	public static WebDriver driver = UtilityFiles1.getBrowser("chrome");
	public static Adactin_Page_Object_Manager objManager = new Adactin_Page_Object_Manager(driver);

	@Test(dataProvider = "test_Data", dataProviderClass = Data_Provider_1.class, retryAnalyzer = Rerun_Class.class)
	private void Credential(String username, String password) {
		getUrl("https://adactinhotelapp.com/");
		sendKeys(objManager.getPage().getUsername(), username);
		sendKeys(objManager.getPage().getPassword(), password);
		String expected = "https://adactinhotelapp.com/SearchHotel.php";
		String actual = getCurrentUrl();
		Assert.assertEquals(actual, expected);
		System.out.println("Hotel Pruchase");
	}
}
