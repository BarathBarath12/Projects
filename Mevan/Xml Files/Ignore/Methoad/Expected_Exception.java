package Ignore.Methoad;

import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(expectedExceptions = ArithmeticException.class)
	private void password() {
		// TODO Auto-generated method stub
		System.out.println(10/0);
	}
}
