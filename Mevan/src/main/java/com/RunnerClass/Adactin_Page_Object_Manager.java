package com.RunnerClass;

import org.openqa.selenium.WebDriver;

public class Adactin_Page_Object_Manager {
	public WebDriver driver;
	private Adactin_Login_Page page;
	private Adactin_Serach_Hotel search;
	private Adactin_Select_Hotel select;
	private Adactin_Book_A_Hotel book;
	private Adactin_Booking_Confirmation confirm;
	private Adactin_Logout logout;

	public Adactin_Logout getLogout() {
		if (logout == null) {
			logout = new Adactin_Logout(driver);
		}
		return logout;
	}

	public Adactin_Booking_Confirmation getConfirm() {
		if (confirm == null) {
			confirm = new Adactin_Booking_Confirmation(driver);
		}
		return confirm;
	}

	public Adactin_Book_A_Hotel getBook() {
		if (book == null) {
			book = new Adactin_Book_A_Hotel(driver);
		}
		return book;
	}

	public Adactin_Select_Hotel getSelect() {
		if (select == null) {
			select = new Adactin_Select_Hotel(driver);
		}
		return select;
	}

	public Adactin_Serach_Hotel getSearch() {
		if (search == null) {
			search = new Adactin_Serach_Hotel(driver);
		}
		return search;

	}

	public Adactin_Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Adactin_Login_Page getPage() {
		if (page == null) {
			page = new Adactin_Login_Page(driver);
		}

		return page;
	}

}
