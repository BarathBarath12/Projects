package org.demo;

public class Reverse_String {
public static void main(String[] args) {
	String a = "barath Kumar";
	String reverse ="";
	for (int i = a.length()-1; i>=0; i--) {
		reverse = reverse+a.charAt(i);
		
	}
	System.out.println(reverse);
}
}
