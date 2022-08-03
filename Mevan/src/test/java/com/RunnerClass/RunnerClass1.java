package com.RunnerClass;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RunnerClass1 extends UtilityFiles1 {
	public static WebDriver driver = UtilityFiles1.getBrowser("Chrome");
	public static Automation_Page_Object_Manager obj_Manager = new Automation_Page_Object_Manager(driver);

	@Test
	private void HomePage() throws InterruptedException {
		getUrl("http://automationpractice.com/index.php");
		actions(obj_Manager.getA().getWomen());
		actions(obj_Manager.getA().getBlouse());
		click(obj_Manager.getA().getBlouse());
	}

	@Test
	private void blouseCollection() throws InterruptedException {
		click(obj_Manager.getB().getSize());
		click(obj_Manager.getB().getCompositions());
		click(obj_Manager.getB().getStyle());
		click(obj_Manager.getB().getProperties());
		click(obj_Manager.getB().getAvailability());
		click(obj_Manager.getB().getManufactor());
		click(obj_Manager.getB().getCondition());
		actions(obj_Manager.getB().getImg());
		actions(obj_Manager.getB().getQuickView());
		click(obj_Manager.getB().getQuickView());
	}

	@Test(priority = 0)
	private void frameHandle() throws IOException, InterruptedException{
		frame(0);
		clear(obj_Manager.getC().getQuantity());
		String particular_Cell = particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\DataDriven.xlsx", 0, 2, 0);
		sendKeys(obj_Manager.getC().getQuantity(),particular_Cell);
		click(obj_Manager.getC().getColor());
		click(obj_Manager.getC().getAddToCard());
	}

	@Test(priority = 1)
	private void proceed() {
		frame1();
		click(obj_Manager.getD().getCheckout());
	}

	@Test(priority = 2)
	private void Summary(){
		
		click(obj_Manager.getE().getProceed_Checkout1());
	}

	@Test(priority = 3)
	private void signin() throws IOException{
	
		String particular_Cell2 = particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\DataDriven.xlsx", 0, 1, 1);
		sendKeys(obj_Manager.getF().getEmail(), particular_Cell2);
		String particular_Cell3 = particular_Cell("C:\\Users\\barat\\OneDrive\\Documents\\DataDriven.xlsx", 0, 1, 2);
		sendKeys(obj_Manager.getF().getPassword(), particular_Cell3);
		click(obj_Manager.getF().getSignin());
	}

	@Test(priority = 4)
	private void address() {
		click(obj_Manager.getG().getAddress());
		click(obj_Manager.getH().getTerms_Of_Service());
		click(obj_Manager.getH().getProceed_To_Checkout3());
	}

	@Test(priority = 5)
	private void payment(){
		click(obj_Manager.getJ().getPayment());
	}

	@Test(priority = 6)
	private void confirmPay(){
		click(obj_Manager.getK().getConfirm());
	}

	@Test(priority = 7)
	private void back_To_Home(){
		click(obj_Manager.getL().getReturnHome());
	}

	@Test(priority = 8)
	private void Sign_In() throws InterruptedException {
		click1(obj_Manager.getL1().getAccount());
	}

	@Test(priority = 9)
	private void order_History() throws InterruptedException {
		click1(obj_Manager.getL2().getOrderHistory());
	}

	@Test(priority = 10)
	private void screenShot() throws IOException{
		m1("C:\\Users\\barat\\eclipse-workspace-3\\Mevan\\Snap\\sanp.png");
	}
}
