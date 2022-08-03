package com.RunnerClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAccount {
	public ViewAccount(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver driver;
	@FindBy(xpath = "//span[text()='Barath K']")
	private WebElement account;
	public WebElement getAccount() {
		return account;
	}
}
