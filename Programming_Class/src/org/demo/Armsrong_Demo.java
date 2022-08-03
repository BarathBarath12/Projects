package org.demo;

public class Armsrong_Demo {
	public static void main(String[] args) {
		int i = 371;
		int b = i;
		int rec = 0;
		int value = 0;
		while (b > 0) {
			rec = b % 10;
			value = value + rec * rec * rec;
			b = b / 10;

		}
		if (value == i) {
			System.out.println("Armstrong program");
			
		}
		else {
			System.out.println("Invalid armstrong");
		}
	}

}
