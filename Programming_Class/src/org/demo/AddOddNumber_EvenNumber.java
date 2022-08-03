package org.demo;

public class AddOddNumber_EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddNumber = 0;
		int evenNumber = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenNumber = evenNumber + i;

			}

			else if (i%2!=0) {
				oddNumber = oddNumber+i;
			}
			System.out.println("Odd number is: "  + oddNumber);
			System.out.println("Even Number is: " + evenNumber);
		}
	}

}
