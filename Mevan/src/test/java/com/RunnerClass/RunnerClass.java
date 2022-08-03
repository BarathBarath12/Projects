package com.RunnerClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RunnerClass extends UtilityFiles {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		driver = create_Browser("chrome");
		openUrl("https://adactinhotelapp.com/");

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		userdata(username, "BarathBarath");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		userpassword(password, "Barath@12");
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login(login);
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		location(location, 2);
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		hotels(hotel, 3);
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		rooms(room, 3);
		WebElement numberOfRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		numberofrooms(numberOfRooms, 2);
		WebElement inDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		clear(inDate);
		indate(inDate, "08/09/2022");
		WebElement outDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		clear1(outDate);
		outdate(outDate, "09/09/2022");
		WebElement adultsRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		adultroom(adultsRoom, 1);
		WebElement childrenRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		childroom(childrenRoom, 1);
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		click(submit);
		WebElement click = driver.findElement(By.xpath("//input[@name ='radiobutton_0']"));
		click1(click);
		WebElement click1 = driver.findElement(By.xpath("//input[@name ='continue']"));
		click2(click1);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		fstName(firstname, "barath");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lstName(lastname, "k");
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address(address, "2/3, elcot, uk-89892");
		WebElement creditCardNumber = driver.findElement(By.xpath("//input[@name='cc_num']"));
		cardnumber(creditCardNumber, "1289882899828232");
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		cardtype(cardtype, 1);
		WebElement expDate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		expdate(expDate, 1);
		WebElement expYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		expyear(expYear, "2022");
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv(cvv, "123");
		WebElement bookNow = driver.findElement(By.xpath("//input[@name='book_now']"));
		click3(bookNow);
		WebElement myItinerary = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		click4(myItinerary);
	}

}
