package com.RunnerClass;

import org.openqa.selenium.WebDriver;

public class Automation_Page_Object_Manager {
	public WebDriver driver;
	private HomePage a;
	private BlousePage b;
	private FramePage c;
	private Proceed_To_Checkout d;
	private SummaryPage e;
	private SigninPage f;
	private AddressPage g;
	private ShippingPage h;
	private PaymentPage j;
	private Confrim_Order k;
	private Return_HomePage l;
	private ViewAccount l1;
	private MyAccount l2;

	public Automation_Page_Object_Manager(WebDriver driver) {
		this.driver = driver;

	}

	public HomePage getA() {
		if (a == null) {

			a = new HomePage(driver);
		}
		return a;
	}

	public BlousePage getB() {
		if (b == null) {

			b = new BlousePage(driver);
		}
		return b;
	}

	public FramePage getC() {
		if (c == null) {

			c = new FramePage(driver);
		}
		return c;
	}

	public Proceed_To_Checkout getD() {
		if (d == null) {
			d = new Proceed_To_Checkout(driver);
		}
		return d;
	}

	public SummaryPage getE() {
		if (e == null) {
			e = new SummaryPage(driver);
		}
		return e;
	}

	public SigninPage getF() {
		if (f == null) {
			f = new SigninPage(driver);
		}
		return f;
	}

	public AddressPage getG() {
		if (g == null) {
			g = new AddressPage(driver);
		}
		return g;
	}

	public ShippingPage getH() {
		if (h == null) {
			h = new ShippingPage(driver);
		}
		return h;
	}

	public PaymentPage getJ() {
		if (j == null) {
			j = new PaymentPage(driver);
		}
		return j;
	}

	public Confrim_Order getK() {
		if (k == null) {
			k = new Confrim_Order(driver);
		}
		return k;
	}

	public Return_HomePage getL() {
		if (l == null) {
			l = new Return_HomePage(driver);
		}
		return l;
	}

	public ViewAccount getL1() {
		if (l1 == null) {
			l1 = new ViewAccount(driver);
		}
		return l1;
	}

	public MyAccount getL2() {
		if (l2 == null) {
			l2 = new MyAccount(driver);
		}
		return l2;
	}

}
