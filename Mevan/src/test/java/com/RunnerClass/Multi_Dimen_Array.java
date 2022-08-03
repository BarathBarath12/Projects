package com.RunnerClass;

public class Multi_Dimen_Array {
	public static void main(String[] args) {
		String name[][] = { { "Starc", "Mic", "chal" },

				{ "Barath", "Kumar", "arun" }, { "India", "TamilNadu", "chennai" } };
		System.out.println(name[0][1]);
		System.out.println(name.length);
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name.length; j++) {

				System.out.print(name[i][0] + " ");
				break;
			}

			

		}
	}
}