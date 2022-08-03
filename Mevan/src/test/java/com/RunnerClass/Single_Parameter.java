package com.RunnerClass;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Single_Parameter extends UtilityFiles1 {
	public static WebDriver driver = UtilityFiles1.getBrowser("chrome");
	public static Adactin_Page_Object_Manager objManager = new Adactin_Page_Object_Manager(driver);

	@Parameters({"emailid","pass"})
		@Test(retryAnalyzer = Rerun_Class.class)
		private void Adactin(@Optional("BarathBarath") String username, @Optional("Barath@12") String password) {
			getUrl("https://adactinhotelapp.com/");
			sendKeys(objManager.getPage().getUsername(), username);
			sendKeys(objManager.getPage().getPassword(), password);
			String expected = "https://adactinhotelapp.com/SearchHotel.php";
			String actual = getCurrentUrl();
			Assert.assertEquals(actual, expected);
			System.out.println("Hotel Pruchase");

		}

	}

