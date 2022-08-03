package com.RunnerClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confrim_Order {
public WebDriver driver;
@FindBy(xpath = "//span[text()='I confirm my order']")
private WebElement confirm;
public Confrim_Order(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getConfirm() {
	return confirm;
}

}
