package MyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\barat\\eclipse-workspace-3\\Selenium\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("stylezzbarath992@gmail.com");
		WebElement create = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		create.click();
		Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("(//input[@id='id_gender1'])"));
		title.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstName.sendKeys("Barath");
		WebElement LastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		LastName.sendKeys("K");
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("Barath@998");
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select a = new Select(day);
		a.selectByIndex(13);
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select b = new Select(month);
		b.selectByIndex(11);
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select c = new Select(year);
		c.selectByValue("1998");
		WebElement offers = driver.findElement(By.xpath("//input[@name='optin']"));
		offers.click();
		WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
		company.sendKeys("Accenture");
		WebElement address1 = driver.findElement(By.xpath("//input[@id='address1']"));
		address1.sendKeys("9/32, Solliganallur, old thambaram");
		WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
		address2.sendKeys("9/32, aravid Street, old thambaram");
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Chennai");
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select d = new Select(state);
		d.selectByValue("1");
		WebElement pincode = driver.findElement(By.xpath("//input[@id='postcode']"));
		pincode.sendKeys("60000");
		WebElement addinfo = driver.findElement(By.xpath("//textarea[@name='other']"));
		addinfo.sendKeys("Nothing");
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		phoneNumber.sendKeys("9830820933");
		WebElement register = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		register.click();

	}
}
