package org.demo;

public class Palindrome {
	public static void main(String[] args) {
		String a = "keek";
		String reverse = "";
		for (int i = a.length()-1; i >=0; i--) {
			reverse = reverse + a.charAt(i);
		}
			if (reverse.equals(a)) {
				System.out.println("its palindrome");
				
			}
			else {
				System.out.println("No its not palindrome");
			}
		}
	}

