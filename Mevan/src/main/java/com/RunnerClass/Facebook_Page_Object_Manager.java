package com.RunnerClass;

import org.openqa.selenium.WebDriver;

public class Facebook_Page_Object_Manager {
	public WebDriver driver;
	private Facebook_Home_Page page;

	public Facebook_Page_Object_Manager(WebDriver driver) {
		this.driver = driver;
	}

	public Facebook_Home_Page getPage() {
		page = new Facebook_Home_Page(driver);
		return page;
	}
}
