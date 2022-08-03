package com.RunnerClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Retry_I_Annotation extends UtilityFiles1 {
	public static WebDriver driver = UtilityFiles1.getBrowser("chrome");
	public static Adactin_Page_Object_Manager objManager = new Adactin_Page_Object_Manager(driver);
	public static Facebook_Page_Object_Manager objManager1 = new Facebook_Page_Object_Manager(driver);

	@Test(dataProvider = "test_Data", dataProviderClass = Data_Provider_1.class)
	private void Credential(String username, String password) {
		getUrl("https://adactinhotelapp.com/");
		sendKeys(objManager.getPage().getUsername(), username);
		sendKeys(objManager.getPage().getPassword(), password);
		String expected = "https://adactinhotelapp.com/SearchHotel.php";
		String actual = getCurrentUrl();
		Assert.assertEquals(actual, expected);
		System.out.println("Hotel Pruchase");
	}

	@Test(dataProvider = "test_Data", dataProviderClass = Data_Provider_1.class)
	private void faceBook(String email, String pass) {
		getUrl("https://www.facebook.com/login/");
		sendKeys(objManager1.getPage().getUsername(), email);
		sendKeys(objManager1.getPage().getPassword(), pass);
		String expected = "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
		String actual = getCurrentUrl();
		Assert.assertEquals(actual, expected);
		System.out.println("Welcome Facebook");
	}

}
