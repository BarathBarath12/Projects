package org.demo;

public class Amstrong {
	public static void main(String[] args) {
		int a = 153;
		int number = a;
		int rem,value = 0;
while (number>0) {
	rem = number%10;
	value = value + rem*rem*rem;
	number = number/10;
}
if (value==a) {
	System.out.println("its armstrong");
}
else {
	System.out.println("no its not armstrong number");
}
	}
}
