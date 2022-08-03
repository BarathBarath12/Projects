package com.RunnerClass;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RunnerClass2 extends UtilityFiles1 {
	public static WebDriver driver = UtilityFiles1.getBrowser("chrome");
	public static Adactin_Page_Object_Manager objManager = new Adactin_Page_Object_Manager(driver);

	@Test()
	private void Adactin() throws InterruptedException, IOException {
		getUrl("https://adactinhotelapp.com/");
		String username1 = particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\TestCase.xlsx", 0, 1, 0);
		sendKeys(objManager.getPage().getUsername(), username1);
		String password1 = particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\TestCase.xlsx", 0, 1, 1);
		sendKeys(objManager.getPage().getPassword(), password1);
		click(objManager.getPage().getLogin());
		String expected = "https://adactinhotelapp.com/SearchHotel.php";
		String actual = getCurrentUrl();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1, dataProvider = "test_Data", dataProviderClass = Data_Provider_1.class)
	private void search_Hotels(String date, String date1) throws IOException {
		select_By_Index(objManager.getSearch().getLocation(), 2);
		select_By_Index(objManager.getSearch().getHotels(), 1);
		select_By_Index(objManager.getSearch().getRoom(), 2);
		select_By_Index(objManager.getSearch().getNumber_Of_Rooms(), 1);
		clear(objManager.getSearch().getCheck_In_Date());
		// String name11 =
		// particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\TestCase.xlsx", 0, 2,
		// 0);
		sendKeys(objManager.getSearch().getCheck_In_Date(), date);
		clear(objManager.getSearch().getCheck_Out_Date());
		// String name2 =
		// particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\TestCase.xlsx", 0, 2,
		// 1);
		sendKeys(objManager.getSearch().getCheck_Out_Date(), date1);
		select_By_Index(objManager.getSearch().getAdult_Room(), 2);
		select_By_Index(objManager.getSearch().getChild_Room(), 1);
		click(objManager.getSearch().getSearch());
	}

	@Test(priority = 2)
	private void radioButton() throws InterruptedException {
		click1(objManager.getSelect().getRadioButton());
		click1(objManager.getSelect().getContinues());
	}

	@Test(priority = 3, dataProvider = "test_Data1", dataProviderClass = Data_Provider_1.class)
	private void book(String cvv) throws IOException {
		String fstname = particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\TestCase.xlsx", 0, 3, 0);
		sendKeys(objManager.getBook().getName(), fstname);
		String lstname = particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\TestCase.xlsx", 0, 3, 1);
		sendKeys(objManager.getBook().getLastName(), lstname);
		String address = particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\TestCase.xlsx", 0, 4, 0);
		sendKeys(objManager.getBook().getAddress(), address);
		String cardno = particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\TestCase.xlsx", 0, 4, 1);
		sendKeys(objManager.getBook().getCardNumber(), cardno);
		select_By_Index(objManager.getBook().getCardType(), 2);
		select_By_Index(objManager.getBook().getExpDate(), 2);
		String expyear = particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\TestCase.xlsx", 0, 5, 0);
		sendKeys(objManager.getBook().getExpYear(), expyear);
		// String cvv =
		// particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\TestCase.xlsx", 0, 5,
		// 1);
		sendKeys(objManager.getBook().getCvv(), cvv);
		click(objManager.getBook().getBookNow());
	}
//
//	@Test(priority = 4)
//	private void booking_Confirmation() throws InterruptedException {
//		click1(objManager.getConfirm().getMyItinerary());
//	}
//
//	@Test(priority = 5)
//	private void logout() throws InterruptedException {
//		click1(objManager.getLogout().getLogout());
//	}
}
