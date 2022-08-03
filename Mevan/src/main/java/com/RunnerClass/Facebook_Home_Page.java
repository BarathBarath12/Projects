package com.RunnerClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Home_Page {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement password;

	public Facebook_Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
}