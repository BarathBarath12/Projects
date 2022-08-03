package com.runnerclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project1 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("BarathBarath");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Barath998");
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select option = new Select(location);
		option.selectByIndex(2);
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select a = new Select(hotel);
		a.selectByIndex(3);
		Thread.sleep(3000);
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select b = new Select(room);
		b.selectByIndex(4);
		WebElement numberOfRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select c = new Select(numberOfRooms);
		c.selectByIndex(1);
		WebElement inDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		inDate.sendKeys("07/07/2022");
		WebElement outDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		outDate.sendKeys("09/07/2022");
		WebElement adultsRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select d = new Select(adultsRoom);
		d.selectByIndex(1);
		WebElement childrenRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select f = new Select(childrenRoom);
		f.selectByIndex(1);
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		submit.click();
		WebElement click = driver.findElement(By.xpath("//input[@name ='radiobutton_0']"));
		click.click();
		Thread.sleep(3000);
		WebElement click1 = driver.findElement(By.xpath("//input[@name ='continue']"));
		click1.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("Barath");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("K");
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		address.sendKeys("8/32, kalai street, uk-70029");
		WebElement creditCardNumber = driver.findElement(By.xpath("//input[@name='cc_num']"));
		creditCardNumber.sendKeys("1234567891012415");
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select d1 = new Select(cardtype);
		d1.selectByIndex(1);
		WebElement expDate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select d2 = new Select(expDate);
		d2.selectByIndex(1);
		WebElement expYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select d3 = new Select(expYear);
		d3.selectByValue("2022");
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("823");
		WebElement bookNow = driver.findElement(By.xpath("//input[@name='book_now']"));
		bookNow.click();
		Thread.sleep(5000);
		WebElement myItinerary = driver.findElement(By.xpath("//input[@name ='my_itinerary']"));
		myItinerary.click();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\barat\\eclipse-workspace-3\\Atomation_Project\\Snap\\snap1.png");
		FileUtils.copyFile(source,destination);
		WebElement checkbox = driver.findElement(By.xpath("//input[@name ='check_all']"));
		checkbox.click();
		WebElement cancelAll = driver.findElement(By.xpath("//input[@name ='cancelall']"));
		cancelAll.click();
		Thread.sleep(3000);
		Alert g1 = driver.switchTo().alert();
		g1.accept();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//input[@name ='logout']"));
		logout.click();
		
		
		
		
	}

}
